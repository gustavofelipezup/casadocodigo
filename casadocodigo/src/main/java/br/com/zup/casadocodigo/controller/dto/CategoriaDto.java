package br.com.zup.casadocodigo.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.zup.casadocodigo.model.Categoria;

public class CategoriaDto {

	public Long id;
	public String nome;
	
	public CategoriaDto(Categoria categoria) {
		this.id = categoria.getId();
		this.nome = categoria.getNome();
	}
	
	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public static List<CategoriaDto> converterCategoria(List<Categoria> categorias) {
		return categorias.stream().map(CategoriaDto::new).collect(Collectors.toList());
	}
}
