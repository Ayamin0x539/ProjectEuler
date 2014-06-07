import java.text.DecimalFormat;
import java.text.NumberFormat;


public class PrimalityTest {
	private double currentPrime = 2;
	private int index = 1;
	
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
	
	public static boolean primeBruteForce(double number) {
		boolean answer = true;
		for (double i = 2; i<number; i++) {
			if (number%i == 0) {
				answer = false;
				break;
			}
		}
		return answer;
	}
	public static void nextPrime() {
		
	}
	
	public static void main(String args[]) {
		
		long startTime = System.nanoTime();
		
		System.out.println(isPrime(982451653));
		
		long endTime = System.nanoTime();
		double inMilli = (endTime - startTime)/1000000.00;
		
		System.out.println("O(sqrt(n)) took "+(endTime - startTime) + " nanoseconds.");
		System.out.println("That's " + inMilli + " milliseconds.");
		
		long startTime2 = System.nanoTime();
		
		System.out.println(primeBruteForce(982451653));
		
		long endTime2 = System.nanoTime();
		double inMilli2 = (endTime2 - startTime2)/1000000.00;
		
		System.out.println("O(n) took "+(endTime2 - startTime2) + " nanoseconds.");
		System.out.println("That's " + inMilli2 + " milliseconds.");
		
		
	}
}
