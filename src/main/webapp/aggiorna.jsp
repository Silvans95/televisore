<%@page import="it.prova.model.Televisore"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AGGIORNA</title>
</head>
	<body>
	
	<% Televisore televisoreDaAggiornare = (Televisore)request.getAttribute("televisoreDaAggiornare"); %>


	<form action="ExecuteUpdateServlet" method="post">
		<input type="hidden" name = "idInput" value="<%=televisoreDaAggiornare.getId()%>">
		<label for="marcaInputId">MARCA:</label><br> 
		<input type="text" name="marcaInput" id="marcaInputId" value="<%=televisoreDaAggiornare.getMarca() %>">
		<br>
		<label for="modelloInputId">MODELLO:</label><br>
		<input type="text" name="modelloInput" id="modelloInputId" value="<%=televisoreDaAggiornare.getModello() %>">
		<br>
		<label for="prezzoInputId">PREZZO:</label><br>
		<input type="text" name="prezzoInput" id="prezzoInputId" value="<%=televisoreDaAggiornare.getPrezzo() %>">
		<br>
		<label for="numeroSerialeInputId">NUMERO SERIALE:</label><br>
		<input type="text" name="numeroSerialeInput" id="numeroSerialeInputId" value="<%=televisoreDaAggiornare.getNumeroSeriale() %>">
		<br><br>
		<input type="submit" value="AGGIORNA">
	</form>
		<br>
	    <br>	
	<a href="searchForm.jsp">HOME</a>

	</body>
</html>