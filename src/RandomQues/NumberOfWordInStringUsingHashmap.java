package RandomQues;

import java.util.HashMap;

//Write a Java Program to count the number of words in a string using HashMap.

public class NumberOfWordInStringUsingHashmap {

	public static void main(String[] args) {
		String s="my name is sudeep kumar yadav";
		HashMap<String,Integer> hm= new HashMap<String,Integer>();
		String[] str=s.split(" ");
		for(String st:str) {
			hm.put(st, 1);
		}
		System.out.println("Number of words in the string:"+hm.size());
		

	}

}
