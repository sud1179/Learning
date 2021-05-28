package RandomQues;

import java.util.Scanner;

//Write a Java Program to reverse a string using String inbuilt function.

public class ReverseAStringUsingInbuiltFunctions {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("String:");
		String s=scan.nextLine();
		StringBuilder sb= new StringBuilder();
		sb.append(s);
		sb=sb.reverse();
		
		System.out.println("Reversed:"+sb);
		
		

	}

}
