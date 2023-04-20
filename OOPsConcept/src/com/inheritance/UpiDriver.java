package com.inheritance;
//Heirachical inheritance

public class UpiDriver {

	public static void main(String[] args) {
		
		GooglePay g=new GooglePay(2526, "Shubham", 7057275000l, 2420,"GooglePay","Better luck next time...", "DARU","705727500@ybl");
		
		System.out.println(g);
		System.out.println("========================================================================================================");
		
		PhonePay p=new PhonePay(2420,9011528797l,2420, "PhonePAY","Cashback",10001,"u93789dcb");
		System.out.println(p);

	}

}
