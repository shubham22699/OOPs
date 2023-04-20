package com.Abstraction;

 class FinalDemo {

	final int a=9;
	
	public final void display()
	{
		System.out.println("From Demo");
	}
	
	//a=10;//we cannot reinitialized a final variable
}
final class FinalTest extends FinalDemo
{
	/*public final void display()
	{
		System.out.println();
	}*/
	//Final method cannot be override
	public void Test()
	{
	   System.out.println(a);
	}
}
/*class FinalDemo2 extends FinalTest{
	// Final class Cannot be inherited
}*/
