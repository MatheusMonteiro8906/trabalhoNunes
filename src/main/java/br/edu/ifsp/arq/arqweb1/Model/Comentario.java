package br.edu.ifsp.arq.arqweb1.Model;

import java.io.Serializable;

public class Comentario implements Serializable{

	private static final long serialVersionUID = 1L;
	private static int contador = 0;
		
	private int id;
	private String pontoTuristico;
	private String comentario;
	
	public Comentario() {
		this.id = ++contador;
	}
	
	public Comentario(String pontoTuristico, String comentario) {
		this();
		this.pontoTuristico = pontoTuristico;
		this.comentario = comentario;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPontoTuristico() {
		return pontoTuristico;
	}
	public void setPontoTuristico(String pontoTuristico) {
		this.pontoTuristico = pontoTuristico;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

}
