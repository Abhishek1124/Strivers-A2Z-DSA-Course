package Arrays;

public class M2_NumberAppearedOnlyOnce {

	public static void main(String[] args) {
		int[] num = {1, 2, 2, 4, 3, 1, 4};
		System.out.println(singleOccurance(num));
	}

	static int singleOccurance(int[] arr) {		
		int xorr = 0;
		for (int n : arr) {
            xorr ^= n;
        }
		
        return xorr;
	}

}
