package Basics;

public class R3_PrintNto1UsingRecurssion {

	public static void main(String[] args) {
		int num = 10;
		printNumbers(num);
	}
	
	static void printNumbers(int n) {
		if(n == 0) return;
	
		System.out.println(n);
		printNumbers(n-1);
	}

}
