//Author:Dnyandev Nagre


//write a java program to accept the weight and age values of a person through runtime, and if the user enters age less than 18 and weight less than 50.generate  userdefined exception "InvalidAgeWeightException"


package com.question2;

import java.util.Scanner;

public class Person {
	
	public static void main(String[] args) {
	
		int weight,age;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age");
		age=sc.nextInt();
		System.out.println("enter weight");
		weight=sc.nextInt();
		try
		{
			if(age<18 && weight>50)
			{
				throw new InvalidAgeWeightException("invalid age weight exception");
			}
			else
				System.out.println("age is"+age);
				System.out.println("weight is"+weight);

				System.out.println("your valid to donate blood");
		}
		catch(InvalidAgeWeightException e)
		{
			System.out.println(e);
			System.out.println("Your not valid to donate blood");
		}
		System.out.println("remaining part of the program");

		}
}