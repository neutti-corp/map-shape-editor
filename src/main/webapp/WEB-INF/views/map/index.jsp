<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<div id="map"></div>
<%@include file="part/map-top.jsp"%>
<%@include file="part/map-left.jsp"%>
<%@include file="part/map-right.jsp"%>
<%@include file="modal/map-base-modal.jsp"%>
<script>
    N.Map.init("map")
</script>
