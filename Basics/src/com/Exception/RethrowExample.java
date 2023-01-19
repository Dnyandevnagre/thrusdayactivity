package com.Exception;

import java.util.Scanner;

public class RethrowExample {
    void rethrowMethod()
    {
    	int[]arr= {10,20,30,40};
    	int a,b;
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter a index");
    	a=sc.nextInt();
    	System.out.println("enter b index");
    	b=sc.nextInt();
    	try
    	{
    		int result=(arr[a]/arr[b]);
    	}
    	catch(ArithmeticException e)
    	{
    		throw e;
    	}
    	catch(ArrayIndexOutOfBoundsException e)
    	{
    		throw new IndexOutOfBoundsException("index out of range");
    	}
    }
	public static void main(String[] args) {
	new RethrowExample().rethrowMethod();

	}

}
