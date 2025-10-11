<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<div class="nmap-top">
    <nav class="navbar navbar-expand-lg">
        <div class="container-fluid">
            <a class="navbar-brand d-flex" href="#">
                <img class="nmap-logo" src="${pageContext.request.contextPath}/static/images/logo.png" alt="Logo">
                <div class="nmap-title">
                    <span class="nmap-maintitle">대한민국육군</span>
                    <span class="nmap-subtitle">Republic Of Korea Army</span>
                </div>
            </a>
            <div class="collapse d-flex justify-content-end">
                <%--<ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="#">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Link</a>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                            Dropdown
                        </a>
                        <ul class="dropdown-menu">
                            <li><a class="dropdown-item" href="#">Action</a></li>
                            <li><a class="dropdown-item" href="#">Another action</a></li>
                            <li><hr class="dropdown-divider"></li>
                            <li><a class="dropdown-item" href="#">Something else here</a></li>
                        </ul>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link disabled" aria-disabled="true">Disabled</a>
                    </li>
                </ul>--%>
                <div class="d-flex gap-3 ">
                    <a class="header-right-btn" onclick="alert();">
                        <img src="${pageContext.request.contextPath}/static/images/icon/header-btn-bell.svg" width="25" height="25"/>
                    </a>
                    <a class="header-right-btn" onclick="alert();">
                        <img src="${pageContext.request.contextPath}/static/images/icon/header-btn-x.svg" width="25" height="25"/>
                    </a>
                    <a class="header-right-btn" onclick="alert();">
                        <img src="${pageContext.request.contextPath}/static/images/icon/header-btn-minus.svg" width="25" height="25"/>
                    </a>
                    <a class="header-right-btn" onclick="alert();">
                        <img src="${pageContext.request.contextPath}/static/images/icon/header-btn-link.svg" width="25" height="25"/>
                    </a>
                </div>
            </div>
        </div>
    </nav>
</div>