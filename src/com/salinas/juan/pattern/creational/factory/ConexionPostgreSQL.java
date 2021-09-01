package com.salinas.juan.pattern.creational.factory;

public class ConexionPostgreSQL implements IConexion {

	@Override
	public void conectar() {
		System.out.println("Se conectó a PostgreSQL");
	}

	@Override
	public void desconectar() {
		System.out.println("Se desconectó de PostgreSQL");
	}

}
