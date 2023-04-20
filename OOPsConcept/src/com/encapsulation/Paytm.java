package com.encapsulation;

import java.util.Scanner;

class Customer{
	
	private int c_id;
	private String name;
	private double balance;
	
	Customer(int c_id, String name, double balance)
	{
		super();
		this.c_id = c_id;
		this.name = name;
		this.balance = balance;
	}
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String toString()
	{
		return "Id: "+c_id+" "+" Name: "+name+" Balance:"+balance;
	}
}
public class Paytm {

	public static void main(String[] args) {
		
		Customer c=new Customer();
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter id:");
		c.setC_id(sc.nextInt());
		System.out.println("Enter name:");
		c.setName(sc.next());
		System.out.println("Enter your balance:");
		c.setBalance(sc.nextDouble());
		
		
		System.out.println("Enter Shopping price:");
		double price=sc.nextDouble();
		c.setBalance(c.getBalance()-price);
		
		
		
		System.out.println(c.toString());

	}

}
