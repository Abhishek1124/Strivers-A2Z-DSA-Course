package Arrays;

public class M3_LongestSubarrayWithPositiveSumK {

	public static void main(String[] args) {
		int[] num = {0, 2, 1};
		int k = 3;
		System.out.println(longestSubarrayWithSumK(num,k));
	}

	static int longestSubarrayWithSumK(int[] num, int k) {
	    int left = 0;
	    int sum = 0;
	    int maxLength = 0;

	    for (int right = 0; right < num.length; right++) {
	        sum += num[right];

	        while (left <= right && sum > k) {
	            sum -= num[left];
	            left++;
	        }
	        
	        if (sum == k) {
	            maxLength = Math.max(maxLength, right - left + 1);
	        }
	    }

	    return maxLength;
	}
}

// This code is applicable for arrays with only positive and zero values