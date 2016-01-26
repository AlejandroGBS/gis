<%@page pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>test jsp</title>

</head>
<body>
	<h5>la pagina se muestra correctamente</h5>
	<br>
	<c:out value="${texto}"></c:out>
	<table border="1" bordercolor="black">
		<c:forEach items="${listadoDeGasolineras}" var="gasolinera">
			<tr>
				<td><c:out value="${gasolinera.localidad}"></c:out></td>
				<td><c:out value="${gasolinera.rotulo}"></c:out></td>
				<td><c:out value="${gasolinera.longitudWGS8429}"></c:out></td>
				<td><c:out value="${gasolinera.latitud}"></c:out></td>
				<td><c:out value="${gasolinera.precioGasolina98}"></c:out></td>
			</tr>

		</c:forEach>
	</table>

</body>
</html>