package methods;

import java.util.Scanner;

public class UppercaseLowercase {
	
	public static void uppercase(char c)
	{
		char ch=(char) (c-32);
		System.out.println(ch);
	}
	public static void lowercase(char c)
	{
		char ch=(char) (c+32);
	    System.out.println(ch);
	}

	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character:");
		char ch=sc.next().charAt(0);
		
		if(ch>='a'&& ch<='z')
		{
		uppercase(ch);
		}
		else
		{
		lowercase(ch);
		}
				sc.close();

	}

}
