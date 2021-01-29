package br.com.zup.casadocodigo.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
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


import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Livro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long id;
	
	@NotBlank
	@Column(unique = true, nullable = false)
	private String titulo;
	
	@NotBlank
	@NotEmpty
	@Size(max = 400)
	@Column(nullable = false)
	private String resumo;
	
	@Column(nullable = false)
	private String sumario;
	
	@NotNull
	@Min(20)
	@Column(nullable = false)
	private Float preco;
	
	@NotNull
	@Min(100)
	@Column(nullable = false)
	private Integer paginas;
	
	@NotBlank
	@NotEmpty
	@Column(unique = true, nullable = false)
	private String isbn;
	
	@Future
	@JsonFormat(pattern = "dd-MM-YYYY")
	@Column(nullable = false)
	private LocalDateTime dataPublicacao;
	
	@ManyToOne
	private Autor autor;
	
	@ManyToOne
	private Categoria categoria;
	
	public Livro() {
		super();
	}

	
	public Livro(@NotBlank String titulo, @NotBlank @NotEmpty @Size(max = 400) String resumo, String sumario,
			@NotNull @Min(20) Float preco, @NotNull @Min(100) Integer paginas, @NotBlank @NotEmpty String isbn,
			@Future LocalDateTime dataPublicacao, Autor autor, Categoria categoria) {
		super();
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


	@Override
	public String toString() {
		return "Livro [id=" + id + ", titulo=" + titulo + ", resumo=" + resumo + ", sumario=" + sumario + ", preco="
				+ preco + ", paginas=" + paginas + ", isbn=" + isbn + ", dataPublicacao=" + dataPublicacao + ", autor="
				+ autor + ", categoria=" + categoria + "]";
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
