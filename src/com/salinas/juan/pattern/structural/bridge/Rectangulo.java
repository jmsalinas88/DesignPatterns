package com.salinas.juan.pattern.structural.bridge;

public class Rectangulo extends Figura{

	public Rectangulo(Color color) {
		super(color);
	}
	
	@Override
	public void dibujar() {
		System.out.println("Dibujando Rectangulo");
		this.color.pintar();
	}

}
