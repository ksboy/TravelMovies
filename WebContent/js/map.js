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
}