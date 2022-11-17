package Activity1;

import java.util.Scanner;

public class Printnumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        int noOfRows = sc.nextInt();
         
        int value = 1;
         
        System.out.println("Here is your pattern :");
         
        for (int i = 1; i <= noOfRows; i++) 
        {
            for (int j = 1; j <= i; j++) 
            {
                System.out.print(value+"\t");
                 
                value++;
            }
             
            System.out.println();
        }

	}

}
