package br.edu.ifsp.arq.arqweb1.ControllerTarefa;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.ifsp.arq.arqweb1.Model.Tarefa;

import java.util.List;
/**
 * Servlet implementation class EditarTarefaServlet
 */
@WebServlet("/editarTarefa")
public class EditarTarefaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditarTarefaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest 
			request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		List<Tarefa> listaDeTarefa = (List<Tarefa>) getServletContext().getAttribute("listaDeTarefas");
		Tarefa t = buscarTarefa(id,listaDeTarefa);
		request.setAttribute("tarefa", t);
		String url = "/editarTarefa.jsp";
		
		getServletContext().getRequestDispatcher(url).
			forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/gerenciadorDeTarefas.jsp";
		String nome = request.getParameter("nome");
		String descricao = request.getParameter("texto");
		int id = Integer.parseInt(request.getParameter("id"));
		List<Tarefa> listaDeTarefa = (List<Tarefa>) getServletContext().getAttribute("listaDeTarefas");
		Tarefa t = buscarTarefa(id,listaDeTarefa);
		t.setNome(nome);
		t.setDescricao(descricao);
		getServletContext().getRequestDispatcher(url).forward(request, response);
	}

	public Tarefa buscarTarefa(int id, List<Tarefa> listaDeTarefas) {
		
		for(Tarefa t : listaDeTarefas) {
			if(t.getId() == id) {
				return t;
			}
		}
		
		return null;
	}
	
}
