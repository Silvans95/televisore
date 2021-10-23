<%@page import="it.prova.model.Televisore"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pagina Dettagli</title>
</head>
	<body>
		<h3>Dettagli</h3>
				<% Televisore televisoreCheMiArriva = (Televisore)request.getAttribute("televisoreDaInviareAPaginaDettalio"); %>
					MARCA:  <%=televisoreCheMiArriva.getMarca() %><br>
					MODELLO:  <%=televisoreCheMiArriva.getModello() %><br>
					PREZZO:  <%=televisoreCheMiArriva.getPrezzo() %><br>
					NUMERO SERIALE:  <%=televisoreCheMiArriva.getNumeroSeriale() %><br>
					<br>
					<br>	
		<a href="searchForm.jsp">HOME</a>
	</body>
</html>