package Ques;

public class WaterHarvestingProblem {

	public static void main(String[] args) {
		int a[]= {4,2,1,7,8,1,4};
		int val=a[0];
		int sum=0;
		int temp;
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>=val) {
				val=a[i];
				
			}else {
				temp=val-a[1];
				sum=sum+temp;
			}
		}

	}

}
