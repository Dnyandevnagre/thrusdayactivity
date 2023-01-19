// Dnyandev nagre

//Program to print first and last digit of a number

package Question1;

import java.util.Scanner;

public class Firstandlastdigit {

	public static void main(String[] args) {
		int number,firstdigit,lastdigit;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter number :");
		 number=sc.nextInt();
		 
		 firstdigit=number;
		 while(firstdigit >=10)
		 {
			 firstdigit=firstdigit/10;   // Find the first digit
		 }
		 lastdigit=number%10;           // Find the last digit
		 
		 
		 System.out.println("First digit:"+firstdigit);
		 
		 System.out.println("Last digit:"+lastdigit);
        
		
	}

}
