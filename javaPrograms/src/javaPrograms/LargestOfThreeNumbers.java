package javaPrograms;

public class LargestOfThreeNumbers {

	public static void main(String ... args) {
		int a =87;
		int b=67;
		int c =39;
		if(a>b&&a>c) {
			System.out.println("The largest number is: "+a);
		}
		else if (b>c) {
			System.out.println("The largest number is: "+b);
		}
		else {
			System.out.println("The largest number is: "+c);
		}
	}
}
