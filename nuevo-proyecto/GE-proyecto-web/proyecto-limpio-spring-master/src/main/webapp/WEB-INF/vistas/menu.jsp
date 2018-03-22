<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<ul>
	<c:url value="/listar-personas" var="urlListarPersonas" />
	<c:url value="/listar-viviendas" var="urlListarViviendas" />

	<li><a href="${urlListarPersonas}">Listar Personas</a></li>
	<li><a href="${urlListarViviendas}">Listar Viviendas</a></li>
	
</ul>