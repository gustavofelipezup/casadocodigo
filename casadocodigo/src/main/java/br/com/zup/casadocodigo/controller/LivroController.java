package br.com.zup.casadocodigo.controller;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.zup.casadocodigo.controller.dto.LivroDto;
import br.com.zup.casadocodigo.controller.form.LivroForm;
import br.com.zup.casadocodigo.model.Autor;
import br.com.zup.casadocodigo.model.Categoria;
import br.com.zup.casadocodigo.model.Livro;
import br.com.zup.casadocodigo.repository.AutorRepository;
import br.com.zup.casadocodigo.repository.CategoriaRepository;
import br.com.zup.casadocodigo.repository.LivroRepository;

@RestController
@RequestMapping("/livros")
public class LivroController {

	@Autowired
	private LivroRepository livroRepository;
	
	@Autowired
	private AutorRepository autorRepository;
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@GetMapping
	public List<LivroDto> listar() {
		List<Livro> livros = livroRepository.findAll();
		return LivroDto.converter(livros);
	}
	
	@GetMapping("/{id}")
	public LivroDto listarLivro(@PathVariable Long id) {
		Livro livro = livroRepository.getOne(id);
		LivroDto livroRetorno = new LivroDto(livro.getId(), livro.getTitulo(), livro.getResumo(), livro.getSumario(), livro.getPreco(), livro.getPaginas(), livro.getIsbn(), livro.getDataPublicacao(), livro.getAutor(), livro.getCategoria());
		return livroRetorno;
	}
	
	@PostMapping
	@Transactional
	public void registrar(@RequestBody LivroForm form) {
		Optional<Autor> autor = autorRepository.findById(form.getAutor().getId());
		Optional<Categoria> categoria = categoriaRepository.findById(form.getCategoria().getId());
		Livro livro = form.converter(autor.get(), categoria.get());
		livroRepository.save(livro);
	}
}
