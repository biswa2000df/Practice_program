package javaprogram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Findsubstringastring {
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string ");
		
		String s=sc.next();
		
		List<String> al=new ArrayList<String>();
		int i;
		
		for( i=0;i<s.length();i++)
		{
			for(int j=i;j<s.length();j++)
			{
				al.add(s.substring(i, j+1));
			}
		}
		System.out.println(al);
		
		for(int k=0;k<al.size();k++)
		{
			System.out.println(al.get(k));
		}
		
//		for (String substring : al) {
//
//			  System.out.println(substring);
//
//			}
//		
//		System.out.println(al.size());
//		
		
		
	}

	
}
