package com.correia.bjj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.correia.bjj.model.Atleta;

@Repository
public interface AtletaRepository extends JpaRepository<Atleta, Long> {

	public Atleta findByNome(String nome);
}
