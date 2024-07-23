package br.edu.ifsp.arq.arqweb1.ControllerComentario;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.ifsp.arq.arqweb1.Model.Comentario;

@WebServlet("/editarComentario")
public class EditarComentarioServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String novoComentario = request.getParameter("comentario");

        List<Comentario> listaDeComentarios = (List<Comentario>) getServletContext().getAttribute("listaDeComentarios");
        
        for (Comentario comentario : listaDeComentarios) {
            if (comentario.getId() == id) {
                comentario.setComentario(novoComentario);
                break;
            }
        }

        response.sendRedirect("visualizarComentarios?pontoTuristico=" + request.getParameter("pontoTuristico"));
    }
}
