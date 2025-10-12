N.Map.Proj = {}
N.Map.Proj.init = function(){
    proj4.defs("EPSG:5179",                     "+proj=tmerc +lat_0=38 +lon_0=127.5 +k=0.9996 +x_0=1000000 +y_0=2000000 +ellps=GRS80 +towgs84=0,0,0,0,0,0,0 +units=m +no_defs +type=crs")
    proj4.defs("ITRF_2000_Transverse_Mercator", "+proj=tmerc +lat_0=38 +lon_0=127.5 +k=0.9996 +x_0=1000000 +y_0=2000000 +ellps=GRS80 +units=m +no_defs");
    //proj4.defs("LCC", "+proj=lcc +lat_1=30 +lat_2=60 +lat_0=38 +lon_0=126 +x_0=180 +y_0=540 +a=6371008.77 +b=6371008.77 +units=km +no_defs");
    //proj4.defs("LCC", "+proj=lcc +lat_1=30 +lat_2=60 +lat_0=0 +lon_0=126 +x_0=0 +y_0=0 +ellps=WGS84 +units=m +no_defs");
    //proj4.defs("LCC", "+proj=lcc +lat_1=30 +lat_2=60 +lat_0=38 +lon_0=126 +x_0=180000 +y_0=540000 +a=6371008.77 +b=6371008.77 +ellps=WGS84 +datum=WGS84 +towgs84=0,0,0,0,0,0,0 +units=m +no_defs");
    //proj4.defs("LCC", "+proj=lcc +lat_1=30 +lat_2=60 +lat_0=38 +lon_0=126 +x_0=180000 +y_0=540000 +a=6371008.77 +b=6371008.77 +units=m +no_defs");
    proj4.defs("LCC", "+proj=lcc +lat_1=30 +lat_2=60 +lat_0=38 +lon_0=126 +x_0=180000 +y_0=540000 +a=6371008.77 +b=6371008.77 +units=m +no_defs");
    proj4.defs("LCC_RESOURCE", "+proj=lcc +lat_1=30 +lat_2=60 +lat_0=38 +lon_0=126 +ellps=WGS84 +datum=WGS84 +units=m +no_defs");
    proj4.defs("LCC_FUTURE", "+proj=lcc +lat_1=30 +lat_2=60 +lat_0=38 +lon_0=126 +x_0=154000 +y_0=580000 +a=6371008.77 +b=6371008.77 +units=m +no_def");
    proj4.defs("LCC_SUB", "+proj=lcc +lat_1=30 +lat_2=60 +lat_0=38 +lon_0=126 +x_0=154000 +y_0=580000 +a=6371008.77 +b=6371008.77 +ellps=WGS84 +datum=WGS84 +towgs84=0,0,0,0,0,0,0 +units=m +no_def");


    //"+proj=lcc +lat_1=30 +lat_2=60 +lat_0=38 +lon_0=126 +x_0=154000 +y_0=580000 +a=6371008.77 +b=6371008.77 +ellps=WGS84 +datum=WGS84 +towgs84=0,0,0,0,0,0,0 +units=m +no_def"
    //+proj=lcc +lat_1=30 +lat_2=60 +lat_0=38 +lon_0=126 +x_0=154000 +y_0=580000 +a=6371008.77 +b=6371008.77 +ellps=WGS84 +datum=WGS84 +towgs84=0,0,0,0,0,0,0 +units=m +no_def
    ol.proj.proj4.register(proj4)
    /*
    PROJCS["unknown",
GEOGCS["GCS_unknown",DATUM["D_unknown",
SPHEROID["unknown",6371008.77,0.0]],
PRIMEM["Greenwich",0.0],
UNIT["Degree",0.0174532925199433]],
PROJECTION["Lambert_Conformal_Conic"],
PARAMETER["False_Easting",180000.0],
PARAMETER["False_Northing",540000.0],
PARAMETER["Central_Meridian",126.0],
PARAMETER["Standard_Parallel_1",30.0],
PARAMETER["Standard_Parallel_2",60.0],
PARAMETER["Latitude_Of_Origin",38.0],UNIT["Meter",1.0]]

    defs('EPSG:4326', "+title=WGS 84 (long/lat) +proj=longlat +ellps=WGS84 +datum=WGS84 +units=degrees");
    defs('EPSG:4269', "+title=NAD83 (long/lat) +proj=longlat +a=6378137.0 +b=6356752.31414036 +ellps=GRS80 +datum=NAD83 +units=degrees");
    defs('EPSG:3857', "+title=WGS 84 / Pseudo-Mercator +proj=merc +a=6378137 +b=6378137 +lat_ts=0.0 +lon_0=0.0 +x_0=0.0 +y_0=0 +k=1.0 +units=m +nadgrids=@null +no_defs");
    defs('EPSG:5179', "+proj=tmerc +lat_0=38 +lon_0=127.5 +k=0.9996 +x_0=1000000 +y_0=2000000 +ellps=GRS80 +towgs84=0,0,0,0,0,0,0 +units=m +no_defs");
    defs('EPSG:5181', "+proj=tmerc +lat_0=38 +lon_0=127 +k=1 +x_0=200000 +y_0=500000 +ellps=GRS80 +units=m +no_defs");
    * */
}
N.Map.Proj.init()
