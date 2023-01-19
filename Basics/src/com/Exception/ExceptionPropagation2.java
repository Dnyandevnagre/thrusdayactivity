package com.Exception;

public class ExceptionPropagation2 {

	public static void main(String[] args) {
		void c() 
		{
		throw new java.io.IOException("same device io exception");	
		}
		void b()
		{
			System.out.println("iam the caller of divide()");
			c();
		}
		void a()
		{
			System.out.println("iam the caller of remainder()");
			try
			{
				b();
			}
			catch(Exception e)
			{
				System.out.println("divede by zero exception propagated in forward direction)");
			}
		
		

	}

}
