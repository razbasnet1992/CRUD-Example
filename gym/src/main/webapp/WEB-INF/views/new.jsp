<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
	<body>
		<form  action ="<c:url value ='/signup'/>" method ='POST'>
		 
		<label>Name</label>
		<input type = "text" name = "name"><br>
		<label>Username</label>
		<input type = "email" name = "username"><br>
		
		<!--  <label>Date</label>
		<input type = "date" name = "date"><br>-->
		
		<label>Gender</label>
		<input type = "radio" name = "gender" value ="Male">Male
		<input type = "radio" name = "gender" value ="Female">Female
	
	<div>
		<label>Hobbies:</label><br>
		<input type ="checkbox" name ="hobbies" value ="Reading">Reading<br>
		
		<input type ="checkbox" name ="hobbies" value ="Playing">Playing<br>
	</div>
	<div>
		<label>Nationality:</label>
		<select name = "nationality">
		<option value = "Nepali">Nepali</option>
		<option value = "Indian">Indian</option>
		<option value = "French">French</option>
		</select>
	</div>
	<div>
	<label>Comments:</label><br>
	<textarea name = "commennts" rows = "10" cols = "20">
	</textarea>
	</div>
	<input type ="submit" value = "Submit">
	
</form>
	</body>
</html>