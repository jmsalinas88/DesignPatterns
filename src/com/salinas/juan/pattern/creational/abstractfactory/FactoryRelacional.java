package com.salinas.juan.pattern.creational.abstractfactory;

public class FactoryRelacional implements AbstractFactory{

	@Override
	public RepositorioAlumnos createRepositorioAlumnos() {
		return new RepositorioAlumnosRelacional();
	}

	@Override
	public RepositorioCursos createRepositorioCursos() {
		return new RepositorioCursosRelacional();
	}
	
}
