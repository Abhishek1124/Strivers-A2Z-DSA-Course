package Basics;

public class R2_Print1toNUsingRecursion {

	public static void main(String[] args) {
		int num = 10;
		printNumbers(num);
	}
	
	static void printNumbers(int n) {
		if(n == 0) return;
		
		printNumbers(n-1);
		System.out.println(n);
	}

}
