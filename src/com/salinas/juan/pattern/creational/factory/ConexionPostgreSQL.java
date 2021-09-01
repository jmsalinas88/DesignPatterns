package com.salinas.juan.pattern.creational.factory;

public class ConexionPostgreSQL implements IConexion {

	@Override
	public void conectar() {
		System.out.println("Se conect� a PostgreSQL");
	}

	@Override
	public void desconectar() {
		System.out.println("Se desconect� de PostgreSQL");
	}

}
