package RandomQues;

import java.util.Scanner;

//Write a Java Program to find whether a string or number is palindrome or not.

public class Palindrome {

	public static void main(String[] args) {
		boolean flag=true;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter value:");
		String s=scan.next();
		for(int i=0,j=s.length()-1;i<=j;i++,j--) {
			if(s.charAt(i)!=s.charAt(j)) {
				flag=false;
				break;
			}
		}
		
		if(flag) {
			System.out.println("IS palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}

	}

}
