<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="br.com.unifip.prova2.Veiculo"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.*"%>

<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>SCV - Sistema de Cadastramento Veicular</title>
</head>
<body>
	<style>
a {
	text-decoration: none;
	color: inherit;
}

th, td, h3 {
	color: white
}

body {
	text-align: center;
}
</style>
	<div class="container">
		<div class="text-bg-success p-3 rounded">
			<h1>SCV - Sistema de Cadastramento Veicular</h1>
		</div>
		<br></br>
		<div class="text-bg-success p-3 rounded">
			<h5>VEÍCULOS CADASTRADOS</h5>
			<c:if test="${veiculo.size() == 0}">
				<a>Nenhum carro cadastrado</a>
			</c:if>
			<table>
				<tbody id="tabela">
					<tr>
						<td></td>
					</tr>
				</tbody>
			</table>
			<table class="table">
				<thead>
					<tr>
						<th scope="col">ID</th>
						<th scope="col">Carro</th>
						<th scope="col">Marca</th>
					</tr>
				</thead>
				<tbody id="corpoTabela">
					<tr>
						<c:forEach var="x" items="${veiculo}">
							<td><c:out value="${x.getId()}" /></td>
							<td><c:out value="${x.getNome()}" /></td>
							<td><c:out value="${x.getMarca()}" /></td>
							<tr>
						</c:forEach>
					</tr>
				</tbody>
			</table>
			<br> <a class="btn btn-primary" href="./" role="button">Home</a>
			<a class="btn btn-primary" href="./add.jsp" role="button">Cadastrar</a>

		</div>
	</div>
</body>
</html>
