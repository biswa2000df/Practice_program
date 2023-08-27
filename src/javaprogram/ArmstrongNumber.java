package javaprogram;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number :");
		int no=sc.nextInt();
		
		int nocount=0;
		
		int temp=no;
		
		while(temp>0)
			
		{
			
			temp=temp/10;
			nocount++;
		}
		int totalsum=0;

		System.out.println(nocount);
		
		temp=no;
		int rem=0;
		
		while(temp>0)
		{
			rem=temp%10;
			totalsum=totalsum+(int) Math.pow(rem,nocount);
			temp=temp/10;
			
		}
		
		System.out.println(totalsum);
	}

}
