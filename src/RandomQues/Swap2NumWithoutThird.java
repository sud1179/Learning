package RandomQues;

//Write a Java Program to swap two numbers without using the third variable.

public class Swap2NumWithoutThird {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("a="+a);
		System.out.println("b="+b);

	}

}
