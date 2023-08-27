package javaprogram;

import java.util.Scanner;

public class factorialnumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int no=sc.nextInt();
		int fact=1;
		while(no>0)
		{
			fact=fact*no;
			no--;
		}
		System.out.println(fact);
		
		
	}

}
