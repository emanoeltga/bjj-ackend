package com.correia.bjj.controller.dto;

import com.correia.bjj.model.Atleta;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AtletaDTO {
 //(Long id, String nome, String cpf, Double peso, String categoria)
	private Long id;
	private String nome;
	private String cpf;
	private Double peso;
	private CategoriaDTO categoria;
	
	public Atleta converter(AtletaDTO atleta) {		
		return new Atleta(
				atleta.getId(),
				atleta.getNome(),
				atleta.getCpf(),
				atleta.getCategoria().converter(atleta.getCategoria()),
				atleta.getPeso());
	}
	
	
	
	
}
