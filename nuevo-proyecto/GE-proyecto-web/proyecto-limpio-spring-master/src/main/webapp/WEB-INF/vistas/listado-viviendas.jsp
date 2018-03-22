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
	<c:url value="/agregar-vivienda" var="urlAgregarVivienda" />
	<table border="1">
		<tr>
			<th>Calle</th>
			<th>Numero</th>
			<th>Barrio</th>
		</tr>
		<c:forEach items="${viviendas}" var="vivienda">
			<tr>
				<td>${vivienda.calle}</td>
				<td>${vivienda.numero}</td>
				<td>${vivienda.barrio}</td>
			</tr>
		</c:forEach>
	</table>

	<a href="${urlAgregarVivienda}">Agregar Vivienda</a>
</body>
</html>