package com.inheritance;

public class Laptop {
	
	String brand;
	int ram;
	int hd;
	
	Laptop(String brand,int ram,int hd)
	{
		this.brand=brand;
		this.ram=ram;
		this.hd=hd;
	}
	
	public String toString()
	{
		return "Brand: "+brand+" Ram: "+ram+" Hard Disk: "+hd;
	}

}
class Dell extends Laptop{
	String type;
	double price;
	String os;
	
	Dell(String brand,int ram,int hd,String type,double price,String os)
	{
		super(brand,ram,hd);
		this.type=type;
		this.price=price;
		this.os=os;
	}
	
	public String toString()
	{
		return super.toString()+" Type: "+type+" Price: "+price+" Operating System: "+os;
	}

}
