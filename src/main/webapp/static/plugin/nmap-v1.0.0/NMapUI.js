N.Map.UI = {}
N.Map.UI.toggleRight = function() {
    var r = jQuery(".nmap-right").css('right')
    var w = jQuery(".nmap-right").width()
    if(r === '0px'){
        jQuery(".nmap-right").animate({ right: "-"+w+"px" }, 300);
        jQuery(".nmap-basemap").animate({ right: "10px" }, 300);
    }else{
        jQuery(".nmap-right").animate({ right: "0px" }, 300);
        jQuery(".nmap-basemap").animate({ right: "333px" }, 300);
    }

}