<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Lista de Pontos Turísticos</title>
    <link rel="stylesheet" href="styles.css"> <!-- Se você tiver algum CSS para estilizar a página -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet"> <!-- Bootstrap para estilos -->
</head>
<body>
    <c:import url="includes/header.jsp" />

    <div class="container mt-4">
        <h1 class="mb-4">Lista de Pontos Turísticos</h1>

        <table class="table table-striped">
            <thead>
                <tr>
                    <th scope="col">ID</th>
                    <th scope="col">Nome</th>
                    <th scope="col">Localização</th>
                    <th scope="col">Descrição</th>
                    <th scope="col">Horas de Funcionamento</th>
                    <th scope="col">Custo de Entrada</th>
                    <th scope="col">Avaliação</th>
                    <th scope="col">Categoria</th>
                    <th scope="col">Ações</th>
                </tr>
            </thead>
            <tbody>
                <!-- Verifica se a lista de pontos turísticos não está vazia -->
                <c:if test="${not empty pontosTuristicos}">
                    <!-- Itera sobre a lista de pontos turísticos -->
                    <c:forEach var="ponto" items="${pontosTuristicos}">
                        <tr>
                            <td>${ponto.id}</td>
                            <td>${ponto.nome}</td>
                            <td>${ponto.localizacao}</td>
                            <td>${ponto.descricao}</td>
                            <td>${ponto.horas}</td>
                            <td>R$<fmt:formatNumber value="${ponto.custoDeEntrada}" type="number" minFractionDigits="2" maxFractionDigits="2" /></td>
                            <td>${ponto.avaliacao}</td>
                            <td>${ponto.categoria}</td>
                            <td>
                                <a href="atualizarPontoTuristico?id=${ponto.id}" class="btn btn-warning btn-sm">Editar</a>
                                <a href="confirmarRemocaoPontoTuristico?id=${ponto.id}" class="btn btn-danger btn-sm">Remover</a>
                            </td>
                        </tr>
                    </c:forEach>
                </c:if>
                <!-- Caso a lista de pontos turísticos esteja vazia -->
                <c:if test="${empty pontosTuristicos}">
                    <tr>
                        <td colspan="9" class="text-center">Nenhum ponto turístico encontrado.</td>
                    </tr>
                </c:if>
            </tbody>
        </table>

        <a href="adicionarPontoTuristico.jsp" class="btn btn-primary">Adicionar Novo Ponto Turístico</a>
    </div>

    <c:import url="includes/footer.jsp" />
</body>
</html>
