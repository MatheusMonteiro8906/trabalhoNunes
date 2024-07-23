package br.edu.ifsp.arq.arqweb1.ControllerComentario;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.ifsp.arq.arqweb1.Model.Comentario;

@WebServlet("/adicionarComentario")
public class AdicionarComentarioServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static List<Comentario> listaDeComentarios; 

    @Override
    public void init() throws ServletException {
        super.init();
        listaDeComentarios = new ArrayList<>();
    }

    public AdicionarComentarioServlet() {
        super();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = "/gerenciadorDeComentarios.jsp";
        String pontoTuristico = request.getParameter("pontoTuristico");
        String comentario = request.getParameter("comentario");
        String mensagem = "";

        if (pontoTuristico == null || pontoTuristico.isEmpty() || comentario == null || comentario.isEmpty()) {
            mensagem = "Você deve preencher todos os campos.";
            url = "/adicionarComentario.jsp";
            request.setAttribute("msg", mensagem);
        } else {
            Comentario novoComentario = new Comentario(pontoTuristico, comentario);
            listaDeComentarios.add(novoComentario);
            request.setAttribute("listaDeComentarios", listaDeComentarios);  
        }

        getServletContext().getRequestDispatcher(url).forward(request, response);
    }
}