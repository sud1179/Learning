package RandomQues;

import java.util.HashMap;

//Write a Java Program to count the number of words in a string using HashMap.

public class NumberOfWordInStringUsingHashmap {

	public static void main(String[] args) {
		String s="my name is is sudeep kumar sudeep";
		HashMap<String,Integer> hm= new HashMap<String,Integer>();
		String[] str=s.split(" ");
		for(int i=0;i<str.length;i++) {
			if(hm.containsKey(str[i])) {
				int count =hm.get(str[i]);
				hm.put(str[i], ++count);
			}else {
				hm.put(str[i], 1);
				
			}
		}
		System.out.println("Number of words in the string:"+hm);
		

	}

}
