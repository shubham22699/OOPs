package com.inheritance;

public class UPI {

	int accno;
	long mob;
	int pin;
	
	UPI(int accno,long mob,int pin)
	{
		this.accno=accno;
		this.mob=mob;
		this.pin=pin;
	}
	
	public String toString()
	{
		return "Account number: "+accno+" Mobile: "+mob+" Pin: "+pin;
	}
}
class GooglePay extends UPI{

        String name;
		String rewards;
		String split;
		String Upi_id;
		
		GooglePay(int accno,String name,long mob,int pin,String name1,String rewards,String split,String Upi_id)
		{
		    super(accno,mob,pin);
		    this.name=name1;
		    this.rewards=rewards;
		    this.split=split;
		    this.Upi_id=Upi_id;
		}
		public String toString()
		{
			return super.toString()+" App Name: "+name+" Rewards :"+rewards+" Split: "+split+" UPI ID: "+Upi_id;
		}
}
class PhonePay extends UPI{

	String name;
	String offers;
	double wallet;
	String Upi_id;

	PhonePay(int accno, long mob, int pin,String name,String offers,double wallet,String Upi_id)
	{
		super(accno, mob, pin);
        this.name=name;
        this.offers=offers;
        this.wallet=wallet;
        this.Upi_id=Upi_id;
	}
	public String toString()
	{
		return super.toString()+" App Name: "+name+" Offers :"+offers+" Wallet: "+wallet+" UPI ID: "+Upi_id;
	}

	
}
	
