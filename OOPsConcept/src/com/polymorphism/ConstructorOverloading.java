package com.polymorphism;

public class ConstructorOverloading {
	
	String name;
	int id;
	long mob;
	
	char blood;
	String email;
	
	ConstructorOverloading(String name,int id,long mob)
	{
		this.name=name;
		this.id=id;
		this.mob=mob;
		System.out.println(name+" "+id+" "+mob);
	}
	ConstructorOverloading(String name,int id,long mob,char blood)
	{
		this(name,id,mob);
		this.blood=blood;
		System.out.println(name+" "+id+" "+mob+" "+blood);

	}
	ConstructorOverloading(String name,int id,long mob,char blood,String email)
	{
		this(name,id,mob,blood);
		this.email=email;
		System.out.println(name+" "+id+" "+mob+" "+blood+" "+email);
	}

    public static void main(String[] args) {
    	ConstructorOverloading c1=new ConstructorOverloading("shubham",101,7057275000l);
    	
    	ConstructorOverloading c2=new ConstructorOverloading("Shivraj", 110, 9013332423l, 'O');
    	
	}

}
