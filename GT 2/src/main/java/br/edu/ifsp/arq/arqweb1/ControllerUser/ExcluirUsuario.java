package br.edu.ifsp.arq.arqweb1.ControllerUser;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/excluirUsuario")
public class ExcluirUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ExcluirUsuario() {
        super();

    }
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		int id = Integer.parseInt(request.getParameter("id"));
//		String url = "/listarUsuarios.jsp";
//		
//		
//		if(GerenciadorDeUsuarios.buscarUsuario(id)) {
//			GerenciadorDeUsuarios.excluirUsuario(id);
//		} else {
//			String mensagem = "Moio";
//			request.setAttribute("msg", mensagem);
//		}
//		
//		getServletContext().getRequestDispatcher(url).forward(request, response);
//		
//	}
    
    // Pega o Usuario de acordo com email e senha e o remove
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String url = "/excluirUsuario.jsp";
		 	String email = request.getParameter("email");
		 	String senha = request.getParameter("senha");

	        

	        if (GerenciadorDeUsuarios.excluirUsuario(email, senha)) {
	            request.setAttribute("erro", "Usuário excluído com sucesso!");
	            url = "/login.jsp";
	        } else {
	            request.setAttribute("erro", "Usuário não encontrado.");
	        }
	     
	        getServletContext().getRequestDispatcher(url).forward(request, response);
	    }
	

}
