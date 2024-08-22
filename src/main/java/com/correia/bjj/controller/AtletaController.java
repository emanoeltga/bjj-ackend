package com.correia.bjj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.correia.bjj.controller.dto.AtletaDTO;
import com.correia.bjj.model.Atleta;
import com.correia.bjj.servico.AtletaServico;

@RestController
@RequestMapping("atletas")
public class AtletaController {

	@Autowired
	private AtletaServico atletaServico;
	
	@GetMapping
	public List<AtletaDTO> getTodos(){
		return atletaServico.getTodos();
	}
	@PostMapping
	public AtletaDTO save(@RequestBody AtletaDTO atleta) {
		Atleta retorno= atletaServico.save(atleta.converter(atleta));		
		return retorno.converter(retorno);
	}
}
