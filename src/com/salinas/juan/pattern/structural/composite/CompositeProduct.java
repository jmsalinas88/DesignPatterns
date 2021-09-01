package com.salinas.juan.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeProduct extends AbstractProduct{
	
	private List<AbstractProduct> products;
	
	public CompositeProduct(String name) {
		super(name, 0);
		this.products = new ArrayList<>();
	}
	
	public void addProduct(AbstractProduct product) {
		this.products.add(product);
	}
	
	public boolean removeProduct(AbstractProduct product) {
		return this.products.remove(product);
	}

	@Override
	public double getPrice() {
		double price = 0D;
		for (AbstractProduct product : products) {
			price += product.getPrice();
		}
		return price;
	}

	@Override
	public void setPrice(double price) {
		throw new UnsupportedOperationException();
	}

}
