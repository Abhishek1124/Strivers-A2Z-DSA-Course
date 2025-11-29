package Basics;

public class R4_SumOfFirstNNumbersUsingRecursion {

	public static void main(String[] args) {
		int num = 5;
		System.out.println(sumOfNumbers(num));
	}
	
	static int sumOfNumbers(int n) {
		if(n == 0) return 0;
		return n+sumOfNumbers(n-1);
	}

}
