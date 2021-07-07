package com.tolbargy.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tolbargy.model.EnfermedadEstudiante;
import com.tolbargy.service.IEnfermedadEstudianteService;
//import com.tolbargy.service.impl.EnfermedadEstudianteServiceImpl;


@RestController
@RequestMapping("/api/enfermedad-estudiante")
public class EnfermedadEstudianteRest {

	@Autowired
	private IEnfermedadEstudianteService service;
	/*@Autowired
	private EnfermedadEstudianteServiceImpl service = new EnfermedadEstudianteServiceImpl();*/
	
	@GetMapping("")
	public List<EnfermedadEstudiante> listartodos(){
		return service.listarTodos();
	}
	
	@PostMapping("")
	public void registrar(@RequestBody EnfermedadEstudiante entidad){
		service.registrar(entidad);
	}
}
