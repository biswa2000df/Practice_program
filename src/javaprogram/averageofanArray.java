package javaprogram;

import java.util.Scanner;

public class averageofanArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of an array ");
		
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		
		for(int i=0;i<size;i++)
		{
			
			arr[i]=sc.nextInt();
		}
		
		int sum=0;
		for(int i=0;i<size;i++) {
			
			sum=sum+arr[i];
		}
			
		
		System.out.println(sum);

		double avg=(double) sum/size;
		
		System.out.println(avg);
		
		
		
		
	}

}
