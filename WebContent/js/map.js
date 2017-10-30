function init(){
  var windowsArr = [];
  var marker = [];
  AMap.plugin(['AMap.Autocomplete','AMap.PlaceSearch'],function(){
    var autoOptions = {
      city: "全国", //城市，默认全国
      input: "keyword"//使用联想输入的input的id
    };
    autocomplete= new AMap.Autocomplete(autoOptions);
    var placeSearch = new AMap.PlaceSearch({
      city:'全国',
      map:map
    })
    AMap.event.addListener(autocomplete, "select", function(e){
     //TODO 针对选中的poi实现自己的功能
     placeSearch.setCity(e.poi.adcode);
     placeSearch.search(e.poi.name)
    });
  });

  var map = new AMap.Map("mapContainer", {
    resizeEnable: true,
    center: [116.40, 39.91],//地图中心点
    zoom: 13,//地图显示的缩放级别
    keyboardEnable: false
  });

  var clickEventListener = map.on('mousedown', function(e) {
    document.getElementById("s-point").innerHTML = e.lnglat.getLng() + ',' + e.lnglat.getLat();
    $("#dis_x").val(e.lnglat.getLng());
    $("#dis_y").val(e.lnglat.getLat());
    mdc.autoInit(document, () => {});
    // marker = new AMap.Marker({
    //     icon: "http://webapi.amap.com/theme/v1.3/markers/n/mark_b.png",
    //     position:[e.lnglat.getLng(),e.lnglat.getLat()]
    // });
    // marker.setMap(map);
  });
}

function add_discrption(){
  var user_id = $("#dis_user_id").val();
  var x = $("#dis_x").val();
  var y = $("#dis_y").val();
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