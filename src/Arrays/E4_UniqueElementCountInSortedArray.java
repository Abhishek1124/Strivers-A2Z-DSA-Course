package Arrays;

public class E4_UniqueElementCountInSortedArray {

	public static void main(String[] args) {
		int[] arr = {0, 0, 3, 3, 5, 6};
		System.out.println(UniqueElementCount(arr));

	}

	static int UniqueElementCount(int[] arr) {

        int i = 0;
        
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }
        
        return i + 1;
	}

}
