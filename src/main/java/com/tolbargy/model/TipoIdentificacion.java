package com.tolbargy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "tipo_identificacion")
public class TipoIdentificacion {
	
	public TipoIdentificacion() {
		
	}
	public TipoIdentificacion(int id) {
		this.id=id;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "nombre",nullable = false)
	private String nombre;
	
	@Column(name = "descripcion",nullable = false)
	private String descripcion;
}
