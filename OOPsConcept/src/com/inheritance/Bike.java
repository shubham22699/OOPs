package com.inheritance;

 class Bike {
	
	int wheels;
	String suspension;
	String brake;
	
	Bike(int wheels,String suspension,String brake)
	{
		this.wheels=wheels;
		this.suspension=suspension;
		this.brake=brake;
	}
	
	public String toString()
	{
		return "Wheels: "+wheels+" Suspension: "+suspension+" Brake: "+brake;
	}
}
class RoyalEnfield extends Bike{
	int cc;
	String model;
	String millage;
	
	RoyalEnfield(int wheels,String suspension,String brake,int cc,String model,String millage)
	{
		super(wheels,suspension,brake);
		this.cc=cc;
		this.model=model;
		this.millage=millage;
	}
	
	public String toString()
	{
		return super.toString()+" CC: "+cc+" Model: "+model+" Millage: "+millage;
	}
	
}
