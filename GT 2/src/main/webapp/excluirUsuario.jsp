
<%
// Código em Java para Fazer o Cast do Objeto para STRING
String erro = (String) request.getAttribute("erro");

%>
<!DOCTYPE html>
<html>
<head>

	<meta charset="UTF-8">
	<title>Excluir Usuário</title>
	<link rel="stylesheet" href="style.css">
</head>
<body>
	<div class="container">
		<div class="form">
			<form id="form" action="excluirUsuario" method="post">
				<div class="form-header">
					<div class="title">
						<h1>Excluir Usuário</h1>
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
						<!-- Função de alerta é acionada quando clicado o botão -->
						<button type="submit" onclick="confirmarEnvio()" value="submit"><a href="#">Enviar</a></button>
					</div>
					<!-- Função que pega a mensagem no Servlet e escreve em baixo do formulário para devida compreensão  -->
				<p><% if(erro != null){ 
						out.print(erro);
						
					}
				%></p>
				</div>
				
				
			</form>
		</div>
	</div>
	<script>
	// Função de Confirmação de Formulário em JavaScript
        function confirmarEnvio() {
            // Exibe um alerta de confirmação
            var confirmacao = confirm("Tem certeza de que deseja excluir a conta?");
            
            // Se o usuário confirmar, o formulário será enviado
            if (confirmacao) {
                document.getElementById("form").submit();
            }
        }
    </script>
</body>
</html>
