N.Map.Helper = {}
N.Map.Helper.generateUUID = function() {
    return 'xxxxxxxx-xxxx-4xxx-yxxx-xxxxxxxxxxxx'.replace(/[xy]/g, function(c) {
        var r = Math.random() * 16 | 0, v = c === 'x' ? r : (r & 0x3 | 0x8);
        return v.toString(16);
    });
}
N.Map.Helper.changeBasemap = function(tileName){
    var tileNames = [
        "korean_map",
        "color_map",
        "lowV_map",
        "english_map",
        "white_map",
        "chinese_map",
        "japanese_map",
        "white_edu_map",
        "base_hd","satellite_map","night_map", "AIRPHOTO"
    ]
    if(tileNames.indexOf(tileName) > -1){
        var layer = N.Map.Layer.BaseMapLayer
        var current = layer.getSource().layer_
        if(current === tileName){
            // pass
        }else{
            var newSource = N.Map.Layer.BaseMapSource(tileName);
            layer.setSource(newSource);
            layer.getSource().refresh()
        }
    }else{
        console.warn("알수없는 " + tileName + "입니다.")
    }
}
//37.047577, 127.874565
//37.013199, 127.908331
//ol.proj.transformExtent([129.400033,35.956598,129.438228,35.997163],'EPSG:4326','EPSG:5179')
//ol.proj.transformExtent([128.660685,35.275169,128.660685,35.290910],'EPSG:4326','EPSG:5179')
//ol.proj.transformExtent([128.874565,37.013199,128.908331,37.047577],'EPSG:4326','EPSG:5179')
N.Map.Helper.openFullScreen = function(){
    const elem = document.documentElement;
    if (elem.requestFullscreen) {
        elem.requestFullscreen();
    } else if (elem.mozRequestFullScreen) { // Firefox
        elem.mozRequestFullScreen();
    } else if (elem.webkitRequestFullscreen) { // Chrome, Safari
        elem.webkitRequestFullscreen();
    } else if (elem.msRequestFullscreen) { // IE/Edge
        elem.msRequestFullscreen();
    }
}