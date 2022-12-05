package javaPrograms;

public class PrimeNumbers {

	public static void main(String[] args) {
/*if a number is divisible by any of the number between 2 and num/2 it is not a prime
 */
		int low = 23;
		int high = 100;
		
		while (low<=high) {
			boolean flag = true; //imp declaration inside loop
			for (int i = 2; i <= (low / 2); i++) {
				if (low % i == 0) {
					flag = false;
					break;
				}
			}
			
			if (flag) {
				System.out.println(low+" ");
			} 
			low++;	
		}
		//2. method 2
		int x = 38;
		int count=0;
		for(int i =1; i<=x;i++) {
			if(x%i==0) {
				count++;
			}
			
		}
		if(count==2) {
		System.out.println("prime number");
		}
		else {
			System.out.println("Not a prime number");
		}
	}
}
