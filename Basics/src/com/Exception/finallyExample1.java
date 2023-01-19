package com.Exception;

public class finallyExample1 {

	public static void main(String[] args) {
		// finally  with  no exception occured
		System.out.println("finally  with  no exception occured");
        try
        {
        	int a[]= {1,2,3,4};
        	System.out.println(a[3]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
        	System.out.println("array index out of bound exception");
        }
        finally
        {
        	System.out.println("finally always executed even when exception doesnot occur");
        }
        // finally with exception handled
    	System.out.println("--------------------------------------");
    	try
    	{
    		int a[]= {1,2,3,4};
        	System.out.println(a[10]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
        	System.out.println("array index out of bound exception");
        }
        finally
        {
        	System.out.println("finally always executed even when exception handled or not");
        }
    	//finally with exception not hhandled
    	System.out.println("--------------------------------------");
    	try
    	{
    		int a[]= {1,2,3,4};
        	System.out.println(a[10]);
        }
        catch(ArithmeticException e)
        {
        	System.out.println("Arithmetic exception");
        }
        finally
        {
        	System.out.println("finally always executed even when exception handled or not");
    	}
	}
}


