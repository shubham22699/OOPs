package com.basics;

public class Student {
	
	int id;
	String name;
	double phy;
	double chem;
	double maths;
	
	public void assignValues(int sId,String sName,double mPhy,double mChem,double mMaths)
	{
		id=sId;
		name=sName;
		phy=mPhy;
		chem=mChem;
		maths=mMaths;
	}
	
	public double percentage()
	{
		double per=(phy+chem+maths)/3;
		
		return per;
	}
	
	public void display()
	{
		System.out.println("ID: "+id+" NAME: "+name+" MARKS: "+"Physics marks: "+phy+" Chemistry marks: "+chem+" Maths Marks: "+maths+" Percentage: "+percentage());
	}

	public static void main(String[] args) {
		Student s=new Student();
		s.assignValues(101, "Shubham", 78.0, 80.0,90.0);
		
		s.percentage();
		
		s.display();
		
		AccessModifiers a=new AccessModifiers();
		
		a.bank="BOM";
		a.id=101;
		a.name="Shubham";
		//a.salary=87878;Private member

	}

}
