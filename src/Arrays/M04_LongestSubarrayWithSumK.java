package Arrays;

import java.util.HashMap;
import java.util.Map;

public class M04_LongestSubarrayWithSumK {

	public static void main(String[] args) {
		int[] num = {-3, 2, 1};
		int k = 3;
		System.out.println(longestSubarrayWithSumK(num,k));
	}

	static int longestSubarrayWithSumK(int[] num, int k) {
		int n = num.length;
        Map<Integer, Integer> preSumMap = new HashMap<>();
        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            sum += num[i];

            if (sum == k) {
                maxLen = i + 1;
            }

            int rem = sum - k;
            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }

        return maxLen;
    }
}

// This code is applicable for arrays with positive, negative and zero values