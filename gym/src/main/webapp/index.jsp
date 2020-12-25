<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring 4 MVC - HelloWorld Index Page</title>
<style>
body {
  background-color: sky blue; 
}
</style>
<body>
	<h1>Welcome to Force Fitness club</h1>
	<p> To find a job  in NY please click this link. 
<a href="https://www.ny.gov/services/find-job-new-york-state-government">job link</a>
</p>
	<form action="<c:url value='/login'/>" method='POST'>
	  <label>Username:</label>
		 <input type="text" name="username"><br>
		<label>Password:</label>
			<input type="password" name="password"><br> 
			<input type="submit" value="Enter" />
	</form>
</body>
</html>
