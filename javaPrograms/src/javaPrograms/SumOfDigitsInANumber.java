package javaPrograms;

public class SumOfDigitsInANumber {

	public static void main(String[] args) {
		int n = 854746;
		int sum=0;
		while(n>0) {
			int rem = n%10;
			sum =sum+rem;
			n=n/10;
		}
		
		System.out.println(sum);
	}

}
