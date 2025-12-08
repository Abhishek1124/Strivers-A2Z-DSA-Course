package Arrays;

public class E11_MajorityElement {

	public static void main(String[] args) {
		int[] nums = {7, 0, 0, 1, 7, 7, 2, 7, 7};
		System.out.println(majorityElement(nums));
	}

	static int majorityElement(int[] nums) {		
		for(int i=1;i<nums.length;i++) {
			for(int j=i-1;j<nums.length;j++) {
				if(nums[i]>nums[j]) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		return nums[nums.length/2];
	}

}
