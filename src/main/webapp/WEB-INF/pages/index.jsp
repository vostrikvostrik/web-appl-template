<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: EVostrikova
  Date: 27.08.15
  Time: 12:19
  To change this template use File | Settings | File Templates.
--%>


<div class="container">
    <div class="form-group">
        <label for="noteText">Enter note</label>
        <input class="form-control" id="noteText" type="text">
        <button type="button" class="btn btn-default" onclick="callGenerator()">Generate</button>
    </div>
    <div class="form-group">
        <label for="newNote">new Note</label>
        <input class="form-control" id="newNote" type="text">
    </div>
    <div class="form-group">
        <label for="link">Try it:</label>
        <div id="link"/>
    </div>
</div>
<div class="container">

    <table class="table">
        <thead>
        <tr>
            <th>note text</th>
            <th>note date</th>
            <th>note user</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${tableList}" var="item" >
            <tr>
                <td>${item.noteText}</td>
                <td><a href="${item.noteDate}">${item.noteDate}</a></td>
                <td><%=request.getContextPath()%>${item.noteMemberId}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

</div>
<script>
    function callGenerator() {
        $.ajax({
            type: 'POST',
            url: 'generate',
            async:  true,
            data:   {'noteText': $('#noteText').val()},
            datatype: 'json',
            traditional: true,
            success: function(data) {
                //alert("Успешное выполнение");
                //alert("data=" + data);
                $('#newNote').val(data);
                $('#link').empty();
                $('#link').append("<a href='<%=request.getContextPath() %>"+data+"'>"+data+"</a>")
            }
        });
    }

</script>

