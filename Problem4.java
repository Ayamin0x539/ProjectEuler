
public class Problem4 {

	public static boolean isPalindrome(int n) {
		String s = Integer.toString(n);
		String reverse = new StringBuffer(s).reverse().toString();
		return (s.equals(reverse));
	}


	public static void main(String args[]) {
		int lastPalindrome = 0;

		for(int i = 999; i > 99; i--) {
			for (int j = 999; j > 99; j--) {
				if (isPalindrome(j*i) && j*i > lastPalindrome) {
					lastPalindrome = j*i;
				}
			}
		}

		System.out.println(lastPalindrome);

	}
}
