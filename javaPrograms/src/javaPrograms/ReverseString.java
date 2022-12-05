package javaPrograms;

public class ReverseString {
	// 1. Using String concatenation
	public static void main(String[] args) {
		String s = "srinivas annameni";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);

		}
		System.out.println(rev);

		// 2. Using character array
		String s1 = "selenium";
		char[] ch = s1.toCharArray();
		String rev1 ="";
		for (int i = s1.length()-1; i >= 0; i--) {
			 rev1 = rev1 +ch[i];
		}
		System.out.println(rev1);
		//3. using stringBuffer
		String r = "java-code";
		StringBuffer sb = new StringBuffer(r);
		System.out.println(sb.reverse());
		String temp =s;
		if(temp.equals(rev)) {
			System.out.println("Given "+temp+" and reversed string is "+rev+" : PALINDROME STRING");
		}
		else {
			System.out.println("Not a palindrome string");
		}
		

	}
}