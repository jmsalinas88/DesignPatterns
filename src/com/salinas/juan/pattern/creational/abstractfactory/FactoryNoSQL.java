package com.salinas.juan.pattern.creational.abstractfactory;

public class FactoryNoSQL implements AbstractFactory{

	@Override
	public RepositorioAlumnos createRepositorioAlumnos() {
		return new RepositorioAlumnosNoSQL();
	}

	@Override
	public RepositorioCursos createRepositorioCursos() {
		return new RepositorioCursosNoSQL();
	}

}
