package br.com.zup.casadocodigo.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class Autor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long id;
	
	@NotBlank
	@Column(nullable = false)
	private String nome;
	
	@Email
	@NotEmpty
	@Column(unique = true, nullable = false)
	private String email;
	
	@NotBlank
	@Size(max = 400)
	@Column(nullable = false)
	private String descricao;
	
	@Column(nullable = false)
	private LocalDateTime criadoEm = LocalDateTime.now();
	
	public Autor() {
		super();
	}

	public Autor(@NotBlank String nome, @Email @NotEmpty String email, @NotBlank @Size(max = 400) String descricao) {
		super();
		this.nome = nome;
		this.email = email;
		this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Long getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public LocalDateTime getCriadoEm() {
		return criadoEm;
	}

	@Override
	public String toString() {
		return "Autor [nome=" + nome + ", email=" + email + ", descricao=" + descricao + ", criadoEm=" + criadoEm + "]";
	}
}	
