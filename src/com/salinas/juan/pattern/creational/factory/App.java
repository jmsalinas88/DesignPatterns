package com.salinas.juan.pattern.creational.factory;

public class App {

	public static void main(String[] args) {

		ConexionFabrica fabrica = new ConexionFabrica();
		
		IConexion oracle = fabrica.getConexion("ORACLE");
		oracle.conectar();
		oracle.desconectar();
		
		IConexion mysql = fabrica.getConexion("MYSQL");
		mysql.conectar();
		mysql.desconectar();
		
		IConexion h2 = fabrica.getConexion("H");
		h2.conectar();
		h2.desconectar();
		

	}

}
