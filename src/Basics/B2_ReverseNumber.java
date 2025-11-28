package Basics;

public class B2_ReverseNumber {

	public static void main(String[] args) {
		int num = 12345;
		System.out.println(reverse(num));
	}

	static int reverse(int num) {
		int reversed = 0;
		while(num>0) {
			int rem = num % 10;
			reversed = reversed * 10 + rem;
			num = num / 10;
		}
		return reversed;
	}

}
