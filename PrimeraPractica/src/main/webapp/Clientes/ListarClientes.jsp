<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<%@ page import="com.examenes.primerapractica.beans.Cliente"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listado de clientes</title>
</head>
<body>
<%
String url = "http://localhost:8080/PrimeraPractica/";
%>
	<a href="Clientes/NuevoCliente.jsp">Nuevo Cliente</a>
	<table border="1" style="">
		<caption>Listado de clientes</caption>
		<thead>
			<tr>
				<th>Nombres</th>
				<th>Apellidos</th>
				<th>DNI</th>
				<th>Fecha de nacimiento</th>
				<th>Direccion</th>
				<th>Operaciones de Mantenimiento</th>
			</tr>
		</thead>
		<tbody>
			<%
			List<Cliente> Lista_Clientes = (List<Cliente>) request.getAttribute("ListaClientes");
			if (Lista_Clientes != null) {
				for (Cliente clienti : Lista_Clientes) {
			%>
			<tr>
				<td><%=clienti.getNombres() %></td>
				<td><%=clienti.getApellidos() %></td>
				<td><%=clienti.getDNI() %></td>
				<td><%=clienti.getFechaDeNacimiento() %></td>
				<td><%=clienti.getDireccion() %></td>
				<td>
				</td>
			</tr>
			<%
				}
			}
			%>

		</tbody>
	</table>
</body>
</html>