<%@ page contentType="text/html; charset=UTF-8" language="java"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<h1>추 가 하 기</h1>
<form action ="/addTodo" method="get">
    <label for="title"> title : <input type="text" id="title" name="title" value=""/> </label><br>
    <label for="description">description : </label><br>
    <textarea id="description" name ="description" cols="30" rows="10"></textarea><br>

    <button type="submit">입력</button>
    <button type="button" onclick="history.back()">취소</button>
</form>





