

public class Problem6 {
	
	public static double sumSquares(double upTo) {
		double answer = 1;
		for (double i = 2; i<=upTo; i++) {
			answer+=i*i;
		}
		return answer;
	}
	
	public static double squareSum(double upTo) {
		double answer = 1;
		for (double i = 2; i<=upTo; i++) {
			answer+=i;
		}
		return answer*answer;
	}
	
	public static double sumSquareDifference(double upTo) {
		return squareSum(upTo) - sumSquares(upTo);
	}
	
	public static double sumSquares2(double n) {
		return n * (n+1) * (2*n+1) / 6;
	}
	public static double squareSum2(double n) {
		return n*n*(n+1)*(n+1)*0.25;
	}
	public static double sumSquareDifference2(double upTo) {
		return squareSum2(upTo) - sumSquares2(upTo);
	}
	
	public static void main(String args[]) {
		double a = 100;
		System.out.println(sumSquares(a));
		System.out.println(squareSum(a));
		System.out.println(sumSquareDifference(a));
		
		System.out.println(sumSquares2(a));
		System.out.println(squareSum2(a));
		System.out.println(sumSquareDifference2(a));
		
//				(1 + 2 + ... + n)^2 = n^2 * (n+1)^2 * 1/4 (square of sum)
//
//				1^2 + 2^2 + ... + n^2 = n * (n+1) * (2n+1) * 1/6 (sum of square)
//
//				Thus easily applicable to any n.
	}
}
