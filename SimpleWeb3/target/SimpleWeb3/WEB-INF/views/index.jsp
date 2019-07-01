<%@ page contentType="text/html; charset=UTF-8" language="java"%>
<%@ page isELIgnored="false" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.example7.spring.model.ToDoStatus" %>


<h1>${message}</h1>
<p><a href="/SimpleWeb3/newTodo">추가</a> </p>


<table style="width: 30%;">

    <thead>
    <tr>
        <td>id</td>
        <td>title</td>
        <td>status</td>
    </tr>
    </thead>
    <tbody>
    <c:choose>
        <c:when test="${todos.size()>0}">
            <c:forEach var="todo" items="${todos}">
                <tr>
                    <td>
                        <a href = "view?id=${todo.id}"><c:out value="${todo.id}"/></a>
                    </td>
                    <td><c:out value="${todo.title}"/> </td>
                    <td><c:out value="${todo.status}"/> </td>
                </tr>
            </c:forEach>
        </c:when>
        <c:otherwise>
            <tr>
                <td colspan="3">Empty todos</td>
            </tr>
        </c:otherwise>
    </c:choose>

    </tbody>
</table>



