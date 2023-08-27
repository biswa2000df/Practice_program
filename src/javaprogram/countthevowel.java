package javaprogram;

import java.util.Scanner;

public class countthevowel {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string ");
		
		String s=sc.next();
		int count=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'||s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				count++;
			}
		}
		
		System.out.println("the number of vowel is present in the string are "+count);

	}

}
