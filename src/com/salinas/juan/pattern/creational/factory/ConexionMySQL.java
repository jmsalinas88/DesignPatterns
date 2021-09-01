package com.salinas.juan.pattern.creational.factory;

public class ConexionMySQL implements IConexion{
	
	@Override
	public void conectar() {
		System.out.println("Se conectů a MySQL");
	}

	@Override
	public void desconectar() {
		System.out.println("Se desconectů de MySQL");
	}

}
