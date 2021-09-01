package com.salinas.juan.pattern.creational.factory;

public class ConexionMySQL implements IConexion{
	
	@Override
	public void conectar() {
		System.out.println("Se conect� a MySQL");
	}

	@Override
	public void desconectar() {
		System.out.println("Se desconect� de MySQL");
	}

}
