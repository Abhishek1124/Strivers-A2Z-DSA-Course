package Arrays;

public class E01_LargestElementInArray {

	public static void main(String[] args) {
		int[] num = {3, 3, 6, 1};
		System.out.println(largestElement(num));
	}

	static int largestElement(int[] num) {
		int largest = Integer.MIN_VALUE;

		for(int n : num) {
			if(n>largest) {
				largest = n;
			}
		}
		return largest;
	}

}
