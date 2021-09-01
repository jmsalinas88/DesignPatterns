package com.salinas.juan.pattern.creational.abstractfactory;

import java.util.Arrays;
import java.util.List;

public class RepositorioAlumnosNoSQL implements RepositorioAlumnos{

	@Override
	public List<String> listaAlumnos() {
		return Arrays.asList("Alumno relacional");
	}
}
