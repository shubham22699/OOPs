package methods;
class overload{
	
	public void display(String s)
	{
		System.out.println(s);
	}
	
	public void display(char c)
	{
		System.out.println(c);
	}
}

public class OverloadOverriden extends overload {

	
	@Override
	public void display(String s)
	{
		System.out.println(" My name is :"+s);
	}
	public void display(String a,String b)
	{
		System.out.println("My full name is :"+a+" "+b);
	}
}
