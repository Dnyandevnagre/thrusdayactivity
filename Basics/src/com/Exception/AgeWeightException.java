package com.Exception;

class InvalidAgeWeightException extends Exception
{

public class AgeWeightException {
	  public static void validate(int age) throws InvalidAgeException
	  {
	  	if(age<18)
	  	{
	  		throw new InvalidAgeException("person is not eligible for votin");
	  	}
	  	else {
	  		
	  	
	  		System.out.println("person is eligible for voting");
	  }
	  }
}

	public static void main(String[] args) {
		try
		{
			validate(19);
		}
		catch(InvalidAgeException i)
		{
			System.out.println(i);
		}
	}

	}


