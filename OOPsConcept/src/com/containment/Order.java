package com.containment;

class Menu{
	int Mid;
	String item;
	double price;
	
	public Menu(int id,String item,double price)
	{
		this.Mid=id;
		this.item=item;
		this.price=price;
	}
	public String toString()
	{
		return "MENU ID: "+Mid+" Item: "+item+" Price: "+price;
	}
}

public class Order {
	int id;
	double qty;
	Menu m;
	
	Order(int id,double qty,Menu m)
	{
		this.id=id;
		this.qty=qty;
		this.m=m; 
	}
	public String toString()
	{
		return "Order id: "+id+" Quqntity: "+qty+" "+m;
	}
	
	public static void main(String[] args) {
		
		Order o=new Order( 101,2,new Menu(111,"POHE",20.00));
		
		System.out.println(o);
		
	}

}
