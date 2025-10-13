N.Map.Layer = {}
N.Map.Layer.BaseMapSource = function (tileName) {
    var matrixSet = 'korean'
    var style = 'korean'
    var format = 'image/png'
    var matrixIds = ["L05", "L06", "L07", "L08", "L09", "L10", "L11", "L12", "L13", "L14", "L15", "L16", "L17", "L18", "L19"]
    if (tileName === "AIRPHOTO") {
        matrixSet = 'NGIS_AIR'
        style = '_null'
        format = 'image/jpg'
        matrixIds = ["5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19"]
    }
    return new ol.source.WMTS({
        url: "/proxy/basemap.do?key=" + tileName,
        layer: tileName,
        matrixSet: matrixSet,
        format: format,
        projection: "EPSG:5179",
        maxZoom: 19,
        tileGrid: new ol.tilegrid.WMTS({
            extent: [-200000.0, -3015.4524155292, 3803015.45241553, 4000000.0],
            origin: [-200000.0, 4000000.0],
            tileSize: 256,
            matrixIds: matrixIds,
            resolutions:[2088.96, 1044.48, 522.24, 261.12, 130.56, 65.28, 32.64, 16.32, 8.16, 4.08, 2.04, 1.02, 0.51, 0.255],
        }),
        style: style,
        wrapX: true,
        opacity: 1,
        maxResolution: 2088.96
    })
}
N.Map.Layer.BaseMapLayer = new ol.layer.Tile({
    properties: {layerId: N.Map.Helper.generateUUID()},
    source: N.Map.Layer.BaseMapSource("korean_map"), //AIRPHOTO
    visible: true,
    opacity: 1
})