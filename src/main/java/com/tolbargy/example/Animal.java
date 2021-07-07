package com.tolbargy.example;

import org.springframework.stereotype.Repository;

@Repository
public interface Animal {

	
	public void caminar(int velocidadCaminado);
	
	public void comer(String comida);
	
}
