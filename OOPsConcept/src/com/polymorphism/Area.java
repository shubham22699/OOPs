package com.polymorphism;

public class Area {
	
     public void area(float radius)
	{
		System.out.println("Area of circle: "+3.14*radius*radius);
		
	}
    public void area(int side)
	{
		System.out.println("Area of Square: "+side*side);
		
	}
	public void area(int length,int breadth)
	{
		System.out.println("Area of Rectangle: "+length*breadth);
		
	}
	public void area(double base,double height)
	{
		System.out.println("Area of Triangle: "+0.5*base*height);
		
	}
	public static void main(String[] args) {
		
		Area a=new Area();
		a.area(5.5f);
		a.area(5);
		a.area(5,6);
		a.area(2.2,4.0);
	}

}
