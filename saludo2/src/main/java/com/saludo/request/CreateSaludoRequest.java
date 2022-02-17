package com.saludo.request;



import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
public class CreateSaludoRequest {
	
	@NotBlank(message = "Type is required")
	private String tipo;
	
	private String saludo;

}
