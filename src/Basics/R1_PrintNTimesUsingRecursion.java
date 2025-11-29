package Basics;

public class R1_PrintNTimesUsingRecursion {

	public static void main(String[] args) {
		String str = "print using recursion";
		int printCount = 5;
		print(str,printCount);
	}
	
	static void print(String s,int printCount) {
		if(printCount == 0) return;		
		print(s,printCount-1);
		System.out.println(s);
	}

}