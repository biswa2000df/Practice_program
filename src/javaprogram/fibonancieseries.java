package javaprogram;

import java.util.ArrayList;
import java.util.Scanner;

public class fibonancieseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int no=sc.nextInt();
		
		ArrayList al=new ArrayList();
		
		int total=0;
		
		int a=0;
		
		int b=1;
		
		
		
		int c=0;
		al.add(a);
		
		for(int i=1;i<no;i++)
		{
			
			
			c=a+b;
			a=b;
			b=c;
			al.add(c);
			
		}
		
		System.out.println(al);
		
	}

}
