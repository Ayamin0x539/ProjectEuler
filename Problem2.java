
public class Problem2 {
	public static double next = 1;
	public static double previous = 0;
	public static double sum = 0;

	public static double fibonacci() {
		double temp = next;
		next += previous;
		previous = temp;
		return next;
	}

	public static void main(String args[]) {
		for(int i = 1; i<4000000; i++) {
			double current = fibonacci();
			if (current % 2 == 0 && current < 4000000) {
				sum += current;
			}
		}
		
		System.out.println(sum);
	}
}
