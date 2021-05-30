package RandomQues;

import java.util.Scanner;

//Write a Java Program to find whether a number is prime or not

public class FindPrimeNumber {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a number:");
		int n= scan.nextInt();
		int count=1;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				++count;
				break;
			}
		}
		
		if(count==1) {
			System.out.println("Is Prime number");
		}else {
			System.out.println("Not a prime number");
		}

	}

}
