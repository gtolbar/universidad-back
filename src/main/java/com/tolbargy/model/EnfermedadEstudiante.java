package com.tolbargy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "enfermedad_estudiante")
public class EnfermedadEstudiante {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "id_estudiante", nullable = false)
	private Estudiante estudiante;
	
	@Column(name = "nombre", nullable = false)
	private String nombre;
	
	@Column(name = "observacion", nullable = false)
	private String observacion;
	
	//Segundo commit
}
