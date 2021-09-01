package com.salinas.juan.pattern.structural.decorator;

public class SportWatchDecorator extends WatchDecorator{
	
	public SportWatchDecorator(Watch watch) {
		super(watch);
	}

	@Override
	public void createFunctionality() {
		super.createFunctionality();
		System.out.println(" and more features (Sport Watch): ");
		this.addPedometer();
		this.addSleepMode();
	}
	
	private void addPedometer() {
		System.out.println("Pedometer");
	}
	
	private void addSleepMode() {
		System.out.println("SleepMode");
	}
	
	

}
