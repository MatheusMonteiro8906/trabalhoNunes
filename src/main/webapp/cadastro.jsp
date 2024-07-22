<% 
//Código em Java para Fazer o Cast do Objeto para STRING
String erro = (String) request.getAttribute("erro"); 


%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Cadastrar</title>
	<link rel="stylesheet" href="style.css">
	
</head>
<body>
	<div class="container">
		<div class="form">
			<form action="cadastro" method="post">
				<div class="form-header">
					<div class="title">
						<h1>Cadastrar</h1>
					</div>
				</div>
				<div class="input-group">
					<div class="input-box">
						<label for="nome">Nome: </label>
						<input type="text" name="nome" id="nome" minlength="3" required placeholder="Digite seu nome" >
					</div>
					<div class="input-box">
						<label for="email">Email: </label>
						<input type="email" name="email" id="email" required placeholder="Digite seu email" ><br>
					</div>
					<div class="input-box">
						<label for="password">Senha: </label>
						<input type="password" name="senha" id="senha" required placeholder="Digite sua senha" ><br>
					</div>
			
				</div>
				<!-- Função que pega a mensagem no Servlet e escreve em baixo do formulário para devida compreensão  -->
				<p><% if(erro != null){ 
						out.print(erro);
						
					}
				%></p>
				<div class="cotinue-button">
					<button type="submit" value="submit"><a href="#">Enviar</a></button>
				</div>
			</form>
		</div>
	</div>
</body>
</html>
