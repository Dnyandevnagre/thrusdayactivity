//Author:Dnyandev

//code to display sum of 2 no

package com.question2;

public class Arithmetic {
	int add(int a,int b)
	{
		int sum=a+b;
		return(sum);
	}

}
class Adder extends Arithmetic
{
	public int addition(int a, int b)
	{
		return add(a,b);
   }
}	
	
