package com.saludo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saludo.entity.Tipo;


@Repository
public interface TipoSaludoRepositorio extends JpaRepository <Tipo, Long> {
	
	public Tipo findByTipo(String tipo);
	

}
