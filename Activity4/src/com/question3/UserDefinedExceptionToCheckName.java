//Author:Dnyandev Nagre

//Write a java program to create a userdefined exception to check whether the given name exists or not in an array. If name not exists then throw custom exception


package com.question3;

import javax.naming.InvalidNameException;
import java.util.Scanner;


public class  UserDefinedExceptionToCheckName {

	    void validateName(String name) throws InvalidNameException { 
		String[] names = { "Shubham", "Piyush", "Rohit", "shiv"};          //passing array name
        boolean found= false;
       
        for (String n: names)
        {
            if (n.equalsIgnoreCase(name))                                  //ignores whether the letter is lowercase or uppercase
            {
                found = true;
                break;
            }
        }
        
        if (found)
        {
            System.out.println("Valid Name");                              //if name found same 
        } 
        else 
        {
            throw new InvalidNameException("Try Again!!!!!");              //if name not found 
        }
    }
	
	
	    public static void main(String[] args) {

		    UserDefinedExceptionToCheckName dn=new UserDefinedExceptionToCheckName(); //creating the objets
	        Scanner sc=new Scanner(System.in);

	        System.out.println("Enter Name:");                                 //taking user input
	        String name = sc.next();
	        try
	        {
	            dn.validateName(name);                                         //throwing exception
	        }
	        catch(InvalidNameException e)                                      //throwing exception
	        {

	            System.out.println("Invalid Name " +e);
	        }
	  
	    }


}