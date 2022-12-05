package javaPrograms;

public class CheckIfSumOfTwoPrimes {
//check if a number can be written as sum of two prime numbers
	// 34 = 3+31, 29+5, 11+23, 17+17
	public static void main(String[] args) {
		int num = 50;
		boolean flag = false;
		for (int i = 2; i<=num/2; i++) {
			if(checkIfPrime(i)) {
			if (checkIfPrime(num - i) ) {
				System.out.println(num + "=" + i + "+" + (num - i));
				flag = true;
			}
		}
		}
		if(!flag) {
			System.out.println("cannot write as sum of two primes");
		}
	}

	public static boolean checkIfPrime(int num) {
		boolean isprime = true;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				isprime = false;
				break;
			}
		}
		return isprime;
	}
}
