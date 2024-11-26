<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Nuevo cliente</title>
</head>
<body>
<%
String url = "http://localhost:8080/PrimeraPractica/";
%>
	<form action="<%=url%>ClientesController" method = "post">
	
	<input type="hidden" name="op" value = "nuevo">
	
	<label for="nombre">Nombre:</label>
	<input type="text" id="nombres" name="nombres" required><br>
	
	<label for="apellidos">Apellidos:</label>
	<input type="text" id="apellidos" name="apellidos" required><br>
	
	<label for="dni">DNI:</label>
	<input type="text" id="dni" name="dni" required><br>
	
	<label for="fechanacimiento">Fecha de nacimiento:</label>
	<input type="text" id="fechanacimiento" name="fechanacimiento" required><br>
	
	<label for="direccion">Direccion:</label>
	<input type="text" id="direccion" name="direccion" required><br>
	
	<input type="submit" value="Guardar"><br>

	</form>
	<a href="<%=url%>ClientesController">Volver</a>
</body>
</html>