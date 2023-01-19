package com.Exception;

import java.io.IOException;
class EmployeeData
{
	void display() throws IOException
	{
		throw new IOException("same I/Q device error");
	}
}

public class ThrowsExample2 {

	public static void main(String[] args) {
		EmployeeData ed=new EmployeeData();
		try
		{
			ed.display();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		System.out.println("normal excution of code");
	}

}
