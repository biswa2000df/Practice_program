package javaprogram;

import java.util.Scanner;

public class counttheWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		
		String s=sc.nextLine();
		
		char ch[]=s.toCharArray();
		
		System.out.println("The total Character are present in the string " + ch.length);
		
		int wordcount=0;
		
		
		for(int i=0;i<s.length();i++)
		{
			
			if((s.charAt(i)==' ' && s.charAt(i+1)!=' ')|| s.charAt(i)=='\t' || s.charAt(i)=='\n') {
				wordcount++;
			}
			
		}
		
		wordcount++;
		
		System.out.println("count the word "+wordcount);
		
		
		///linecount
		int linecount=0;
		
		for(int r=0;r<s.length();r++)
		{
			if(s.charAt(r)=='\n');
			
			linecount++;
		}
		
		System.out.println(linecount);
		

	}

}
