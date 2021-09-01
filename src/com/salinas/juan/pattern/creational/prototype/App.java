package com.salinas.juan.pattern.creational.prototype;

public class App {

	public static void main(String[] args) {
		
		CuentaAHImpl cuentaAhorro = new CuentaAHImpl();
		cuentaAhorro.setMonto(200);
		CuentaAHImpl cuentaClonada = (CuentaAHImpl)cuentaAhorro.clonar();
		System.out.println(cuentaAhorro);
		System.out.println(cuentaClonada);
		System.out.println(cuentaAhorro == cuentaClonada);
		
		
	}
}
