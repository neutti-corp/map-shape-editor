<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<div class="nmap-left d-flex flex-column flex-shrink-0 p-3 text-white">
    <div class="left-menu-list">
        <c:choose>
            <c:when test="${TYPE1 eq 'EVTS'}">
            <div class="left-menu-item active" data-bs-toggle="modal" data-bs-target="#autoRegistModal">
                <img src="${pageContext.request.contextPath}/static/images/icon/menu-auto-regist.svg" width="20" height="20"/>
                <span>무인 차량 등록</span>
            </div>
            <div class="left-menu-item">
                <img src="${pageContext.request.contextPath}/static/images/icon/menu-auto-list.svg" width="20" height="20"/>
                <span>무인 차량 목록</span>
            </div>
            </c:when>
            <c:when test="${TYPE1 eq 'SGVS'}">
            <div class="left-menu-item active">
                <img src="${pageContext.request.contextPath}/static/images/icon/menu-auto-regist.svg" width="20" height="20"/>
                <span>단말기 등록/승인</span>
            </div>
            <div class="left-menu-item">
                <img src="${pageContext.request.contextPath}/static/images/icon/menu-auto-list.svg" width="20" height="20"/>
                <span>경계 영상 목록</span>
            </div>
            </c:when>
        </c:choose>
        <%--<div class="left-menu-item">
            <img src="${pageContext.request.contextPath}/static/images/icon/menu-route-manage.svg" width="20" height="20"/>
            <span>경로 관리</span>
        </div>
        <div class="left-menu-item">
            <img src="${pageContext.request.contextPath}/static/images/icon/menu-system-settings.svg" width="20" height="20"/>
            <span>시스템 설정</span>
        </div>
        <div class="left-menu-item">
            <img src="${pageContext.request.contextPath}/static/images/icon/menu-monitoring.svg" width="20" height="20"/>
            <span>모니터링</span>
        </div>--%>
        <hr>
        <div class="data-area">
            <div class="d-flex mb-2">
                <div class="d-flex gap-1 align-items-center">
                    <img src="${pageContext.request.contextPath}/static/images/icon/menu-weather-sun.svg" width="20" height="20" alt="sun" />
                    <span class="weather-info-text">날씨정보</span>
                </div>
            </div>

            <div class="d-flex flex-column p-1 gap-2 pb-2 bottom-hr">
                <div class="d-flex justify-content-between">
                    <div class="d-flex gap-2 align-items-center">
                        <img src="${pageContext.request.contextPath}/static/images/icon/menu-temperature.svg" width="18" height="18" alt="temperature" />
                        <span class="data-text">온도</span>
                    </div>
                    <div class="data-value">
                        <span>-</span>
                        <span>°C</span>
                    </div>
                </div>

                <div class="d-flex justify-content-between">
                    <div class="d-flex gap-2 align-items-center">
                        <img src="${pageContext.request.contextPath}/static/images/icon/menu-water.svg" width="18" height="18" alt="humidity" />
                        <span class="data-text">습도</span>
                    </div>
                    <div class="data-value">
                        <span>-</span>
                        <span>%</span>
                    </div>
                </div>

                <div class="d-flex justify-content-between">
                    <div class="d-flex gap-2 align-items-center">
                        <img src="${pageContext.request.contextPath}/static/images/icon/menu-wind.svg" width="18" height="18" alt="wind speed" />
                        <span class="data-text">풍속</span>
                    </div>
                    <div class="data-value">
                        <span>-</span>
                        <span>km/h</span>
                    </div>
                </div>

                <div class="d-flex justify-content-between">
                    <div class="d-flex gap-2 align-items-center">
                        <img src="${pageContext.request.contextPath}/static/images/icon/menu-dis.svg" width="18" height="18" alt="visibility" />
                        <span class="data-text">가시거리</span>
                    </div>
                    <div class="data-value">
                        <span>-</span>
                        <span>km</span>
                    </div>
                </div>
            </div>

            <div class="d-flex justify-content-between align-items-center pt-2 px-2">
                <span class="current-weather">현재 날씨</span>
                <img src="${pageContext.request.contextPath}/static/images/icon/menu-weather-sun.svg" width="18" height="18" alt="current weather" />
            </div>
        </div>
        <%--<hr>--%>
        <%--<div class="left-menu-item">
            <img src="${pageContext.request.contextPath}/static/images/icon/menu-deformed-analysis.svg" width="20" height="20"/>
            <span>Deformed Analysis</span>
        </div>
        <div class="left-menu-item">
            <img src="${pageContext.request.contextPath}/static/images/icon/menu-realtime.svg" width="20" height="20"/>
            <span>Real-time</span>
        </div>
        <div class="left-menu-item">
            <img src="${pageContext.request.contextPath}/static/images/icon/menu-analysis.svg" width="20" height="20"/>
            <span>Analysis</span>
        </div>
        <div class="left-menu-item">
            <img src="${pageContext.request.contextPath}/static/images/icon/menu-statistics.svg" width="20" height="20"/>
            <span>통계</span>
        </div>
        <div class="left-menu-item">
            <img src="${pageContext.request.contextPath}/static/images/icon/menu-admin.svg" width="20" height="20"/>
            <span>관리자</span>
        </div>--%>
    </div>


</div>