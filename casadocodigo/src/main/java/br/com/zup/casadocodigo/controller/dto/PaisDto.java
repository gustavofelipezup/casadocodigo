package br.com.zup.casadocodigo.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.zup.casadocodigo.model.Pais;

public class PaisDto {
	
	private Long id;
	private String nome;
	
	
	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public PaisDto(Long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	
	public PaisDto(Pais pais) {
		this.id = pais.getId();
		this.nome = pais.getNome();
	}
	
	public static List<PaisDto> converter(List<Pais> paises) {
		return paises.stream().map(PaisDto::new).collect(Collectors.toList());
	}

}
