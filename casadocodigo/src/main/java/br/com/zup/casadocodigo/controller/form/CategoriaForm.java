package br.com.zup.casadocodigo.controller.form;

import br.com.zup.casadocodigo.model.Categoria;

public class CategoriaForm {

	private String nome;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Categoria converter() {
		return new Categoria(nome);
	}

}
