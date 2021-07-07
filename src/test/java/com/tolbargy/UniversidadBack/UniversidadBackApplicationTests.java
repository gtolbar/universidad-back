package com.tolbargy.UniversidadBack;


import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.tolbargy.model.Estudiante;
import com.tolbargy.model.TipoIdentificacion;
import com.tolbargy.model.TipoSangre;
import com.tolbargy.service.IEstudianteService;

@SpringBootTest
class UniversidadBackApplicationTests {

	@Autowired
	private IEstudianteService serviceEstudiante; 
	
	@Test
	void contextLoads() {
		/*
		List<Estudiante> listaEstudiante = serviceEstudiante.listarTodos();
			for(Estudiante estudiante : listaEstudiante) {
			System.out.println(estudiante.toString());
		}
		
		
		Estudiante estudiante = serviceEstudiante.listarPorId(1);
		System.out.println(estudiante.toString());
		
		Estudiante estudiante = new Estudiante();
		
		*/
		Estudiante estudiante = new Estudiante();
		//estudiante.setId(0);
		estudiante.setNumeroIdentificacion("1234567890");
		estudiante.setNombre("Pepito");
		estudiante.setApellido("Perez");
		estudiante.setFechaNacimiento(LocalDate.now());
		estudiante.setTipoIdentificacion(new TipoIdentificacion(3));
		estudiante.setTipoSangre(new TipoSangre(3));
		
		serviceEstudiante.registrar(estudiante);
		//serviceEstudiante.actualizar(estudiante);
		
		//serviceEstudiante.eliminar(0);

	}

}
