package br.edu.ifsp.arq.arqweb1.Model;

import java.io.Serializable;

public class Tarefa implements Serializable{

	private static final long serialVersionUID = 1L;
	private static int contador = 0;
		
	private int id;
	private String nome;
	private String descricao;
	
	public Tarefa() {
		this.id = ++contador;
	}
	
	public Tarefa(String n, String d) {
		this();
		this.nome = n;
		this.descricao = d;
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
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
