<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<jsp:include page="menu.jsp" />
	<c:url value="/editar-persona" var="urlEditarPersona" />
	<c:url value="/eliminar-persona" var="urlEliminarPersona" />
	<c:url value="/agregar-persona" var="urlAgregarPersona" />
	<table border="1">
		<tr>
			<th>ID</th>
			<th>Nombre</th>
			<th>Apellido</th>
			<th>Edad</th>
			<th>Dni</th>
		</tr>	
		<c:forEach items="${personas}" var="persona">
			<tr>
				<td>${persona.id}</td>
				<td>${persona.nombre}</td>
				<td>${persona.apellido}</td>
				<td>${persona.edad}</td>
				<td>${persona.dni}</td>
				<td><a href= "${urlEditarPersona}/${persona.id}">Editar</a></td>
				<td><a href="${urlEliminarPersona}/${persona.id}">Eliminar</a></td>
				
			</tr>
		</c:forEach>
	</table>
	
	<a href="${urlAgregarPersona}">Agregar Persona</a>
</body>
</html>