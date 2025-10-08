window.N = {}
N.Map = {}
N.Map.init = function(elemId){
    var map = new ol.Map({
        target: elemId,
        layers: [
            new ol.layer.Tile({
                source: new ol.source.OSM()
            })
        ],
        view: new ol.View({
            center: ol.proj.fromLonLat([127.127, 37.56]),
            zoom: 10 
        })
    });
}