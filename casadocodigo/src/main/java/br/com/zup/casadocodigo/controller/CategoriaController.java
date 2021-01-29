package br.com.zup.casadocodigo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.zup.casadocodigo.controller.dto.CategoriaDto;
import br.com.zup.casadocodigo.controller.form.AutorForm;
import br.com.zup.casadocodigo.controller.form.CategoriaForm;
import br.com.zup.casadocodigo.model.Autor;
import br.com.zup.casadocodigo.model.Categoria;
import br.com.zup.casadocodigo.repository.CategoriaRepository;

@RestController
@RequestMapping("/livros/categorias")
public class CategoriaController {

	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@GetMapping
	public List<CategoriaDto> listar() {
		List<Categoria> categorias = categoriaRepository.findAll();
		return CategoriaDto.converterCategoria(categorias);
	}
	
	@PostMapping
	public void registrar(@RequestBody @Valid CategoriaForm form) {
		Categoria categoria = form.converter();
		categoriaRepository.save(categoria);
	}
}
