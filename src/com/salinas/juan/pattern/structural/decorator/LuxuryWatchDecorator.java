package com.salinas.juan.pattern.structural.decorator;

public class LuxuryWatchDecorator extends WatchDecorator{

	public LuxuryWatchDecorator(Watch watch) {
		super(watch);
	}
	

	@Override
	public void createFunctionality() {
		super.createFunctionality();
		System.out.println("and more features (Luxury Watch): ");
		this.addFastCharge();
		this.addImpermeability();
		this.addNFC();
	}

	private void addFastCharge() {
		System.out.println("FastCharge");
	}
	
	private void addImpermeability() {
		System.out.println("Impermeability");
	}
	
	private void addNFC() {
		System.out.println("NFC");
	}
}
