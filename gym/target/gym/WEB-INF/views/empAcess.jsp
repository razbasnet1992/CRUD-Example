<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Force Fitness Members Access</title>
</head>
<style>
body {
	background-color: violet;
}
</style>
<body>
	<h1>Gym Members Info</h1>

	<a href="<c:url value='/member'/>">Add New Member</a><br>
	<a href="<c:url value='/viewmembers'/>"><strong>View All
			Members</strong></a>
	<a href="<c:url value = '/new'/>">Sign Up</a>
</body>
</html>
