package com.Exception;
class MyCustomException extends Exception
{
	
}
public class CustomException {
public static void main(String[]args) {
	try
	{
		throw new MyCustomException();
	}
	catch(MyCustomException e)
	{
		System.out.println("this is my first userdefined Exception");
	}
}
}

