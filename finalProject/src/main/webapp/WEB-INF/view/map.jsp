<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>구글 맵</title>
</head>
 
<body>
<script type="text/javascript"
    src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCkbSCFTom7QTLVs2dP6peOebS78MmjfB0 ">
</script>
<script>
function initialize() {
    var mapOptions = {
    center: { lat: 37.485795 , lng: 126.995637},
    zoom: 18,
    scrollwheel : false
    };
    var map = new google.maps.Map(document.getElementById('map-canvas'), mapOptions);
      
    var marker = new google.maps.Marker({ map: map, position: map.getCenter() });
    var infowindow = new google.maps.InfoWindow();
    infowindow.setContent('우리집');
    infowindow.open(map, marker);
    google.maps.event.addListener(marker, 'click', function() {
        infowindow.open(map, marker);
    }); 
}
google.maps.event.addDomListener(window, 'load', initialize);
</script>
<div id="map-canvas" style="height: 500px;"></div>
</body>
</html>