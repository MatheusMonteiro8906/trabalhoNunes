package br.edu.ifsp.arq.arqweb1.ControllerPontoTuristico;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.edu.ifsp.arq.arqweb1.Model.PontosTuristicos;

@WebServlet("/removerPontoTuristico")
public class RemoverPontoTuristicoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));

        List<PontosTuristicos> listaDePontos = (List<PontosTuristicos>) getServletContext().getAttribute("listaDePontos");
        
        Iterator<PontosTuristicos> iterator = listaDePontos.iterator();
        while (iterator.hasNext()) {
            PontosTuristicos ponto = iterator.next();
            if (ponto.getId() == id) {
                iterator.remove();
                break;
            }
        }
        response.sendRedirect("listarPontosTuristicos");
    }
}