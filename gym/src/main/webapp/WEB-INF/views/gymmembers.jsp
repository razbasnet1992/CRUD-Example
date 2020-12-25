<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<center>
<h1><em>Gym Members List</em></h1>
</center>
<div align="center">
        <table border="2" >
	<tr>
	    <th>id</th>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Date of Birth</th>
		<th>Location</th>
		<th>EDIT</th>
		<th>DELETE</th>
	</tr>
	<c:forEach items="${list}" var="member">
		<tr>
		    <td>${member.id}</td>
			<td>${member.firstName}</td>
			<td>${member.lastName}</td>
			<td>${member.dob}</td>
			<td>${member.location}</td>
			<td><a href="<c:url value='/edit/${member.id}' />">EDIT</a></td>
			<td><a href="<c:url value='/confirmation/${member.id}' />">DELETE</a></td>
		</tr>
	</c:forEach>
</table>
</div>
<center>

<a href="<c:url value='/member' />">Add New Employee</a>
</center>
