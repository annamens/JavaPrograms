package javaPrograms;

public class Fibonacci {
/*
 * print the Fibonacci series
 * 0, 1, 1, 2, 3, 5, 8, 13.....
 * a  b 
 * give a = b and b = sum where sum =a+b
 */
	 static public void main(String ... args) {
		int n = 10;
		int a =0;
		int b=1;
			for(int i =0; i<=n;i++) {
				 System.out.print(a+" ");
				 int sum = a+b;
				 a=b;
				 b=sum;
				
		}
	}

}
