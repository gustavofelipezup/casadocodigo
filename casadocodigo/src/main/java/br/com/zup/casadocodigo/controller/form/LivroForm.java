package br.com.zup.casadocodigo.controller.form;

import java.time.LocalDateTime;

import br.com.zup.casadocodigo.model.Autor;
import br.com.zup.casadocodigo.model.Categoria;
import br.com.zup.casadocodigo.model.Livro;

public class LivroForm {

	private String titulo;
	private String resumo;
	private String sumario;
	private Float preco;
	private Integer paginas;
	private String isbn;
	private LocalDateTime dataPublicacao;
	private Autor autor;
	private Categoria categoria;
	
	public Livro converter(Autor autor, Categoria categoria) {
		return new Livro(titulo, resumo, sumario, preco, paginas, isbn, dataPublicacao, autor, categoria);
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

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	public void setSumario(String sumario) {
		this.sumario = sumario;
	}

	public void setPreco(Float preco) {
		this.preco = preco;
	}

	public void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setDataPublicacao(LocalDateTime dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	

	
}
