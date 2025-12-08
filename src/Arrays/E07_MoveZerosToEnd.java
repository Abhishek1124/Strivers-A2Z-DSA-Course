package Arrays;

import java.util.Arrays;

public class E07_MoveZerosToEnd {

	public static void main(String[] args) {
		int[] arr = {1, 0, 3, 0, 5, 6};
		moveZeroesTwoPointers(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	static void moveZeroesTwoPointers(int[] nums) {
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
        }
    }

}
