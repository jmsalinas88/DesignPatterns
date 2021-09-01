package com.salinas.juan.pattern.creational.factory;

public class ConexionMySQL implements IConexion{
	
	@Override
	public void conectar() {
		System.out.println("Se conectó a MySQL");
	}

	@Override
	public void desconectar() {
		System.out.println("Se desconectó de MySQL");
	}

}
