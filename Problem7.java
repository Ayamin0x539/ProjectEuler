import java.text.DecimalFormat;
import java.text.NumberFormat;


public class Problem7 {
	private static double currentPrime = 3;
	private static int index = 2;
	private static boolean negative = true;
	private static double i = 1;
	
	// This one. Operates on O(sqrt(n)) time.
	public static boolean isPrime(double number) {
		boolean answer = true;
		if (number%2 == 0) return false;
		for (double count = 3; count*count<=number; count+=2) {
			if (number%count == 0) {
				answer = false;
				break;
			}
		}
		return answer;
	}
	//////

	public static void nextPrime() {
		boolean keepGoing = true;
		while(keepGoing) {
			if (negative) {
				currentPrime = 6*i - 1;
				negative = false;
			}
			else {
				currentPrime = 6*i + 1;
				negative = true;
				i++;
			}
			if(isPrime(currentPrime)) {
				keepGoing = false;
				index++;
			}
		}
	}
	
	public static double nthPrime(int n) {
		while(index<n) {
			nextPrime();
		}
		return currentPrime;
	}
	
	public static void main(String args[]) {
		long startTime = System.nanoTime();
		
		System.out.println(nthPrime(1000000));
		
		long endTime = System.nanoTime();
		double inMilli = (endTime - startTime)/1000000.00;
		
		System.out.println("Algorithm took "+(endTime - startTime) + " nanoseconds.");
		System.out.println("That's " + inMilli + " milliseconds.");
	}
}
