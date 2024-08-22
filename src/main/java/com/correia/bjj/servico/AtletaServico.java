package com.correia.bjj.servico;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.correia.bjj.controller.dto.AtletaDTO;
import com.correia.bjj.model.Atleta;
import com.correia.bjj.repository.AtletaRepository;

@Service
public class AtletaServico {

	@Autowired
	private AtletaRepository atletaRepository;
	
	public List<AtletaDTO> getTodos(){ 
				
		return atletaRepository.findAll().stream()
				.map(atleta-> atleta.converter(atleta))
				.collect(Collectors.toCollection(ArrayList::new));
	}
	public Atleta save(Atleta atleta) {
		return atletaRepository.save(atleta);
	}
}
