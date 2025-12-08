package Arrays;

public class E03_ArraySortCheck {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(isSorted(arr));

	}

	static boolean isSorted(int[] arr) {
		boolean ascending = true;
		boolean descending = true;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < arr[i - 1]) {
				ascending = false;
			}
			if (arr[i] > arr[i - 1]) {
				descending = false;
			}
		}

		return ascending || descending;
	}
}
