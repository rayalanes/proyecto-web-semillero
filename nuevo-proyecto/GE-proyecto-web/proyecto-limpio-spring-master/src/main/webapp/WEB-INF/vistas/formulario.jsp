<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Agregar persona</title>
</head>
<body>
	<c:url value="/editar-persona" var="urlEditarPersona" />
	<c:url value="/agregar-persona" var="urlAgregarPersona" />
	<c:url value="/listar-personas" var="urlListadoPersonas" />
	<form:form commandName="personaEditada" action="${ nuevaPersona ? urlAgregarPersona : urlEditarPersona}"
		method="POST">
		<form:hidden path="id" />
		<table>
			<c:if test="${!nuevaPersona}">
				<tr>
					<td>ID:</td>
					<td>${personaEditada.id}</td>
				</tr>
			</c:if>
			<tr>
				<td>Nombre:</td>
				<td><form:input path="nombre" /></td>
			</tr>
			<tr>
				<td>Apellido:</td>
				<td><form:input path="apellido" /></td>
			</tr>
			<tr>
				<td>Edad:</td>
				<td><form:input path="edad"/></td>
			</tr>
			<tr>
				<td>Dni:</td>
				<td><form:input path="dni" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="${ nuevaPersona ? 'Agregar' : 'Guardar'}" /></td>
				<td colspan="2"><a href="${urlListadoPersonas}">Cancelar</a></td>
				
			</tr>
		</table>
	</form:form>
</body>
</html>