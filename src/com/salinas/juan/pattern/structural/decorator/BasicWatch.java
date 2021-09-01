package com.salinas.juan.pattern.structural.decorator;

public class BasicWatch implements Watch{

	@Override
	public void createFunctionality() {
		System.out.println("Basic Watch With: ");
		this.addTimer();
	}
	
	private void addTimer() {
		System.out.println("Timer");
	}

}
