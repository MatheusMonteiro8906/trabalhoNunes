package br.edu.ifsp.arq.arqweb1.ControllerUser;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/editarUsuario")
public class editarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public editarUsuario() {
		super();

	}

//	protected void doGet(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		int id = Integer.parseInt(request.getParameter("id"));
//
//		request.setAttribute("usuario",
//				GerenciadorDeUsuarios.buscarUsuario(id, GerenciadorDeUsuarios.getListaDeUsuarios()));
//		String url = "/editarUsuario.jsp";
//
//		getServletContext().getRequestDispatcher(url).forward(request, response);
//
//	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String url = "/login.jsp";
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		String novoE = request.getParameter("novoEmail");
		String novaS = request.getParameter("novaSenha");

		if (GerenciadorDeUsuarios.atualizarUsuario(email, senha, novaS, novoE)) {
			request.setAttribute("erro", "Usuário atualizado com sucesso!");

		} else {
			request.setAttribute("erro", "Usuário não encontrado ou Email já cadastrado.");
			url = "/editarUsuario.jsp";
		}

		getServletContext().getRequestDispatcher(url).forward(request, response);
	}

}
