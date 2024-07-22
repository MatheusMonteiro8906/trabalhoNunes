package br.edu.ifsp.arq.arqweb1.Model;

import java.io.Serializable;


// Classe Usuario para implementação da Lista



public class Usuario implements Serializable{
	private static final long serialVersionUID = 1L;
	private static int contador = 0;
	private String nome;
	private String senha;
	private String email;
	private int id;
	
	
	
	
	

	public Usuario() {
		this.id = ++contador;
	}
	
	public Usuario(String nome, String senha, String email) {
		this();
		this.nome = nome;
		this.senha = senha;
		this.email = email;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
}
