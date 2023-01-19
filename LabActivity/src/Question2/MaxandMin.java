// Dnyandev nagre

//Program to print max and min element of an array
package Question2;

import java.util.Scanner;

public class MaxandMin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	       int arr[]=new int[10];
	       System.out.println("Enter number in array:");
	       for(int i=0;i<arr.length ;i++) {
	    	   arr[i]=sc.nextInt();
	       }
	       int min = arr[0];
		   int max = arr[0];
		   
		   for(int i=0;i<arr.length ;i++)
	       {
	         
	         if(arr[i]<min)
	           {
	           min=arr[i];
	           }
	         if(arr[i]>max)
	         {
	           max=arr[i];
	         }
	       }
	       System.out.println("Max number is: "+max);
	       System.out.println("Min number is: "+min);
	       
	       
	  }
}
