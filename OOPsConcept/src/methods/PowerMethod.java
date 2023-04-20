package methods;

import java.util.Scanner;

public class PowerMethod {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter base :");
		int base=s.nextInt();
		System.out.println("Enter raise :");
		int raise=s.nextInt();
        
		System.out.println("Power of "+base+" raise to "+raise+" is: "+power(base,raise));

	}
	public static int power(int b,int r)
	{
		int power=1;
		for(int i=1;i<=r;i++)
		{
			power*=b;
		}
		return power;
	}

}
