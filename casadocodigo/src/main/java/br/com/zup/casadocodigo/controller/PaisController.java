package br.com.zup.casadocodigo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.zup.casadocodigo.controller.dto.PaisDto;
import br.com.zup.casadocodigo.controller.form.PaisForm;
import br.com.zup.casadocodigo.model.Pais;
import br.com.zup.casadocodigo.repository.PaisRepository;

@RestController
@RequestMapping("/paises")
public class PaisController {
	
	@Autowired
	private PaisRepository paisRepository;
	
	@GetMapping
	public List<PaisDto> listar() {
		List<Pais> paises = paisRepository.findAll();			
		return PaisDto.converter(paises);
	}
	
	@PostMapping
	public void registrar(@RequestBody @Valid PaisForm form) {
		Pais pais = form.converter();
		paisRepository.save(pais);
	}

}
