package com.salinas.juan.pattern.structural.bridge;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {
		
		Stream<Figura> figuras = Stream.of(new Rectangulo(new Azul()), new Circulo(new Negro()));
		Consumer<Figura> action = (figura) -> figura.dibujar();
		figuras.forEach(action);
		
	}
}
