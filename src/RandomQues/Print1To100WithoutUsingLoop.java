package RandomQues;

import java.util.Arrays;

public class Print1To100WithoutUsingLoop {

	public static void main(String[] args) {
		// Arrays fill method
		
		Object[] num= new Object[100];
		Arrays.fill(num, new Object(){
				int count=0;
				@Override
				public String toString() {
					return Integer.toString(++count);
				}
				
		});
		
		System.out.println(Arrays.toString(num));
	

	}

}
