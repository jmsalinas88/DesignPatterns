package com.salinas.juan.pattern.creational.factory;

public class ConexionSQLServer implements IConexion{

	@Override
	public void conectar() {
		System.out.println("Se conectó a SQLServer");
	}

	@Override
	public void desconectar() {
		System.out.println("Se desconectó de SQLServer");
	}

}
