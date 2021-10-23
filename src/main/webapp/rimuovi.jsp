<%@page import="it.prova.model.Televisore"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Rimuovi</title>
</head>
<body>
		<h3>VUOI DAVVERO RIMUOVERE?</h3>
				<% Televisore televisoreCheMiArriva = (Televisore)request.getAttribute("televisoreDaRimuovere"); %>
					MARCA:  <%=televisoreCheMiArriva.getMarca() %><br>
					MODELLO:  <%=televisoreCheMiArriva.getModello() %><br>
					PREZZO:  <%=televisoreCheMiArriva.getPrezzo() %><br>
					NUMERO SERIALE:  <%=televisoreCheMiArriva.getNumeroSeriale() %><br>
					<br>
					<form action="ExecuteRemoveServlet" method="post">
					<input type="hidden" name="idDaRimuovere" value=<%=televisoreCheMiArriva.getId() %>>
					<input type="submit" value="CONFERMA">
					</form>
					<br>		
		<a href="searchForm.jsp">HOME</a>
</body>
</html>