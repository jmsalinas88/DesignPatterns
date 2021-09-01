package com.salinas.juan.pattern.structural.bridge;

public class Circulo extends Figura{

	public Circulo(Color color) {
		super(color);
	}
	
	@Override
	public void dibujar() {
		System.out.println("Dibujando Circulo");
		this.color.pintar();
	}

}
