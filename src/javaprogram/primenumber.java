package javaprogram;

import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		
		int no=sc.nextInt();
		
		int i=2;
		int count=0;
		
		while(i<=no)  //(i<=no/2)
		{
			
			if(no%i==0) {
				count++;
//			break;
			}
			i++;
		}
		
		if(count==1)
			System.out.println("prime number");
		else
			System.out.println("NOt prime number ");

	}

}
