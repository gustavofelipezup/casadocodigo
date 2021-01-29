package br.com.zup.casadocodigo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.zup.casadocodigo.controller.dto.EstadoDto;
import br.com.zup.casadocodigo.controller.form.EstadoForm;
import br.com.zup.casadocodigo.model.Estado;
import br.com.zup.casadocodigo.repository.EstadoRepository;

@RestController
@RequestMapping("/estados")
public class EstadoController {

	@Autowired
	private EstadoRepository estadoRepository;
	
	@GetMapping
	public List<EstadoDto> listar() {
		List<Estado> estados = estadoRepository.findAll();
		return EstadoDto.converter(estados);
	}
	
	@PostMapping
	public void registrar(@RequestBody @Valid EstadoForm form) {
		Estado estado = form.converter();
		estadoRepository.save(estado);
	}
}
