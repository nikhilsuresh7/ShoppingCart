package com.niit.ShoppingCart;

import javax.naming.Context;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		context.scan("com.niit.ShoppingCart");
		context.refresh();

		context.getBean("catObject");
		System.out.println("Categories Created...");

		Product p = (Product) context.getBean("productABC");

		p.setId("101");
		p.setName("Mobile");
		p.setPrice(50000);

		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getPrice());

		System.out.println("Successfully Created...");
	}

}
