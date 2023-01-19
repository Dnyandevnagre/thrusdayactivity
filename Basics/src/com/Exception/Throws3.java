package com.Exception;

public class Throws3 {
class Calculation
{
	int divide(int a,int b) throws ArithmeticException
	{
		return a/b;
	}
}

public class Throws3 {

	public static void main(String[] args) {
	Calculation c=new Calculation();	
	try
	{
		c.divide(10,0);
	}
	catch(ArithmeticException e)
	{
		System.out.println("divede by zero");
	}
	}
	

}
}