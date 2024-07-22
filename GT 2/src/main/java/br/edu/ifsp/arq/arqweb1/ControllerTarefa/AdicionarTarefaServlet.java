package br.edu.ifsp.arq.arqweb1.ControllerTarefa;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.ifsp.arq.arqweb1.Model.Tarefa;

/**
 * Servlet implementation class AdicionarTarefaServlet
 */
@WebServlet("/adicionarTarefa")
public class AdicionarTarefaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static List<Tarefa> listaDeTarefas;	
	
	@Override
	public void init() throws ServletException {
		super.init();
		listaDeTarefas = new ArrayList<>();
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AdicionarTarefaServlet() {
		super();
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String url = "/gerenciadorDeTarefas.jsp";
		String nome = request.getParameter("nome");
		String texto = request.getParameter("texto");
		String mensagem = "";
		
		if(nome.isEmpty() || texto.isEmpty()) {
			mensagem = "Voce deve preencher todos os campos";
			url = "/adicionarTarefa.jsp";
			request.setAttribute("msg", mensagem);
		}else {
			Tarefa t = new Tarefa(nome, texto);					
			//
			listaDeTarefas.add(t);
			getServletContext().setAttribute("listaDeTarefas", listaDeTarefas);
			
		}
		
		getServletContext().getRequestDispatcher(url).forward(request, response);
	}
	
	

}
