<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><!DOCTYPE html>

<c:import url="includes/header.jsp" />
<div class="container">
<h1>Adicionar Novo Ponto Turístico</h1>
    <form action="adicionarPontoTuristico" method="post">
        <label for="nome">Nome:</label>
        <input type="text" id="nome" name="nome" required><br><br>

        <label for="localizacao">Localização:</label>
        <input type="text" id="localizacao" name="localizacao" required><br><br>

        <label for="descricao">Descrição:</label>
        <textarea id="descricao" name="descricao" rows="4" cols="50" required></textarea><br><br>

        <label for="horas">Horas de Funcionamento:</label>
        <input type="text" id="horas" name="horas" required><br><br>

        <label for="custoDeEntrada">Custo de Entrada:</label>
        <input type="number" id="custoDeEntrada" name="custoDeEntrada" step="0.01" required><br><br>

        <label for="photo">URL da Foto:</label>
        <input type="text" id="photo" name="photo" required><br><br>

        <label for="avaliacao">Avaliação (1 a 5):</label>
        <input type="number" id="avaliacao" name="avaliacao" min="1" max="5" required><br><br>

        <label for="categoria">Categoria:</label>
        <input type="text" id="categoria" name="categoria" required><br><br>

        <input type="submit" value="Adicionar Ponto Turístico">
    </form>

    <a href="listarPontosTuristicos">Voltar para a lista de pontos turísticos</a>

</div>
<c:import url="includes/footer.jsp"></c:import>