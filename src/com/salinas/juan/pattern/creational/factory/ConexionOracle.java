package com.salinas.juan.pattern.creational.factory;

public class ConexionOracle implements IConexion{

	@Override
	public void conectar() {
		System.out.println("Se conectó a Oracle");
	}

	@Override
	public void desconectar() {
		System.out.println("Se desconectó de Oracle");
	}

}
