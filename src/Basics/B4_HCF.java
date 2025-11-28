package Basics;

public class B4_HCF {

	public static void main(String[] args) {
		int num1 = 24;
		int num2 = 9;
		System.out.println(HCF(num1,num2));
	}
	
	static int HCF(int num1, int num2) {
		while (num2 != 0) {
	        int temp = num2;
	        num2 = num1 % num2;
	        num1 = temp;
	    }
	    return num1;
	}
	
}

