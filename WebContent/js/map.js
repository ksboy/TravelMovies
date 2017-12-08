var markers = [];
var map;
var geocoder;
var add_dis_listen_id;
var infowindow;
var poly;

function read_route() {
  $.ajax({
      url : "read_route.action",
      type : "POST",
      data : {
    	  
      },
      success : function(data) {
        dis = JSON.parse(data);
        var list = $("#read_in_route");
        for(var i = 0; i < dis.dis.length; i++){
          var html = '<a href="#" onclick="display_route('+dis.dis[i].route_id+')"class="mdc-list-item" data-mdc-auto-init="MDCRipple" id="Route'+dis.dis[i].route_id+'" tabindex="0"> 用户ID:'+dis.dis[i].user_id+' 描述: '+ dis.dis[i].des +'</a>';
          list.append(html);
        }
      },
      error : function() {
        SnackbarMsg("读取描述失败");
      }
    })
}

function display_route(route_id){
	$.ajax({
	    url : "display_route.action",
	    type : "POST",
	    data : {
	    	route_id
	    },
	    success : function(data) {
	      dis = JSON.parse(data);
        // Clear out the old markers.
        markers.forEach(function(marker) {
          marker.setMap(null);
        });
        markers = [];
        try{
          poly.setMap(null);
        }catch(err){
          
        }
        poly = new google.maps.Polyline({
          strokeColor: '#000000',
          strokeOpacity: 1.0,
          strokeWeight: 3
        });
        
        var sharetext = "我分享了一个旅行路线，大家快来围观: ";
	      for(var i = 0; i < dis.dis.length; i++){
	        // Create a marker for each place.
          var polypath = poly.getPath();
          polypath.push(new google.maps.LatLng(dis.dis[i].y*1, dis.dis[i].x*1));
          
	        var marker = new google.maps.Marker({
	          map: map,
	          position: {lat: dis.dis[i].y*1, lng: dis.dis[i].x*1},
	          title: dis.dis[i].place,
	        });
	
	        markers.push(marker);
	
	        var contentString = "<ul> <li> 条目号："+
          dis.dis[i].item_id + "</li> <li>情节：" +
          dis.dis[i].content + "</li> <li>电影名：" +
          dis.dis[i].movie + "</li> <li>地名：" +
          dis.dis[i].place + "</li> <li>标签：" +
          dis.dis[i].tags + "</li> <li>感想：" +
          dis.dis[i].thoughts + "</li> <li>用户id：" +
          dis.dis[i].user_id + " </li> </ul>";
	        
	        sharetext += i + " " + dis.dis[i].place + " ";
	        
	        google.maps.event.addListener(marker, 'click', (function(marker, contentString, infowindow){
	          return function(){
	            infowindow.setContent(contentString);
	            infowindow.open(map, marker);
	          };
	        })(marker, contentString, infowindow));
	      }
	      poly.setMap(map);
	      document.getElementById("weiboshare").getElementsByClassName('iframe')[0].src = "http://widget.weibo.com/staticjs/weibosharev2.html?url=http%3A%2F%2Fopen.weibo.com%2Fsharebutton&amp;type=button&amp;language=zh_cn&amp;title="+sharetext+"&amp;searchPic=true&amp;style=number";
	    },
	    error : function() {
	      SnackbarMsg("读取描述失败");
	    }
	  })
}

function add_discription_listener(event){
  // Clear out the old markers.
  markers.forEach(function(marker) {
    marker.setMap(null);
  });
  markers = [];
  // Create a marker for each place.
  markers.push(new google.maps.Marker({
    map: map,
    position: event.latLng
  }));

  markers.forEach(function(marker) {
    marker.setMap(map);
  });

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
}

function add_discription_mode(){
  // 按下鼠标获取地理坐标和地址
  add_dis_listen_id = map.addListener('mousedown', add_discription_listener, false);
}

function exit_discription_mode(){
  try{
    add_dis_listen_id.remove();
  } catch(err){

  }
}

function initAutocomplete() {
  map = new google.maps.Map(document.getElementById('map'), {
    center: {lat: -33.8688, lng: 151.2195},
    zoom: 13,
    mapTypeId: 'roadmap'
  });

  infowindow = new google.maps.InfoWindow(); 
  geocoder = new google.maps.Geocoder();
  // Create the search box and link it to the UI element.
  var input = document.getElementById('pac-input');
  var searchBox = new google.maps.places.SearchBox(input);
  map.controls[google.maps.ControlPosition.TOP_LEFT].push(input);

  // Bias the SearchBox results towards current map's viewport.
  map.addListener('bounds_changed', function() {
    searchBox.setBounds(map.getBounds());
  });


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

function add_discription(){
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
      SnackbarMsg("添加成功");
    },
    error : function() {
      SnackbarMsg("添加失败");
    }
  })
}

function add_route(){
	  var ids = $("#add_route_ids").val();
	  var des = $("#add_route_des").val();
	  $.ajax({
	    url : "add_route.action",
	    type : "POST",
	    data : {
	        ids,
	        des, 
	    },
	    success : function() {
	      SnackbarMsg("添加成功");
	    },
	    error : function() {
	      SnackbarMsg("添加失败");
	    }
	  })
	}

function read_discription_id(){
  var user_id = 1;
  var visible = 1;
  var dis;
  $.ajax({
    url : "read_discription_id.action",
    type : "POST",
    data : {
        user_id,
        visible,
    },
    success : function(data) {
      dis = JSON.parse(data);
      // Clear out the old markers.
      markers.forEach(function(marker) {
        marker.setMap(null);
      });
      markers = [];

      for(var i = 0; i < dis.dis.length; i++){
        // Create a marker for each place.
        var marker = new google.maps.Marker({
          map: map,
          position: {lat: dis.dis[i].y*1, lng: dis.dis[i].x*1},
          title: dis.dis[i].place,
        });

        markers.push(marker);

        var contentString = "<ul> <li> 条目号："+
        dis.dis[i].item_id + "</li> <li>情节：" +
        dis.dis[i].content + "</li> <li>电影名：" +
        dis.dis[i].movie + "</li> <li>地名：" +
        dis.dis[i].place + "</li> <li>标签：" +
        dis.dis[i].tags + "</li> <li>感想：" +
        dis.dis[i].thoughts + "</li> <li>用户id：" +
        dis.dis[i].user_id + " </li> </ul>"+ " </li> </ul>"+"<div class=\"mdc-button mdc-button--primary mdc-ripple-upgraded\" data-mdc-auto-init=\"MDCRipple\" id=\"delete_dis_btn\" onclick=\"delete_discription_id("+ dis.dis[i].item_id +")\">删除</div>";

        google.maps.event.addListener(marker, 'click', (function(marker, contentString, infowindow){
          return function(){
            infowindow.setContent(contentString);
            infowindow.open(map, marker);
          };
        })(marker, contentString, infowindow));
      }

      markers.forEach(function(marker) {
        marker.setMap(map);
      });

      console.log(markers);
      console.log(dis);
    },
    error : function() {
      SnackbarMsg("读取描述失败");
    }
  })
}

function read_discription_id_all(){
	  var user_id = 1;
	  var visible = 1;
	  var dis;
	  $.ajax({
	    url : "read_discription_id_all.action",
	    type : "POST",
	    data : {
	        user_id,
	        visible,
	    },
	    success : function(data) {
	      dis = JSON.parse(data);
	      // Clear out the old markers.
	      markers.forEach(function(marker) {
	        marker.setMap(null);
	      });
	      markers = [];

	      for(var i = 0; i < dis.dis.length; i++){
	        // Create a marker for each place.
	        var marker = new google.maps.Marker({
	          map: map,
	          position: {lat: dis.dis[i].y*1, lng: dis.dis[i].x*1},
	          title: dis.dis[i].place,
	        });

	        markers.push(marker);

	        var contentString = "<ul> <li> 条目号："+
	        dis.dis[i].item_id + "</li> <li>情节：" +
	        dis.dis[i].content + "</li> <li>电影名：" +
	        dis.dis[i].movie + "</li> <li>地名：" +
	        dis.dis[i].place + "</li> <li>标签：" +
	        dis.dis[i].tags + "</li> <li>感想：" +
	        dis.dis[i].thoughts + "</li> <li>用户id：" +
	        dis.dis[i].user_id + " </li> </ul>"+"<div class=\"mdc-button mdc-button--primary mdc-ripple-upgraded\" data-mdc-auto-init=\"MDCRipple\" id=\"delete_dis_btn\" onclick=\"delete_discription_id("+ dis.dis[i].item_id +")\">删除</div>";

	        google.maps.event.addListener(marker, 'click', (function(marker, contentString, infowindow){
	          return function(){
	            infowindow.setContent(contentString);
	            infowindow.open(map, marker);
	          };
	        })(marker, contentString, infowindow));
	      }

	      markers.forEach(function(marker) {
	        marker.setMap(map);
	      });

	      console.log(markers);
	      console.log(dis);
	    },
	    error : function() {
	      SnackbarMsg("读取描述失败");
	    }
	  })
	}

function delete_discription_id(item_id){
  $.ajax({
    url : "delete_discription_id.action",
    type : "POST",
    data : {
        item_id,
    },
    success : function() {
      SnackbarMsg("删除成功");
    },
    error : function() {
      SnackbarMsg("删除失败");
    }
  })
}

function getId(){
$.ajax({
    url : "user_id.action",
    type : "POST",
    data : {
    	
    },
    success : function(data) {
      userid = JSON.parse(data);
      $("#user_id_span").html("User ID: "+ userid.result);
    },
    error : function() {
      
    }
  })	
}

function SnackbarMsg(message){
  var MDCSnackbar = mdc.snackbar.MDCSnackbar;
  var MDCSnackbarFoundation = mdc.snackbar.MDCSnackbarFoundation;
  var snackbar = new MDCSnackbar(document.querySelector('.mdc-snackbar'));
  var data = {
    message
  };
  snackbar.show(data);
}

function searchMovie(movie, ind){
  $.ajax({
    url : "searchmovie.action",
    type : "POST",
    data : {
        movie,
        ind
    },
    success : function(data) {
      dis = JSON.parse(data);
      markers.forEach(function(marker) {
        marker.setMap(null);
      });
      markers = [];

      for(var i = 0; i < dis.dis.length; i++){
        // Create a marker for each place.
        var marker = new google.maps.Marker({
          map: map,
          position: {lat: dis.dis[i].y*1, lng: dis.dis[i].x*1},
          title: dis.dis[i].place,
        });

        markers.push(marker);

        var contentString = "<ul> <li> 条目号："+
        dis.dis[i].item_id + "</li> <li>情节：" +
        dis.dis[i].content + "</li> <li>电影名：" +
        dis.dis[i].movie + "</li> <li>地名：" +
        dis.dis[i].place + "</li> <li>标签：" +
        dis.dis[i].tags + "</li> <li>感想：" +
        dis.dis[i].thoughts + "</li> <li>用户id：" +
        dis.dis[i].user_id + " </li> </ul>" +"<div class=\"mdc-button mdc-button--primary mdc-ripple-upgraded\" data-mdc-auto-init=\"MDCRipple\" id=\"delete_dis_btn\" onclick=\"delete_discription_id("+ dis.dis[i].item_id +")\">删除</div>";

        google.maps.event.addListener(marker, 'click', (function(marker, contentString, infowindow){
          return function(){
            infowindow.setContent(contentString);
            infowindow.open(map, marker);
          };
        })(marker, contentString, infowindow));
      }

      markers.forEach(function(marker) {
        marker.setMap(map);
      });
    },
    error : function() {
      SnackbarMsg("查询失败");
    }
  })
}