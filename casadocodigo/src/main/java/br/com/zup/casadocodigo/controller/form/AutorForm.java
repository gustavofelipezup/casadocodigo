package br.com.zup.casadocodigo.controller.form;

import br.com.zup.casadocodigo.model.Autor;

public class AutorForm {
	
	private String nome;
	private String email;
	private String descricao;
	
	
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
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	public Autor converter() {
		return new Autor(nome, email, descricao);
	}
	
	
}
