package com.containment;

class Nib{
	
	String type;
	double price;
	
	Nib(String type,double price)
	{
		this.type=type;
		this.price=price;
	}
	
	public String toString()
	{
		return "Type: "+type+" Price: "+price;
	}
}

class Pen{
	
	String name;
	String color;
	String pType;
	Nib n;
	
	Pen(String name,String color,String type,Nib n)
	{
		this.name=name;
		this.color=color;
		this.pType=type;
		this.n=n;
	}
	
	public String toString()
	{
		return "PenName: "+name+" Pen Color: "+" PenType: "+pType+" PenNib: "+n;
	}
	
}
public class Bag {
	
	int id;
	String color;
	double price;
	Pen p;
	
	Bag(int id,String color,double price,Pen p)
	{
		this.id=id;
		this.color=color;
		this.price=price;
		this.p=p;
	}
	
	public String toString()
	{
		return "Bag ID: "+id+" Bag Color: "+color+" Bag Price:"+price+p;
	}
	
	public static void main(String[] args) {
		
		Bag b1=new Bag(101,"Black", 1000,
				new Pen("Cello","white","Ball Pen",new Nib("Smooth",10.00)) );
		
		System.out.println(b1);
		
	}

}
