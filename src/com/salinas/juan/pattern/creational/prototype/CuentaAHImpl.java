package com.salinas.juan.pattern.creational.prototype;

public class CuentaAHImpl implements ICuenta{
	
	private String tipo;
	private double monto;
	
	public CuentaAHImpl() {
		this.tipo = "AHORRO";
	}

	@Override
	public ICuenta clonar() {
		CuentaAHImpl cuenta = null;
		try {
			cuenta = (CuentaAHImpl)this.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cuenta;
	}

	public String getTipo() {
		return tipo;
	}

	public double getMonto() {
		return monto;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	@Override
	public String toString() {
		return "CuentaAHImpl [tipo=" + tipo + ", monto=" + monto + "]";
	}
	
}
