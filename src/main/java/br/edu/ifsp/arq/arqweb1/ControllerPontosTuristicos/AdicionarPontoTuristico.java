package br.edu.ifsp.arq.arqweb1.ControllerPontoTuristico;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.ifsp.arq.arqweb1.Model.PontosTuristicos;
import java.util.List;

@WebServlet("/adicionarPontoTuristico")
public class AdicionarPontoTuristicoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nome = request.getParameter("nome");
        String localizacao = request.getParameter("localizacao");
        String descricao = request.getParameter("descricao");
        String horas = request.getParameter("horas");
        double custoDeEntrada = Double.parseDouble(request.getParameter("custoDeEntrada"));
        String photo = request.getParameter("photo");
        int avaliacao = Integer.parseInt(request.getParameter("avaliacao"));
        String categoria = request.getParameter("categoria");

        List<PontosTuristicos> listaDePontos = (List<PontosTuristicos>) getServletContext().getAttribute("listaDePontos");
        int novoId = listaDePontos.size() + 1;
        PontosTuristicos novoPontoTuristico = new PontosTuristicos(nome, localizacao, descricao, horas, custoDeEntrada, photo, avaliacao, categoria);
        novoPontoTuristico.setId(novoId);
        listaDePontos.add(novoPontoTuristico);

        response.sendRedirect("listarPontosTuristicos");
    }
}