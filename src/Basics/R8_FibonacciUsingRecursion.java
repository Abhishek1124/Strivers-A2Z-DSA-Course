package Basics;

public class R8_FibonacciUsingRecursion {

	public static void main(String[] args) {
		int num = 6;
		System.out.println(fibonacci(num));
	}

	static int fibonacci(int n) {
	   if (n == 0) return 0;
       if (n == 1) return 1;
       return fibonacci(n - 1) + fibonacci(n - 2);  
	}
}
