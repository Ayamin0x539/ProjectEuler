
public class Problem1 {

	public static int function() {
		int answer = 0;
		for (int n = 1; n < 1000; n++) {
			if (n%5 == 0 || n%3 == 0) {
				answer += n;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println("The answer is " + function());
	}
}
