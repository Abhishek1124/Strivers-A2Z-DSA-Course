package Arrays;

import java.util.Arrays;

public class E6_LeftRotateArrayByKTimes {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6};
		rotate(arr,2);
		System.out.println(Arrays.toString(arr));
	}
	
	static void rotate(int[] arr , int k) {
		k = k % arr.length;			// handle k > n
		if (k == 0) return;			// no rotation needed
		
		reverse(arr, 0, k-1);			// reverse first k
		reverse(arr, k, arr.length-1);	// reverse remaining n - k
		reverse(arr, 0, arr.length-1);	// reverse entire array
	}

	static void reverse(int[] arr, int start, int end) {
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
}