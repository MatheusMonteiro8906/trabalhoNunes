
<% 
//C�digo em Java para Fazer o Cast do Objeto para STRING
String erro = (String) request.getAttribute("erro"); 


%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Editar Usu�rio</title>
	<link rel="stylesheet" href="style.css">
	
</head>
<body>
	<div class="container">
		<div class="form">
			<form action="editarUsuario" method="post">
				<div class="form-header">
					<div class="title">
						<h1>Editar Usu�rio</h1>
					</div>
				</div>
						<p>Insira o Email e senha corretos</p>
				<div class="input-group">
					<div class="input-box">
						<label for="email">Email: </label>
						<input type="email" name="email" id="email" required placeholder="Digite seu email">
					</div>
					<div class="input-box">
						<label for="password">Senha: </label>
						<input type="password" name="senha" id="senha" required placeholder="Digite sua senha">
					</div>
				</div>
				<div class="input-group">
					<div class="input-box">
						<label for="email">Email: </label>
						<input type="email" name="novoEmail" id="novoE" required placeholder="Digite seu email">
					</div>
					<div class="input-box">
						<label for="password">Nova Senha: </label>
						<input type="password" name="novaSenha" id="novaSenha" required placeholder="Digite sua senha">
					</div>
				</div>
					<div class="cotinue-button">
						<button type="submit" value="submit"><a href="#">Enviar</a></button>
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
	
</body>
</html>
