package br.edu.ifsp.arq.arqweb1.Model;

import java.io.Serializable;

public class PontosTuristicos implements Serializable {

    private static final long serialVersionUID = 1L;
    private static int contador = 0;

    private int id;
    private String nome;
    private String localizacao;
    private String descricao;
    private String horas;
    private double custoDeEntrada;
    private String photo;
    private int avaliacao;
    private String categoria;

    public PontosTuristicos() {
        this.id = ++contador;
    }

    public PontosTuristicos(String nome, String localizacao, String descricao, String horas, double custoDeEntrada, String photo, int avaliacao, String categoria) {
        this();
        this.nome = nome;
        this.localizacao = localizacao;
        this.descricao = descricao;
        this.horas = horas;
        this.custoDeEntrada = custoDeEntrada;
        this.photo = photo;
        this.avaliacao = avaliacao;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getHoras() {
        return horas;
    }

    public void setHoras(String horas) {
        this.horas = horas;
    }

    public double getCustoDeEntrada() {
        return custoDeEntrada;
    }

    public void setCustoDeEntrada(double custoDeEntrada) {
        this.custoDeEntrada = custoDeEntrada;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
