<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<nav class="navbar navbar-inverse" role="navigation">
    <div class="navbar-inner">
        <div class="container">
            <div class="nav-collapse collapse">
                <a class="brand" href="<%=request.getContextPath()%>/"><b>Project</b>Name</a>
                <%--<ul class="nav">
                    <li>1</li></br>
                    <li>2</li>
                </ul>--%>
            </div>
        </div>
    </div>
</nav>

<script type="text/javascript">
    $(document).ready(function(){
        $('.tooltipMe').tooltip({placement:'bottom'});
    });
</script>