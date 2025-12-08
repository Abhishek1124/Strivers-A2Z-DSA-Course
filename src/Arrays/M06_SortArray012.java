package Arrays;

import java.util.Arrays;

public class M06_SortArray012 {

	public static void main(String[] args) {
		int[] nums = {1, 0, 2, 1, 0};
		sortArray(nums);
		System.out.println(Arrays.toString(nums));
	}

	static void sortArray(int[] nums) {		
		int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, mid, low);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, high);
                high--;
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}