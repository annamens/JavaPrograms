package javaPrograms;

public class Swap {// without using third variable

	public static void main(String[] args) {
		int a = 5;
		int b = 8;
		a = a + b; // 13
		b = a - b;// 5
		a = a - b;// 5
		System.out.println(a);
		System.out.println(b);

	}

}
