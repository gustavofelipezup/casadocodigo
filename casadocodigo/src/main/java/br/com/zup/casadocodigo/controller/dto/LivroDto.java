package br.com.zup.casadocodigo.controller.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Future;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.zup.casadocodigo.model.Autor;
import br.com.zup.casadocodigo.model.Categoria;
import br.com.zup.casadocodigo.model.Livro;

public class LivroDto {
	
	private Long id;
	private String titulo;
	private String resumo;
	private String sumario;
	private Float preco;
	private Integer paginas;
	private String isbn;
	private LocalDateTime dataPublicacao;
	private Autor autor;
	private Categoria categoria;

	public LivroDto(Livro livro) {
		this.id = livro.getId();
		this.titulo = livro.getTitulo();
		this.resumo = livro.getResumo();
		this.sumario = livro.getSumario();
		this.preco = livro.getPreco();
		this.paginas = livro.getPaginas();
		this.isbn = livro.getIsbn();
		this.dataPublicacao = livro.getDataPublicacao();
		this.autor = livro.getAutor();
		this.categoria = livro.getCategoria();
	}
	
	
	public LivroDto(Long id, String titulo, String resumo, String sumario, Float preco, Integer paginas, String isbn,
			LocalDateTime dataPublicacao, Autor autor, Categoria categoria) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.resumo = resumo;
		this.sumario = sumario;
		this.preco = preco;
		this.paginas = paginas;
		this.isbn = isbn;
		this.dataPublicacao = dataPublicacao;
		this.autor = autor;
		this.categoria = categoria;
	}


	public static List<LivroDto> converter(List<Livro> livros) {
		return livros.stream().map(LivroDto::new).collect(Collectors.toList());
	}
	
	public static LivroDto converter(Livro livro) {
		return new LivroDto(livro.getId(), livro.getTitulo(), livro.getResumo(), livro.getSumario(), livro.getPreco(), livro.getPaginas(), livro.getIsbn(), livro.getDataPublicacao(), livro.getAutor(), livro.getCategoria());
	}


	public Long getId() {
		return id;
	}


	public String getTitulo() {
		return titulo;
	}


	public String getResumo() {
		return resumo;
	}


	public String getSumario() {
		return sumario;
	}


	public Float getPreco() {
		return preco;
	}


	public Integer getPaginas() {
		return paginas;
	}


	public String getIsbn() {
		return isbn;
	}


	public LocalDateTime getDataPublicacao() {
		return dataPublicacao;
	}


	public Autor getAutor() {
		return autor;
	}


	public Categoria getCategoria() {
		return categoria;
	}
	
	

}
