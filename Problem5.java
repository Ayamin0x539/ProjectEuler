
public class Problem5 {
	
	public static boolean divisible(double number, double from, double to) {
		boolean answer = true;
		for(double i = from; i<=to; i++) {
			if (number%i != 0) {
				answer = false;
				break;
			}
		}
		return answer;
	}
	
	public static double smallestMultiple(double from, double to) {
		double answer = 0;
		double check = to + 1;
		boolean found = false;
		
		while(!found) {
			if(divisible(check, from, to)) {
				found = true;
				answer = check;
			}
			check++;
		}
		
		return answer;
	}
	
//	This does not require programming at all. Compute the prime factorization of each number from 1 to 20, and multiply the greatest power of each prime together:
//
//		20 = 2^2 * 5
//		19 = 19
//		18 = 2 * 3^2
//		17 = 17
//		16 = 2^4
//		15 = 3 * 5
//		14 = 2 * 7
//		13 = 13
//		11 = 11
//
//		All others are included in the previous numbers.
//
//		ANSWER: 2^4 * 3^2 * 5 * 7 * 11 * 13 * 17 * 19 = 232 792 560
		
	public static double primeFactorAuxiliary(double d) {
		double answer = 0;
		for (double i = 2; i<d; i++) {
			
		}
		
		return answer;
	}
	public static double primeFactor(double from, double to) {
		double answer = 0;
		
		return answer;
	}
	
	public static void main(String args[]) {
		System.out.println(smallestMultiple(1, 20));
	}
}
