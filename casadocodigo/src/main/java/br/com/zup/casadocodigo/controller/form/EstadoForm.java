package br.com.zup.casadocodigo.controller.form;

import br.com.zup.casadocodigo.model.Estado;
import br.com.zup.casadocodigo.model.Pais;

public class EstadoForm {
	
	private String nome;
	private Pais pais;
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public Estado converter() {
		return new Estado(nome, pais);
	}

}
