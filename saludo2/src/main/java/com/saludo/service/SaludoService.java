package com.saludo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saludo.repository.TipoSaludoRepositorio;
import com.saludo.request.CreateSaludoRequest;
import com.saludo.entity.Tipo;

@Service
public class SaludoService {
	
	@Autowired
	TipoSaludoRepositorio tipoSaludoRepositorio;
	
	//Creando el json con la informacion necesaria
	public Tipo createSaludo (CreateSaludoRequest createSaludoRequest) {
		Tipo tipo = new Tipo(createSaludoRequest);
		tipoSaludoRepositorio.save(tipo);
		return tipo;
	}
	
	
	//Encontrando el saludo dependiendo del tipo ingresado en la url
	public Tipo getSaludo(String tipo) {
		return tipoSaludoRepositorio.findByTipo(tipo);
	}
}
