package Basics;

public class B1_CountDigits {

	public static void main(String[] args) {
		int num = 12345;
		System.out.println(count(num));
	}

	static int count(int num) {
		int count = 0;

		while(num != 0)
			{
				num = num/10;
				++count;
			}
		
		return count;
	}

}
