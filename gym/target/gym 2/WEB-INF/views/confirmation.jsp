<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<html>
<head>
<meta charset="UTF-8">
<title>Confirmation Page</title>
</head>
<body>

<p>Are you sure you want to delete</p>
<a href="<c:url value='/delete/${id}' />">YES</a>
<a href="<c:url value='/viewmembers' />">NO</a>

</body>

</html>