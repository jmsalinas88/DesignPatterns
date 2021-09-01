package com.salinas.juan.pattern.structural.bridge;

public abstract class Figura {

	protected Color color;
	
	public Figura(Color color) {
		this.color = color;
	}
	
	public abstract void dibujar();

}
