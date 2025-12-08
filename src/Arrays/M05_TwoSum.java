package Arrays;

import java.util.HashMap;
import java.util.Arrays;

public class M05_TwoSum {
	
    public static void main(String[] args) {
        int[] nums = {1, 6, 2, 10, 3};
        int target = 7;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if (map.containsKey(diff)) {
                int index1 = map.get(diff);
                int index2 = i;

                return new int[] { Math.min(index1, index2), Math.max(index1, index2) };
            }
            map.put(nums[i], i);
        }

        return new int[] {};
    }
}
