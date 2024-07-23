package br.edu.ifsp.arq.arqweb1.ControllerPontoTuristico;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.edu.ifsp.arq.arqweb1.Model.PontosTuristicos;

@WebServlet("/atualizarPontoTuristico")
public class AtualizarPontoTuristicoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        List<PontosTuristicos> listaDePontos = (List<PontosTuristicos>) getServletContext().getAttribute("listaDePontos");

        for (PontosTuristicos ponto : listaDePontos) {
            if (ponto.getId() == id) {
                request.setAttribute("pontoTuristico", ponto);
                break;
            }
        }
        request.getRequestDispatcher("editarPontoTuristico.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String nome = request.getParameter("nome");
        String localizacao = request.getParameter("localizacao");
        String descricao = request.getParameter("descricao");
        String horas = request.getParameter("horas");
        double custoDeEntrada = Double.parseDouble(request.getParameter("custoDeEntrada"));
        String photo = request.getParameter("photo");
        int avaliacao = Integer.parseInt(request.getParameter("avaliacao"));
        String categoria = request.getParameter("categoria");

        List<PontosTuristicos> listaDePontos = (List<PontosTuristicos>) getServletContext().getAttribute("listaDePontos");

        for (PontosTuristicos ponto : listaDePontos) {
            if (ponto.getId() == id) {
                ponto.setNome(nome);
                ponto.setLocalizacao(localizacao);
                ponto.setDescricao(descricao);
                ponto.setHoras(horas);
                ponto.setCustoDeEntrada(custoDeEntrada);
                ponto.setPhoto(photo);
                ponto.setAvaliacao(avaliacao);
                ponto.setCategoria(categoria);
                break;
            }
        }

        response.sendRedirect("listarPontosTuristicos");
    }
}
