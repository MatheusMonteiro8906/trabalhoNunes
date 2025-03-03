<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
<style>
*{
background-color: #389739;
border-radius: 1px;
}

.navbar {
    background-color: #389739;
    border-bottom: 0px solid #dee2e6; 
    padding: 0;
    border-radius: 1.5rem
}

.navbar-nav .nav-link {
    color: #343a40;
    font-weight: bold; /* Negrito */
    margin-right: 0.9rem; /* Margem direita entre os links */
    transition: color 0.3s ease; /* Transição suave de cor */
    background-color: #389739;
}

.navbar-nav .nav-link:hover {
    color: #007bff; /* Cor do texto ao passar o mouse */
    background-color: #389739;
    
    
}
body{
background-color: #389739; /* Cor de fundo */
padding: 10px 5px 10px 10px;
}

</style>

</head>
<body>
<div class="container">
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
	  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo01" aria-controls="navbarTogglerDemo01" aria-expanded="false" aria-label="Toggle navigation">
	    <span class="navbar-toggler-icon">	      
	    </span>
	 
	  </button>
	  <div class="collapse navbar-collapse" id="navbarTogglerDemo01">
	    <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
	      <li class="nav-item">
	        <a class="nav-link" href="adicionarTarefa.jsp"> Adicionar Tarefa</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="gerenciadorDeTarefas.jsp">Gerenciar Tarefa</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="editarUsuario.jsp">Editar Usuário</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="excluirUsuario.jsp">Excluir Usuário</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="cadastro.jsp">Cadastrar Usuário</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="listarUsuarios.jsp">Usuários Cadastrados</a>
	      </li> 
	    </ul>
	  </div>
	</nav>
</div>