package methods;

import java.util.Scanner;

public class CheckZero {
	
	public static void checkZero(int n)
	{
		while(n>0)
		{
			int rem=n%10;
			if (rem==0)
			{
				System.out.println("It is number which contains zero");
				break;
			}
			n/=10;
			
		}
		if (n==0)
		{
			System.out.println("It is number which does not contain zero");
		}
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=s.nextInt();
		
		checkZero(num);

	}

}
