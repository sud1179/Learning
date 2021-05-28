package RandomQues;

import java.util.Scanner;

// Write a Java Program to reverse a string without using String inbuilt function.

public class ReverseAString {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string:");
		String s=scan.next();
		String rev="";
		char[] ch=s.toCharArray();
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println("Reverse String is:"+rev);
		
		

	}

}
