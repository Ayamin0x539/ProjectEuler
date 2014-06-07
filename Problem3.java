
public class Problem3 {
	
	public static boolean isPrime(double d) {
		for (double n = 2; n < d; n++) {
			if (d%n == 0)
				return false;
		}
		return true;
	}
	
	public static boolean isDivisible(double d, double n) {
		return (d%n == 0);
	}
	
	public static double nthFactor(double d, double start) {
		for (double i = start; i<d; i++) {
			if (d%i == 0)
				return i;
		}
		return 0;
	}
	
	public static double largestFactor(double d, double start) {
		double answer = d/nthFactor(d, start);
		return answer;
	}
	
	public static double largestPrimeFactor(double d) {
		double start = 2;
		for (double c=0; c<d; c++) {
			if (isPrime(largestFactor(d, start))) {
				return largestFactor(d, start);
			}
			else {
				start = nthFactor(d, start) + 1;
			}
		}
		return 0;
		
	}
	
	public static void main(String args[]) {
		System.out.println(largestPrimeFactor(600851475143.00));
	}
}
