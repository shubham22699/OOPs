package com.staticContext;

public class Addition {
	
	int a=10;
	static int b=20;
	
	public static void addition()
	{
		Addition ad=new Addition();
		System.out.println(ad.a+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition.addition();
	}

}
