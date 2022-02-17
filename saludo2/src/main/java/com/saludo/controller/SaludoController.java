package com.saludo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saludo.entity.Tipo;
import com.saludo.request.CreateSaludoRequest;
import com.saludo.response.SaludoResponse;
import com.saludo.service.SaludoService;

@RestController
@RequestMapping("/actividad/")
public class SaludoController {
	
	@Autowired
	SaludoService saludoService;
	
	//Agregando el saludo en json
	@PostMapping("agregarSaludo")
	public SaludoResponse createSaludo (@Valid @RequestBody CreateSaludoRequest createSaludoRequest) {
		Tipo tipo = saludoService.createSaludo(createSaludoRequest);
		return new SaludoResponse(tipo);
	}
	
	
	@GetMapping("getSaludo/{tipo}")
	public SaludoResponse getSaludo (@PathVariable String tipo) {
		return new SaludoResponse (saludoService.getSaludo(tipo));

	}
}
