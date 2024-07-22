<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:import url="includes/header.jsp" />
<style>
/* Estilo para o corpo do código */
body {
    background-color: #389739; /* Cor de fundo */
    color: #000000; /* Cor do texto */
    font-family: 'Poppins', sans-serif; /* Fonte do texto */
    padding: 3rem; /* Espaçamento interno */
    margin: 10px;
    
}

.container {
    width: 80%; /* Largura do container */
    margin: 0 auto; /* Centralizar o container */
    box-shadow: 5px 5px 10px rgba(0, 0, 0, 0.212); /* Sombra */
    padding: 20px;
}

</style>

<div class="container">

	<c:if test="${not empty erro }">
		<div class="alert alert-danger" role="alert">${erro}</div>
	</c:if>


	<h1>Formulário de Tarefas</h1>
	<form action="adicionarTarefa" method="post">
		<div class="row my-1 align-items-center">
			<div class="col-xs-12 col-sm-12 col-md-2">
				<label for="nome" class="form-label"> Nome: </label>
			</div>
			<div class="col-xs-12 col-sm-12 col-md-10">
				<input name="nome" class="form-control">
			</div>
		</div>

		<div class="row my-1 align-items-center">
			<div class="col-xs-12 col-sm-12 col-md-2">
				<label for="texto" class="form-label"> Texto: </label>
			</div>
			<div class="col-xs-12 col-sm-12 col-md-10">
				<textarea rows="5" name="texto" class="form-control"></textarea>
			</div>
		</div>

		<div class="row align-items-center">
			<div class="col-12">
				<button class="btn btn-primary">Enviar</button>
			</div>
		</div>
		
	</form>
</div>

<c:import url="includes/footer.jsp"></c:import>