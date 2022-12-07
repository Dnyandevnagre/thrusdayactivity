// Dnyandev

package com.Question2;

public class Sequence {
	public static void main(String[] args) {
		String s="Dnyandev@";
		boolean b=false;
		for(int i=0;i<s.length();i++)       //logic for checking sequence of letters
		{
			if(s.charAt(i)=='@')
			{
				if(Character.isLowerCase(0));
				b=true;
				break;
			}
		}
		if(b)
			System.out.println("matched");
		else
			System.out.println("not matched");
	}

}
