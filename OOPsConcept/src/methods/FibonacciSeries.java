package methods;

import java.util.Scanner;

public class FibonacciSeries {
	
	public static void fibonacciSeries(int no)
	{
		int n1=0,n2=1,n3;
		
		for(int i=0;i<no;i++)
		{
			n3=n1+n2;
			System.out.println(n1);
			n1=n2;
			n2=n3;
		}
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of fibonacci values:");
		
		int num=s.nextInt();
		fibonacciSeries(num);

	}

}
