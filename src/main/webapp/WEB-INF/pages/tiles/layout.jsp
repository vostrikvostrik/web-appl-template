<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en"><head>
    <meta charset="utf-8">
    <title>Empty project</title>

    <link rel="shortcut icon" href="<%=request.getContextPath()%>/resources/img/favicon.png" type="image/png">
    <link href="<%=request.getContextPath()%>/resources/css/styles.css" rel="stylesheet">
    <link href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="<%=request.getContextPath()%>/resources/css/bootstrap-datetimepicker.min.css" rel="stylesheet">
    <script src="<%=request.getContextPath()%>/resources/js/jquery-2.1.4.min.js"></script>
    <script src="<%=request.getContextPath()%>/resources/js/moment.js"></script>
    <script src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>
    <script src="<%=request.getContextPath()%>/resources/js/bootstrap-datetimepicker.js"></script>
    <script src="<%=request.getContextPath()%>/resources/js/blockui.js"></script>
    <script src="<%=request.getContextPath()%>/resources/js/scripts.js"></script>
</head>

<tiles:importAttribute name="selected" scope="request" />
<body>
<div id="wrap">
    <%=request.getContextPath()%>
    <a href="<%=request.getContextPath()%>/resources/js/scripts.js">test</a>
    <tiles:insertAttribute name="topMenu"/>
    <div class="container">
        <c:if test="${currentUser!=null}">
            <div class="row">
                <div class="span12 text-right">
                    <span class="label label-info"><i class="icon-user icon-white"></i> ${currentUser.userName}</span> <a href="<%=request.getContextPath()%>/logout">выйти</a>
                </div>
            </div>
        </c:if>
        <c:if test="${message!=null}">
            <div class="row">
                <div class="span12">
                    <br/>
                    <div class="alert alert-info">
                            Main message from controller: ${message}
                    </div>
                </div>
            </div>
        </c:if>
        <div class="row">
            <div class="span12">
                <tiles:insertAttribute name="subMenu"/>
            </div>
        </div>
        <tiles:insertAttribute name="content" />

        <div id="popupWrapper" class="modal hide fade">
            <div class="modal-header" style="background: #fcfcfc">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h3 id="popupHeader"></h3>
            </div>
            <div id="popupContent" class="modal-body">
                <%--<div>--%>
            </div>
            <div class="modal-footer">
                <a href="javascript:void(0);" class="btn" data-dismiss="modal" onclick="utils.cleanPopup();">Отмена</a>
                <a href="javascript:void(0);" id="nextProcess" class="btn btn-success">Продолжить >></a>
            </div>
        </div>
    </div>

<div id="push"></div>
</div>


<div id="footer">
    <div class="container">
        <p class="muted credit text-center">
            E. Vostrikova @ 2015
        </p>
    </div>
</div>


</body></html>