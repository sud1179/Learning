package RandomQues;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// Write a Java Program to iterate HashMap using While and advance for loop.

public class IterateHashmap {

	public static void main(String[] args) {
		HashMap<Integer,String> hm= new HashMap<Integer,String>();
		hm.put(1, "a");
		hm.put(2, "b");
		hm.put(3, "c");
		hm.put(4, "d");
		
		Iterator itr=hm.entrySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("*******************************************");
		
		for(Map.Entry e:hm.entrySet()) {
			System.out.println(e.getKey() +"="+e.getValue());
		}

	}

}
