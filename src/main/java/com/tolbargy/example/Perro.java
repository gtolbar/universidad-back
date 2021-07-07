package com.tolbargy.example;

public class Perro implements Animal{

	@Override
	public void caminar(int velocidadCaminado) {
		System.out.println("el perro camina a la velocidad" + velocidadCaminado);		
	}

	@Override
	public void comer(String comida) {
		// TODO Auto-generated method stub
		
	}
	
	public void beber(String comida) {
		// TODO Auto-generated method stub
		
	}

}
