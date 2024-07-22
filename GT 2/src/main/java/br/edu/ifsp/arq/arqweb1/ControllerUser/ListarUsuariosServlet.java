package br.edu.ifsp.arq.arqweb1.ControllerUser;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.ifsp.arq.arqweb1.Model.Usuario;

@WebServlet("/listarUsuarios")
public class ListarUsuariosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ListarUsuariosServlet() {
		super();

	}

	// Obtém os Usuarios cadastrados e os lista na tabela
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String url = "/listarUsuarios.jsp";
		String nome = request.getParameter("nome");
		String sobrenome = request.getParameter("sobrenome");
		String email = request.getParameter("email");
		int id = Integer.parseInt(request.getParameter("id"));
		
		// Busca o Usuário com o método estático
		Usuario t = GerenciadorDeUsuarios.buscarUsuario(id,GerenciadorDeUsuarios.getListaDeUsuarios());
		t.setNome(nome);
		t.setEmail(email);
		
	    getServletContext().getRequestDispatcher(url).forward(request, response);
    }

}
