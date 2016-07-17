package com.niit.ShoppingCart;

import org.springframework.stereotype.Component;

@Component(value = "productABC")
public class Product {
	
	private String id;
	private String name;
	private int price;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	

}