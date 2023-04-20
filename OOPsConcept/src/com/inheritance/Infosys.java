package com.inheritance;
//Multi level inheritance
public class Infosys {

	String type;
	String founder;
	String sector;
	
	Infosys(String type,String founder,String sector)
	{
		this.type=type;
		this.founder=founder;
		this.sector=sector;
	}
	public String toString()
	{
		return "Type: "+type+" Founder: "+founder+" Sector: "+sector;
	}
}
class SoftwareEngineer extends Infosys{
	
	String name;
	double sal;
	int exp;

	SoftwareEngineer(String type, String founder, String sector,String name,double sal,int exp) 
	{
		super(type, founder, sector);
		this.name=name;
		this.sal=sal;
		this.exp=exp;
	}
	
	public String toString()
	{
		return super.toString()+" Name: "+name+" Salary: "+sal+" Experience: "+exp;
	}
	
}
class Developer extends SoftwareEngineer{
	
	String lang;
	int projects;
	String post;

	Developer(String type, String founder, String sector, String name, double sal, int exp,String lang,int projects,String post)
	{
		super(type, founder, sector, name, sal, exp);
		this.lang=lang;
		this.projects=projects;
		this.post=post;
	}
	
	public String toString()
	
	{
		return super.toString()+" Language: "+lang+" Projects: "+projects+" Post: "+post;
	}
}
