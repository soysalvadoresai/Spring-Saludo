package com.saludo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.saludo.request.CreateSaludoRequest;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Data
@Table(name = "tipo")
public class Tipo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "tipo", length = 20, unique = true)
	private String tipo;
	
	@Column(name = "saludo")
	private String saludo;

	public Tipo(CreateSaludoRequest createSaludoRequest) {
		this.tipo = createSaludoRequest.getTipo();
		this.saludo = createSaludoRequest.getSaludo();
	}
	
}
