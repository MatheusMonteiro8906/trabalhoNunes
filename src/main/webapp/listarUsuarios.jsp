<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>



<c:import url="includes/header.jsp" />

<div class="container">
	<table class="table table-striped">
		<thead>
			<tr>
				<th scope="col">#</th>
				<th scope="col">Nome</th>
				<th scope="col">Email</th>
				
			</tr>
		</thead>
		<tbody>
			<!-- Pega a listaDeUsuarios no Contexto do Servlet para utilizar o for --> 
			<c:if test="${not empty listaDeUsuarios}">
				<c:forEach var="usuario" items="${listaDeUsuarios}">
					<tr>
						<th scope="row">${usuario.id}</th>
						<th>${usuario.nome}</th>
						<th>${usuario.email}</th>
					</tr>
				</c:forEach>
			</c:if>

		</tbody>
	</table>
</div>






<c:import url="includes/footer.jsp" />

</body>
</html>