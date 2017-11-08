// This example adds a search box to a map, using the Google Place Autocomplete
// feature. People can enter geographical searches. The search box will return a
// pick list containing a mix of places and predicted search terms.

// This example requires the Places library. Include the libraries=places
// parameter when you first load the API. For example:
// <script src="https://maps.googleapis.com/maps/api/js?key=YOUR_API_KEY&libraries=places">

function initAutocomplete() {
  var map = new google.maps.Map(document.getElementById('map'), {
    center: {lat: -33.8688, lng: 151.2195},
    zoom: 13,
    mapTypeId: 'roadmap'
  });

  var geocoder = new google.maps.Geocoder();

  // Create the search box and link it to the UI element.
  var input = document.getElementById('pac-input');
  var searchBox = new google.maps.places.SearchBox(input);
  map.controls[google.maps.ControlPosition.TOP_LEFT].push(input);

  // Bias the SearchBox results towards current map's viewport.
  map.addListener('bounds_changed', function() {
    searchBox.setBounds(map.getBounds());
  });
  
  // 按下鼠标获取地理坐标和地址
  map.addListener('mousedown', function(event) {
    $("#dis_x").val(event.latLng.lng());
    $("#dis_y").val(event.latLng.lat());
    geocoder.geocode({
      'latLng' : event.latLng
    }, function(results, status) {
      if (status == google.maps.GeocoderStatus.OK){
        if(results[0]){
          console.log(results);
          $("#dis_place").val(results[0].formatted_address);
        }
      } else {
         console.log("错误: 可能达到GoogleMaps地址编码API请求今日2500次限额");
      }
    });
  });

  var markers = [];
  // Listen for the event fired when the user selects a prediction and retrieve
  // more details for that place.
  searchBox.addListener('places_changed', function() {
    var places = searchBox.getPlaces();

    if (places.length == 0) {
      return;
    }

    // Clear out the old markers.
    markers.forEach(function(marker) {
      marker.setMap(null);
    });
    markers = [];

    // For each place, get the icon, name and location.
    var bounds = new google.maps.LatLngBounds();
    places.forEach(function(place) {
      if (!place.geometry) {
        console.log("Returned place contains no geometry");
        return;
      }
      var icon = {
        url: place.icon,
        size: new google.maps.Size(71, 71),
        origin: new google.maps.Point(0, 0),
        anchor: new google.maps.Point(17, 34),
        scaledSize: new google.maps.Size(25, 25)
      };

      // Create a marker for each place.
      markers.push(new google.maps.Marker({
        map: map,
        icon: icon,
        title: place.name,
        position: place.geometry.location
      }));

      if (place.geometry.viewport) {
        // Only geocodes have viewport.
        bounds.union(place.geometry.viewport);
      } else {
        bounds.extend(place.geometry.location);
      }
    });
    map.fitBounds(bounds);
  });
}

function add_discrption(){
  var user_id = $("#dis_user_id").val();
  var x = $("#dis_x").val();
  var y = $("#dis_y").val();
  var place = $("#dis_place").val();
  var content = $("#dis_content").val();
  var movie = $("#dis_movie").val();
  var visible = $("#dis_visible").val();
  var thoughts = $("#dis_thoughts").val();
  var tags = $("#dis_tags").val();
  $.ajax({
    url : "add_discription.action",
    type : "POST",
    data : {
        user_id,
        x, 
        y,
        place,
        content,
        movie,
        visible,
        thoughts,
        tags,
    },
    success : function() {
      console.log("添加成功");
    },
    error : function() {
      console.log("添加失败");
    }
  })
}