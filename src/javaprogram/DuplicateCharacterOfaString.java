package javaprogram;

import java.util.Scanner;

public class DuplicateCharacterOfaString {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a String ");
		
		String s=sc.next();
		
		int i,j;
		int count;
		
		for(i=0;i<s.length();i++)
		{
			count=0;
			for(j=i;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}
			}
			
			System.out.println("The duplicate character "+s.charAt(i)+ " occure "+count+" times" );
		}
			
		
		
		//using inbuilt function to build a reverse a string
		
		
//		StringBuffer bf=new StringBuffer(s);
//		System.out.println(bf);
//		bf.reverse();
//		
//		System.out.println(bf);
//		
//		
//		String ss=bf.toString();
//		
//		System.out.println(ss);
		
	}

}
