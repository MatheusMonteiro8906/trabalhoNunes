package br.edu.ifsp.arq.arqweb1.ControllerComentario;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.ifsp.arq.arqweb1.Model.Comentario;

@WebServlet("/visualizarComentarios")
public class VisualizarComentariosServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String pontoTuristico = request.getParameter("pontoTuristico");

        if (pontoTuristico != null && !pontoTuristico.isEmpty()) {
            List<Comentario> listaDeComentarios = (List<Comentario>) getServletContext().getAttribute("listaDeComentarios");
            List<Comentario> comentariosFiltrados = listaDeComentarios.stream()
                .filter(c -> c.getPontoTuristico().equalsIgnoreCase(pontoTuristico))
                .collect(Collectors.toList());
            
            request.setAttribute("comentarios", comentariosFiltrados);
        }

        getServletContext().getRequestDispatcher("/visualizarComentarios.jsp").forward(request, response);
    }
}
