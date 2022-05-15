<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="bootstrap4/css/bootstrap.min.css">
</head>
<body>
<h1>
Liste des Etudiants
</h1>
<p><a href="Pre_Ajout">Ajouter un étudiant</a></p>
<table border="1">
<c:forEach items="${etds}" var="et">
<tr> 
<td>${et.nom}</td>
  <td><a href="Del?id=${et.id}">Supprimer</a></td>
   </tr>
</c:forEach>
</table>
</body>
</html>