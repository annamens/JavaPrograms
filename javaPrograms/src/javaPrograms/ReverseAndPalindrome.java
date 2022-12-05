package javaPrograms;


public class ReverseAndPalindrome {
// take the last digit by % and multiply to 10 add it to the new digit
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter any number:");
//		int n = sc.nextInt();
		int n= 2345;
		int temp = n;
		int rev = 0;
		while (n != 0) {
			int a = n % 10;
			rev = rev * 10 + a;
			n = n / 10;
		}
		System.out.println("Reverse of " + temp + " is:" + rev);
		if (temp == rev) {
			System.out.println(rev + " is a palindrome");
		} else {
			System.out.println(rev + " is not a palindrome");
		}

		// OR
		int x = 3456;
		StringBuffer sb = new StringBuffer(String.valueOf(x));
		StringBuffer rev1 = sb.reverse();
		System.out.println("" + rev1);
		
		//OR
		StringBuilder sb1 = new StringBuilder();
		sb1.append(x);
		StringBuilder r = sb1.reverse();
		System.out.println(r);
	}
}