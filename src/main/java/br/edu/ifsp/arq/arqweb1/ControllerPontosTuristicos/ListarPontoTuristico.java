package br.edu.ifsp.arq.arqweb1.ControllerPontoTuristico;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.ifsp.arq.arqweb1.Model.PontosTuristicos;

@WebServlet("/listarPontosTuristicos")
public class ListarPontosTuristicosServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<PontosTuristicos> listaDePontos = (List<PontosTuristicos>) getServletContext().getAttribute("listaDePontos");
        request.setAttribute("pontosTuristicos", listaDePontos);
        request.getRequestDispatcher("pontosTuristicos.jsp").forward(request, response);
    }
}