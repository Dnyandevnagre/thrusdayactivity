package Activity1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int num1,num2,output;
	    char operator;
        Scanner sc=new Scanner(System.in);
	    System.out.println("Enter number Expression:");
	    num1=sc.nextInt();
     	operator=sc.next().charAt(0);
     	
        num2=sc.nextInt();
        switch(operator)
	{
		case '+':output=num1+num2;
			break;
		case '-':output=num1-num2;
			break;
		case '*':output=num1*num2;
			break;
		case '/':output=num1/num2;
			break;
		case '%':output=num1%num2;
			break;
		default :
			System.out.println("invalid operation");
			break;
	}
        System.out.println("The Output Is:");
	}

}
