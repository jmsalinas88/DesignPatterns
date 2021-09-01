package com.salinas.juan.pattern.structural.composite;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class SaleOrder {

	private long orderId;
	private String customer;
	private List<AbstractProduct> products;
	
	public SaleOrder(long orderId, String customer) {
		this.orderId = orderId;
		this.customer = customer;
		this.products = new ArrayList<>();
	}
	
	public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public List getProducts() {
        return products;
    }

    public void setProducts(List products) {
        this.products = products;
    }

    public double getPrice() {
        double price = 0d;
        for (AbstractProduct child : products) {
            price += child.getPrice();
        }
        return price;
    }

    public void addProduct(AbstractProduct product) {
        products.add(product);
    }

    public void removeProduct(AbstractProduct product) {
        products.remove(product);
    }

    public void printOrder() {

        NumberFormat formater = new DecimalFormat("###,##0.00");
        System.out.println("\n============================================= Orden: " + orderId + "nCliente: " + customer + "nProductos:n");
        for (AbstractProduct prod : products) {
            System.out.println(prod.getName() + "ttt$ " + formater.format(prod.getPrice()));

        }
        System.out.println("Total: " + formater.format(getPrice()) + "n=============================================");
    }
	
}
