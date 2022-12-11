//Author:Dnyandev Nagre

//write a java program to accept the weight and age values of a person through runtime, and if the user enters age less than 18 and weight less than 50.generate  userdefined exception "InvalidAgeWeightException"

package com.question2;
import java.util.Scanner;

class InvalidAgeWeightException extends Exception
{
	public InvalidAgeWeightException(String Str)
	{

		super(Str);
	}
}