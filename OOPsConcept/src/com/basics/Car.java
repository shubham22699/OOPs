package com.basics;

public class Car {
	
	int id;
	double price;
	String name;
	String color;
	
	Car(){
		
	}
	Car(int id,double price,String name,String color){
		
		this.id=id;
		this.price=price;
		this.name=name;
		this.color=color;
	}
	
	public void displayCar()
	{
		System.out.println("ID: "+id+" NAME: "+name+" PRICE: "+price+" COLOUR: "+color);
	}
	

	public static void main(String[] args) {
		
		Car c1=new Car(101,1100000, "Nexon","White");
		c1.displayCar();
		
		System.out.println("===============================");
		
		Car c2=new Car(102,1000000, "Swift","red");
		c2.displayCar();
		
		System.out.println("===============================");
		
		Car c3=new Car(103,1700000, "7OO","Black");
		c3.displayCar();
		
		System.out.println("===============================");
		
		
		

	}

}
