package Arrays;

public class E10_MaximumConsecutiveOnes {

	public static void main(String[] args) {
		int[] num = {1, 1, 0, 0, 1, 1, 0};
		System.out.println(maxConsecutiveOnes(num));
	}

	static int maxConsecutiveOnes(int[] num) {		
		int count = 0;
		int maxValue = 0;
		
		for(int n: num) {
			if(n==1) {
				count++;
				maxValue = Math.max(count, maxValue);
			}
			else {
				count = 0;
			}
		}
		return maxValue;
	}

}
