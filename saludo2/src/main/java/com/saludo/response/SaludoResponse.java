package com.saludo.response;

import com.saludo.entity.Tipo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SaludoResponse {
	
	private long id;
	private String tipo;
	private String saludo;
	
	
	public SaludoResponse(Tipo tipo) {
		this.id = tipo.getId();
		this.tipo = tipo.getTipo();
		this.saludo = tipo.getSaludo();
		
	}
	
	

}
