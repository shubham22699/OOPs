package com.basics;

public class AccessModifiers {
	
	int id;
	public String name;
	private double salary;
	protected String bank;
	
	void defaultMethod()
	{
		System.out.println("Default method");
	}
	public void publicMethod()
	{
		System.out.println("From Public Method");
	}
	private void privateMethod()
	{
		System.out.println("From private Method");
	}
	
	protected void protectedMethod()
	{
		System.out.println("From  Protected method");
	}

	public static void main(String[] args)
	{
		AccessModifiers a=new AccessModifiers();
		
		a.id=100;
		a.name="Shubham";
		a.salary=89899;
		a.bank="boi";

	}

}
