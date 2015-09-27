<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<style type="text/css">
  body {
    padding-top: 40px;
    padding-bottom: 40px;
    background-color: #f5f5f5;
  }

  .form-signin {
    max-width: 300px;
    padding: 19px 29px 29px;
    margin: 0 auto 20px;
    background-color: #fff;
    border: 1px solid #e5e5e5;
    -webkit-border-radius: 5px;
    -moz-border-radius: 5px;
    border-radius: 5px;
    -webkit-box-shadow: 0 1px 2px rgba(0,0,0,.05);
    -moz-box-shadow: 0 1px 2px rgba(0,0,0,.05);
    box-shadow: 0 1px 2px rgba(0,0,0,.05);
    text-align: center;
  }
  .form-signin .form-signin-heading,
  .form-signin .checkbox {
    margin-bottom: 10px;
  }
  .form-signin input[type="text"],
  .form-signin input[type="password"] {
    font-size: 16px;
    height: auto;
    margin-bottom: 15px;
    padding: 7px 9px;
  }

</style>

<form class="form-signin" role="form" action="#" accept-charset="UTF-8" method="POST">
  <c:if test="${not empty param.error}">
    <div class="alert alert-danger">
      Неверное имя пользователя или пароль!
    </div>
  </c:if>
  <h2 class="form-signin-heading">Авторизация</h2>
  <input type="text" class="input-block-level" placeholder="Имя пользователя" required="" autofocus=""  name="j_username">
  <input type="password" class="input-block-level" placeholder="Пароль" required="" name="j_password">
  <br/>
  <button class="btn btn-large btn-primary" type="submit">Войти</button>
</form>


