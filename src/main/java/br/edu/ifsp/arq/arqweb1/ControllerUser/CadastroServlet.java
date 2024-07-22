package br.edu.ifsp.arq.arqweb1.ControllerUser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.ifsp.arq.arqweb1.Model.Usuario;


@WebServlet("/cadastro")
public class CadastroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	

	
    public CadastroServlet() {
        super();

    }

    // Pega ps parametros do formulário e cria um novo usuario com as infromações fornecidas
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			// Obtém os parametros
			String url = "/login.jsp";
		    String nome = request.getParameter("nome");
		    String senha = request.getParameter("senha");
		    String email = request.getParameter("email");
		    
		    String mensagem = "";
		    
		    

		    // Verifica são vazios
		    if(nome.isEmpty() || senha.isEmpty() || email.isEmpty()) {
		        mensagem = "Você deve preencher todos os campos";
		        url = "/cadastro.jsp";
		    } else {
		    	// Se nao, cria um novo usuario
		    	    if (GerenciadorDeUsuarios.adicionarUsuario(new Usuario(nome, senha, email))) {
		    	        mensagem = "Cadastro realizado com sucesso!";
		    	        url = "/login.jsp"; 
		    	        getServletContext().setAttribute("listaDeUsuarios", GerenciadorDeUsuarios.getListaDeUsuarios());
		    	    } else {
		    	    	// se nao conseguir criar, mostra mensagem de erro
		    	        mensagem = "Já existe um usuário com este e-mail.";
		    	        url = "/cadastro.jsp";
		    	    }
		        
		    }

		    request.setAttribute("erro", mensagem);
		    getServletContext().getRequestDispatcher(url).forward(request, response);
		}
}
    

