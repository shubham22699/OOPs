package com.encapsulation;

public class CarDriver {

	public static void main(String[] args) {
		
		Car c=new Car();
		c.setId(101);
		c.setName("Thar");
		c.setPrice(200000);
		c.setColor("black");
		
		System.out.println("Id: "+c.getId()+" Name: "+c.getName()+" Price: "+c.getPrice()+" Colour: "+c.getColor());

	}

}
