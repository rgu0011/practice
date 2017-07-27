<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
   <head>
      <title>Spring MVC Form Handling</title>
   </head>

   <body>
      <h2>Submitted Student Information</h2>
      <table>
         <tr>
            <td>Name</td>
            <td>${profile.name}</td>
         </tr>
         <tr>
            <td>Age</td>
            <td>${profile.age}</td>
         </tr>
         <tr>
            <td>ID</td>
            <td>${profile.id}</td>
         </tr>
         
         <tr>
            <td>Gender</td>
            <td>${profile.gender}</td>
         </tr>
         
         
         
      </table>  
   </body>
   
</html>