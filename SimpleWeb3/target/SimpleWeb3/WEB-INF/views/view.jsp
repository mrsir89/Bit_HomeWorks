<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>

<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page import="com.example7.spring.model.ToDoStatus" %>


<c:out value="${todo.id}"/><br/>
<c:out value="${todo.title}"/><br/>
<c:out value="${todo.description}"/><br/>
<c:out value="${todo.status}"/><br/>



