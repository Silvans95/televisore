<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert</title>
</head>
	<body>
	
	<% if(request.getAttribute("messaggioDiErrore") != null){ %>
			<p style="color: red;"><%=request.getAttribute("messaggioDiErrore") %></p>
		<%  }else{ %>
			<h3>INSERIRE I DATI DA AGGIUNGERE</h3><br>
		<%}    %>
	<form action="ExecuteInsertServlet" method="post">
		<label for="marcaInputId">MARCA:</label><br>
		<input type="text" name="marcaInput" id="marcaInputId">
		<br>
		<label for="modelloInputId">MODELLO:</label><br>
		<input type="text" name="modelloInput" id="modelloInputId">
		<br>
		<label for="prezzoInputId">PREZZO:</label><br>
		<input type="text" name="prezzoInput" id="prezzoInputId">
		<br>
		<label for="numeroSerialeInputId">NUMERO SERIALE:</label><br>
		<input type="text" name="numeroSerialeInput" id="numeroSerialeInputId">
		
		<br><br>
		<input type="submit" value="ACCETTA">
	</form>
		<br>
	    <br>	
	<a href="searchForm.jsp">HOME</a>
	</body>
</html>