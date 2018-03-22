<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:url value="/listar-viviendas" var="urlListadoVivienda" />
	<c:url value="/agregar-vivienda" var="urlAgregarVivienda" />
	<form:form commandName="vivienda" action="${urlAgregarVivienda}" method="POST">
		<table>
			<tr>
				<td>Calle:</td>
				<td><form:input path="calle" /></td>
			</tr>
			<tr>
				<td>Numero:</td>
				<td><form:input path="numero" /></td>
			</tr>
			<tr>
				<td>Barrio:</td>
				<td><form:input path="barrio" /></td>
			</tr>

			<tr>
				<td>Duenia/o:</td>
				<td>
					<form:select path="duenia">
							<form:options items="${nombres}" />
					</form:select>
				</td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit" value="Agregar" /></td>
				<td colspan="2"><a href="${urlListadoVivienda}">Cancelar</a></td>
			</tr>
		</table>
	</form:form>
</body>
</html>