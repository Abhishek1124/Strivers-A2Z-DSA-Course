package Basics;

public class B5_ArmstrongNumber {

	public static void main(String[] args) {
		int num = 153;
		System.out.println(isArmstrong(num));
	}


	static boolean isArmstrong(int n) {
		int original = n;
		int digits = Integer.toString(n).length(); // count digits
		int sum = 0;

		while (n > 0) {
			int digit = n % 10; 
			sum += Math.pow(digit, digits);
			n /= 10;
		}

		return sum == original;
	}
}
