
<%
// C�digo em Java para Fazer o Cast do Objeto para STRING
String erro = (String) request.getAttribute("erro");

%>
<!DOCTYPE html>
<html>
<head>

	<meta charset="UTF-8">
	<title>Excluir Usu�rio</title>
	<link rel="stylesheet" href="style.css">
</head>
<body>
	<div class="container">
		<div class="form">
			<form id="form" action="excluirUsuario" method="post">
				<div class="form-header">
					<div class="title">
						<h1>Excluir Usu�rio</h1>
					</div>
				</div>
						<p>Insira o Email e senha corretos</p>
				<div class="input-group">
					<div class="input-box">
						<label for="email">Email: </label>
						<input type="email" name="email" id="email" required placeholder="Digite seu email"><br>
					</div>
					<div class="input-box">
						<label for="password">Senha: </label>
						<input type="password" name="senha" id="senha" required placeholder="Digite sua senha"><br>
					</div>
				</div>
				
					<div class="cotinue-button">
						<!-- Fun��o de alerta � acionada quando clicado o bot�o -->
						<button type="submit" onclick="confirmarEnvio()" value="submit"><a href="#">Enviar</a></button>
					</div>
					<!-- Fun��o que pega a mensagem no Servlet e escreve em baixo do formul�rio para devida compreens�o  -->
				<p><% if(erro != null){ 
						out.print(erro);
						
					}
				%></p>
				</div>
				
				
			</form>
		</div>
	</div>
	<script>
	// Fun��o de Confirma��o de Formul�rio em JavaScript
        function confirmarEnvio() {
            // Exibe um alerta de confirma��o
            var confirmacao = confirm("Tem certeza de que deseja excluir a conta?");
            
            // Se o usu�rio confirmar, o formul�rio ser� enviado
            if (confirmacao) {
                document.getElementById("form").submit();
            }
        }
    </script>
</body>
</html>
