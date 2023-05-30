<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT"
	crossorigin="anonymous">
<title>SCV - Adicionar</title>
</head>
<body>
	<div class="container text-center">
		<div class="text-bg-success p-3 rounded">
			<h4>SCV - Sistema de Cadastramento Veicular</h4>
			<br></br>
			<h5>Cadastrar Veículo</h5>
			<form action="addCarro">
				ID: <input type="text" name="id" required> Nome: <input type="text"
					name="nome" required> Marca: <input type="text" name="marca" required>
				<input type="submit" value="Gravar">
			</form>
			<br> <a class="btn btn-primary" href="./" role="button">Home</a>
			<a class="btn btn-primary" href="./addCarro" role="button">Listagem</a>
		</div>
	</div>
</body>
</html>
