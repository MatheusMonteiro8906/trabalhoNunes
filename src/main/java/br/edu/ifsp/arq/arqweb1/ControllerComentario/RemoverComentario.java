package br.edu.ifsp.arq.arqweb1.ControllerComentario;

import java.io.IOException;
import java.util.List;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.ifsp.arq.arqweb1.Model.Comentario;

@WebServlet("/removerComentario")
public class RemoverComentarioServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));

        List<Comentario> listaDeComentarios = (List<Comentario>) getServletContext().getAttribute("listaDeComentarios");
        
        Iterator<Comentario> iterator = listaDeComentarios.iterator();
        while (iterator.hasNext()) {
            Comentario comentario = iterator.next();
            if (comentario.getId() == id) {
                iterator.remove();
                break;
            }
        }

    }
}
