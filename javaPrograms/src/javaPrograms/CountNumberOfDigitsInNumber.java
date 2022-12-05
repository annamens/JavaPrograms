package javaPrograms;

public class CountNumberOfDigitsInNumber {

	public static void main(String[] args) {
		long n = 9372345567468L;
		int count = 0;
		while (n > 0) {
			n = n / 10;
			count++;
		}
		System.out.println("No. of digits =" + count);
		
		int m = 23673451;
		int evenCount = 0;
		int oddcount=0;
		while (m > 0) {
			if (m % 2 == 0) {
				evenCount++;
			}
			else if(m%2!=0) {
				oddcount++;
			}
			m=m/10;
		}
		System.out.println("No. of even digits =" + evenCount);
		System.out.println("No. of odd digits =" + oddcount);
	}
}