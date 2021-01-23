<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Minha primeira página</title>
</head>
<body>
<form action="ClienteServlet">
	<h1>Adicionar Contato</h1>
	<hr/>
	Nome: <input type="text" name="nome"/>
	RG: <input type="text" name="rg"/>
	CPF: <input type="text" name="cpf"/>
	<input type="submit" value="cadastrar"/>
</form>
</body>
</html>