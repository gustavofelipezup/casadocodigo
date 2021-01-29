package br.com.zup.casadocodigo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.zup.casadocodigo.controller.dto.AutorDto;
import br.com.zup.casadocodigo.controller.form.AutorForm;
import br.com.zup.casadocodigo.model.Autor;
import br.com.zup.casadocodigo.repository.AutorRepository;


@RestController
@RequestMapping("/autores")
public class AutorController {
	
	@Autowired
	private AutorRepository autorRepository;
	
	@GetMapping
	public List<AutorDto> listar(String nomeAutor) {
		
		if (nomeAutor == null) {
			List<Autor> autores = autorRepository.findAll();			
			return AutorDto.converter(autores);
		} else {
			List<Autor> autores = autorRepository.findByNome(nomeAutor);			
			return AutorDto.converter(autores);
		}
		
	}
	
	@PostMapping
	public void registrar(@RequestBody @Valid AutorForm form) {
		Autor autor = form.converter();
		autorRepository.save(autor);
	}
}
