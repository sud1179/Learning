package RandomQues;

import java.util.Arrays;
// Print 1 to 100 without using any loop ussing Arrays.fill function

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
