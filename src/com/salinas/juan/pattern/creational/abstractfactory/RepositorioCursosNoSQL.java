package com.salinas.juan.pattern.creational.abstractfactory;

import java.util.Arrays;
import java.util.List;

public class RepositorioCursosNoSQL implements RepositorioCursos{

	@Override
	public List<String> listaCursos() {
		return Arrays.asList("Curso relacional");
	}
	
}
