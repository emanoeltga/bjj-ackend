package com.correia.bjj.model;

import com.correia.bjj.controller.dto.AtletaDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Atleta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long atleta_id;
	private String nome;
	private String cpf;
	@ManyToOne
	@JoinColumn(name = "categoria_id")
	private Categoria categoria;
	private Double peso;
	
	public AtletaDTO converter(Atleta atleta) {		
		return new AtletaDTO(
				atleta.atleta_id,
				atleta.getNome(),
				atleta.getCpf(),
				atleta.getPeso(),
				atleta.getCategoria().converter(atleta.getCategoria()));
	}
	
}
