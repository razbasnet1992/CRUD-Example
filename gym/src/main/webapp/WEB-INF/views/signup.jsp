<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<body>
	<table>
		<tr>
			<td>ID</td>
			
		</tr>
		<tr>
			<td>First Name:</td>
			<td><input type='text' name='name'
				value='${user.name}'></td>
		</tr>
		<tr>
			<td>UserName :</td>
			<td><input type='text' name='username'
				value='${user.username}'></td>
		</tr>
		<tr>
			<td>Date:</td>
			<td><input type='date' name='date' value='${user.date}'></td>
		</tr>
		<tr>
			<td>Gender :</td>
			<td><input type='text' name='gender' value='${user.gender}'></td>
		</tr>
		<tr>
			<td>Hobbies :</td>
			<td><input type='text' name='hobbies' value='${user.hobbies}'></td>
		</tr>

		<tr>
			<td><input type="submit" value="UPDATE" /></td>
		</tr>
	</table>
<body>

</body>
</html>