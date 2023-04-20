package com.Abstraction;

 abstract class Abstract1 {

	public abstract void display();
	
}
abstract class Abstract2 extends Abstract1
{
	
	public  abstract void show();
}
class Abstract3 extends Abstract2{

	@Override
	public void show()
	{
		System.out.println("hi");
	}

	@Override
	public void display()
	{
		System.out.println("Hello");
	}
	
}
