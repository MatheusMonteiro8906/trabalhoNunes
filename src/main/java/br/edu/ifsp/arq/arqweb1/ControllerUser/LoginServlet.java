package br.edu.ifsp.arq.arqweb1.ControllerUser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    	
	
	@Override
	public void init() throws ServletException {
		super.init();
		
	}
    public LoginServlet() {
        super();

    }

    // Método Obtém as informações do formulário e verifica se há algum usuario com as informações cadastradas
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		 	String url = "/login.jsp";
		    String senha = request.getParameter("senha");
		    String email = request.getParameter("email");
		    String mensagem = "";
		    
		    if (GerenciadorDeUsuarios.buscarUsuario(email, senha)) {
	            mensagem = "Login bem-sucedido!";
	            url = "/adicionarTarefa.jsp"; 
	        } else {
	            mensagem = "Não existe usuário com essas credenciais.";
	        }
		    request.setAttribute("erro", mensagem);
		    getServletContext().getRequestDispatcher(url).forward(request, response);
		}

	
	
	

}
