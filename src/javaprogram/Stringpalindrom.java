package javaprogram;

import java.util.Scanner;

public class Stringpalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string");
		
		String s=sc.next();
		
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		
		System.out.println(rev);
		
		if(rev.equalsIgnoreCase(s))
			System.out.println("String is palindrome");
		else
			System.out.println("String is not palindrome");

	}

}
