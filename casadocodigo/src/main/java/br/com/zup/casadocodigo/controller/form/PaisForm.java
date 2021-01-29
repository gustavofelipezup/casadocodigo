package br.com.zup.casadocodigo.controller.form;

import br.com.zup.casadocodigo.model.Pais;

public class PaisForm {
	
	private String nome;
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}



	public Pais converter() {
		return new Pais(nome);
	}
}
