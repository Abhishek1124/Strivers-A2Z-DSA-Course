package Arrays;

public class E2_SecondLargestElementWIthoutSorting {

	public static void main(String[] args) {
		int[] num = {8, 8, 7, 6, 5};
		System.out.println(secondLargestElement(num));
	}

	static int secondLargestElement(int[] num) {
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for(int n : num) {
			if(n>largest) {
				largest = n;
			}
			else if(n>secondLargest && n<largest) {
				secondLargest = n;
			}
		}
		return secondLargest;
	}

}
