<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <title>지도</title>
    <link rel="icon" href="${pageContext.request.contextPath}/favicon.ico" type="image/x-icon">
    <link rel="icon" href="${pageContext.request.contextPath}/favicon-16x16.png" type="image/x-icon" sizes="16x16">
    <link rel="icon" href="${pageContext.request.contextPath}/favicon-32x32.png" type="image/png" sizes="32x32">
    <link rel="icon" href="${pageContext.request.contextPath}/android-chrome-192x192.png" type="image/png" sizes="192x192">
    <link rel="icon" href="${pageContext.request.contextPath}/android-chrome-512x512.png" type="image/png" sizes="512x512">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="user-scalable=yes, initial-scale=1, maximum-scale=1, minimum-scale=1, width=device-width">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/plugin/ol-v10.6.0/ol.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/plugin/nmap-v1.0.0/NMap.css">
    <link href="${pageContext.request.contextPath}/static/plugin/bootstrap-v5.3.8/css/bootstrap.min.css" rel="stylesheet">
    <script src="${pageContext.request.contextPath}/static/plugin/ol-v10.6.0/ol.js"></script>
    <script src="${pageContext.request.contextPath}/static/plugin/bootstrap-v5.3.8/js/bootstrap.bundle.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/plugin/nmap-v1.0.0/NMap.js"></script>
    <script src="${pageContext.request.contextPath}/static/plugin/nmap-v1.0.0/NMapLayer.js"></script>

    <link href="${pageContext.request.contextPath}/static/css/views.css" rel="stylesheet">
    <script src="${pageContext.request.contextPath}/static/js/views.js"></script>

    <style type="text/css">
        body {
            margin: 0;
            padding: 0;
            /*font-size: 0.9em;*/
        }
    </style>
</head>
<body>
<tiles:insertAttribute name="body"/>
</body>
