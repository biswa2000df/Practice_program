package javaprogram;

import java.util.Scanner;

public class NumberPalindromeornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int no=sc.nextInt();
		
		int rev=0;
		
		int rem=0;
		
		while(no>0)
		{
			rem=no%10;
			
			rev=10*rev+rem;
			
			no=no/10;
		}

		System.out.println(rev);
	}

}
