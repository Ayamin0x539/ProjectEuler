
public class Problem9 {
	// Add squares of numbers 1-997 (around 10000 multiplications) and see if
	// the result is a rational number. If so, it's a pythagorean triplet.
	// See if the three numbers a, b, and c (being the sqrt of the result)
	// add up to 1000. If so, return a*b*c.
	
	public static long answer = 1;
	public static int a, b, c;
	
	public static void pythTriplet() {
		boolean found = false;
		for (a = 1; a<500; a++) {
			for (b = 1; b<500; b++) {
				double d = Math.sqrt(a*a + b*b);
				if (d % 1 == 0 && a+b+d == 1000) {
					c = (int)d;
					answer = a*b*c;
					found = true;
					break;
				}
				if (found) break;
			}
			if (found) break;
		}
	}
	public static void main(String args[]) {
		pythTriplet();
		System.out.println(answer);
		System.out.println("a is " + a);
		System.out.println("b is " + b);
		System.out.println("c is " + c);
	}
}
