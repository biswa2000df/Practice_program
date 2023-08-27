package javaprogram;

import java.util.Scanner;

public class buildinfunctionstringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string ");

		String s = sc.next();
		
		StringBuilder sb=new StringBuilder(s);
		
		sb.reverse();
		
		System.out.println(sb);
		
		String reverseString=sb.toString();
		
		System.out.println(reverseString);
	}

}
