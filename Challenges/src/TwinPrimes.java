import java.util.Scanner;

public class TwinPrimes {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int num = input.nextInt();
		if(num<=2) System.out.println("Smallest prime is 2");
		else {
			System.out.println("Twin primes less than " + num + " are: ");
			for(int i=2;i<num;i++) {
				if((twinPrime(i))&&(twinPrime(i+2))) {
					System.out.println("(" + i + "," + (i+2) + ")");
				}
			}
		}
	}
	
	public static boolean twinPrime(int num) {
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) return false;
		}
		return true;
	}
}
