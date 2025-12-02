package Arrays;

public class E9_FindMissingNumber {

	public static void main(String[] args) {
		int[] num = {1, 3, 6, 4, 5};
		int N = num.length+1;
		System.out.println(missingNumber(num,N));
	}

	static int missingNumber(int[] num, int N) {		
		int sum = (N * (N + 1)) / 2;

        int actualSum = 0;
        for (int i = 0; i < N - 1; i++) {
            actualSum += num[i];
        }
        
        return sum-actualSum;
	}

}
