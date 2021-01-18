<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  <html>
  
   <body>
        <h1>Edit Member</h1>  
       <form name='member' action="<c:url value='/edit'/>" method='POST'>    
		<table >    
		        <tr>  
		        <td>ID</td>    
		        <td><input type='text' name='id' value='${memberInfo.id}'></td> 
		         </tr>   
		         <tr>    
		          <td>First Name: </td>   
		          <td><input type = 'text' name = 'firstName' value = '${memberInfo.firstName}'></td>
		         </tr>    
		         <tr>    
		          <td>Last Name :</td>    
		         <td><input type = 'text' name = 'lastName' value = '${memberInfo.lastName}'></td>  
		         </tr>   
		         <tr>    
		          <td>Date Of Birth :</td>    
		          <td><input type = 'date' name = 'dob' value = '${memberInfo.dob}'></td>
		         </tr>
		         <tr>  
		         <td>Location :</td>    
		          <td><input type = 'text' name = 'location' value = '${memberInfo.location}'></td>
		         </tr>  
           
		         <tr>    
		          <td><input type="submit" value="UPDATE"/></td>    
		         </tr>    
		        </table>
	    </form> 
	    </body>  
	   <html>