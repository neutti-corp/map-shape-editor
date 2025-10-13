<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <title>${SYSTEM_TITLE}</title>
    <link rel="icon" href="${pageContext.request.contextPath}/static/favicon/${fn:toLowerCase(TYPE1)}/favicon.ico" type="image/x-icon">
    <link rel="icon" href="${pageContext.request.contextPath}/static/favicon/${fn:toLowerCase(TYPE1)}/favicon-16x16.png" type="image/x-icon" sizes="16x16">
    <link rel="icon" href="${pageContext.request.contextPath}/static/favicon/${fn:toLowerCase(TYPE1)}/favicon-32x32.png" type="image/png" sizes="32x32">
    <link rel="icon" href="${pageContext.request.contextPath}/static/favicon/${fn:toLowerCase(TYPE1)}/android-chrome-192x192.png" type="image/png" sizes="192x192">
    <link rel="icon" href="${pageContext.request.contextPath}/static/favicon/${fn:toLowerCase(TYPE1)}/android-chrome-512x512.png" type="image/png" sizes="512x512">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="user-scalable=yes, initial-scale=1, maximum-scale=1, minimum-scale=1, width=device-width">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/plugin/ol-v10.6.0/ol.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/plugin/nmap-v1.0.0/NMap.css">
    <link href="${pageContext.request.contextPath}/static/plugin/bootstrap-v5.3.8/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/plugin/toastity/toastify.min.css" />
    <script src="${pageContext.request.contextPath}/static/plugin/toastity/toastify-js.js" ></script>
    <script src="${pageContext.request.contextPath}/static/plugin/jquery-3.7.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/plugin/ol-v10.6.0/ol.js"></script>
    <script src="${pageContext.request.contextPath}/static/plugin/pro4j.js"></script>
    <script src="${pageContext.request.contextPath}/static/plugin/bootstrap-v5.3.8/js/bootstrap.bundle.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/plugin/nmap-v1.0.0/NMap.js"></script>
    <script src="${pageContext.request.contextPath}/static/plugin/nmap-v1.0.0/NMapProj.js"></script>
    <script src="${pageContext.request.contextPath}/static/plugin/nmap-v1.0.0/NMapHelper.js"></script>
    <script src="${pageContext.request.contextPath}/static/plugin/nmap-v1.0.0/NMapLayer.js"></script>
    <script src="${pageContext.request.contextPath}/static/plugin/nmap-v1.0.0/NMapUI.js"></script>
    <link href="${pageContext.request.contextPath}/static/css/views.css" rel="stylesheet">
    <script src="${pageContext.request.contextPath}/static/js/views.js"></script>

    <style type="text/css">
        body {
            margin: 0;
            padding: 0;
            /*font-size: 0.9em;*/
        }
    </style>
    <script type="text/javascript">

    </script>
</head>
<body class="SYSTEM-${TYPE1}">
<tiles:insertAttribute name="body"/>
</body>
