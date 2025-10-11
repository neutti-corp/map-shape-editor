<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<div id="map">

</div>
<%@include file="part/map-top.jsp"%>
<%@include file="part/map-left.jsp"%>
<%@include file="part/map-right.jsp"%>
<div class="btn-group nmap-basemap" role="group" aria-label="Basic outlined example">
    <button type="button" class="btn active">일반지도</button>
    <button type="button" class="btn">영상지도</button>
</div>
<%@include file="modal/map-base-modal.jsp"%>
<%@include file="modal/map-alert-modal.jsp"%>
<script>

    N.Map.init("map")

    document.addEventListener('DOMContentLoaded', function () {
        const modalEl = document.getElementById('autoRegistModal');
        if (!modalEl) return;
        const modal = bootstrap.Modal.getOrCreateInstance(modalEl, {
            backdrop: 'static', // 필요 시: 바깥 클릭 방지
            keyboard: false     // 필요 시: ESC 방지
        });
        //modal.show();
    });
</script>
