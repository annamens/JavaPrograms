package javaPrograms;

public class MissingNumberInArray {

	public static void main(String[] args) {
		int n[]= {1,2,3,5,6};
		int sum1=0;
		for(int i=0;i<=n.length-1;i++) {
			 sum1 = sum1+n[i];
		}
		int sum2=0;
		for(int j=0;j<=6;j++) {
			sum2= sum2+j;
		}
		
	int mn = sum2-sum1;
	System.out.println("Missing number is: "+mn);
	}

}
