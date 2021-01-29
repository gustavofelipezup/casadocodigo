package br.com.zup.casadocodigo.controller.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import br.com.zup.casadocodigo.model.Autor;

public class AutorDto {
	
	private Long id;
	private String nome;
	private String email;
	private String descricao;
	private LocalDateTime criadoEm;
	
	public AutorDto(Autor autor) {
		this.id = autor.getId();
		this.nome = autor.getNome();
		this.email = autor.getEmail();
		this.descricao = autor.getDescricao();
		this.criadoEm = autor.getCriadoEm();
	}
	
	public static List<AutorDto> converter(List<Autor> autor) {
		return autor.stream().map(AutorDto::new).collect(Collectors.toList());
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getDescricao() {
		return descricao;
	}

	public LocalDateTime getCriadoEm() {
		return criadoEm;
	}
	
}
