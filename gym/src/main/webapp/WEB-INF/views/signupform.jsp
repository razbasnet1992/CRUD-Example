<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<body>
	
 <h1>Add New Member</h1>  
      <form name='member' action="<c:url value='/member'/>" method='POST'>  
        <table >    
        <tr>  
        <td>ID:</td>    
        <td><input type='text' name='id' value=''></td> 
         </tr>   
        <tr>  
        <td>First Name:</td>    
        <td><input type='text' name='firstName' value=''></td> 
         </tr>   
         <tr>    
          <td>Last Name: </td>   
          <td><input type = 'text' name = 'lastName' value = ''></td>
         </tr>    
         <tr>    
          <td>Date of Birth: :</td>    
         <td><input type = 'text' name = 'dob' value = ''></td>  
         </tr>   
         <tr>    
          <td>Location :</td>    
          <td><input type = 'text' name = 'location' value = ''></td>
         </tr>   
           
          <tr>    
            
		   <td><input type="submit" value="SAVE" /></td> 
		    </tr>    
		    </table>
	    </form> 
	    </body>  
	   <html>