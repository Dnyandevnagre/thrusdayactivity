package com.Exception;
import java.util.Scanner;

public class ArithmeticException {

	public static void main(String[] args) {
		// declare 3 varibales
					int a,b,c;
					Scanner D=new Scanner(System.in);
					
					System.out.print("Enter the first number ");
					a=D.nextInt();
					
					System.out.print("Enter the second number ");
					b=D.nextInt();
		try
		{
			
			
			System.out.print("result: ");
			c=b/a;
			
		}
		catch(ArithmeticException e)
	{
		System.out.println("divede by zero");
	}
	}

}
