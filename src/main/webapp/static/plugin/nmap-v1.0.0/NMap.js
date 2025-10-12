window.N = {}
N.Map = {
    MAIN_MAP : null
}
N.Map.init = function(elemId){
    var map = new ol.Map({
        target: elemId,
        layers: [
            N.Map.Layer.BaseMapLayer
        ],
        view: new ol.View({
            center: ol.proj.fromLonLat([127.127, 37.56]),
            zoom: 10 
        })
    });
    N.Map.MAIN_MAP = map
}
N.Map.logout = function(){
    if(confirm("로그아웃 하시겠습니까?")){
        Toastify({
            text: "⚠️ 플랫폼 구성중입니다.",
            duration: 4000,
            gravity: "bottom",
            position: "center",
            stopOnFocus: true,
            backgroundColor: "#e77c3c", // 경고 색
            className: "toast-warning",
        }).showToast();
    }
}