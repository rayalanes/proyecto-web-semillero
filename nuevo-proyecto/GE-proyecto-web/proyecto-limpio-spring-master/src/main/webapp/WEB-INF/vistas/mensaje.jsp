<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Mensaje</title>
</head>
<body>

	<jsp:include page="menu.jsp" />

	<h1>${tituloMensaje}</h1>
	${detalleMensaje}
	
</body>
</html>