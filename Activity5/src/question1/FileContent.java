//Author: Dnyandev Nagre

//To read and write the content into the file based on the choice you enter.

package question1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileContent{
	
	 static void readwrite() throws IOException
	 {
		System.out.println("enter choice 1 for write and 2 for read");    //taking user input for choice
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();			
		if(i==1)
			
		{
			FileOutputStream fout=new FileOutputStream("C:\\javaprogram\\a.txt");
			String s="We are all brothers";		                         //passsing the string to write into the file
			byte[] b=s.getBytes();
			fout.write(b);
			fout.close();				
		}
		
		else if(i==2)
		
		{
			FileInputStream fin=new FileInputStream("C:\\javaprogram\\a.txt");

			while((i=fin.read())!=-1)		                              //reading the chracter upto the end of the file
			
			{
				System.out.print((char)i);		                       
			}
			
			fin.close();	                                           	//closing the reading file
		}
		
		else
			
		{
			System.out.println("please eneter a correct input");
		}
		
		System.out.println("\nSuccessfully done");
	}


	    public static void main(String[] args) {
		 
	    try
		{
			readwrite();		                                         //	calling a method readwrite
		}
	    
		catch(Exception e)
		{
			System.out.println(e);
		}


	}

}