package br.com.zup.casadocodigo.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.zup.casadocodigo.model.Estado;
import br.com.zup.casadocodigo.model.Pais;

public class EstadoDto {
	
	private Long id;
	private String nome;
	private Pais pais;
	
	
	public EstadoDto(Estado estado) {
		this.id = estado.getId();
		this.nome = estado.getNome();
		this.pais = estado.getPais();
	}
	

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


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


	public static List<EstadoDto> converter(List<Estado> estados) {
		return estados.stream().map(EstadoDto::new).collect(Collectors.toList());
	}

}
