package Arrays;

public class E8_LinearSearch {

	public static void main(String[] args) {
		int[] num = {2, 3, 4, 5, 3};
		int target = 5;

		System.out.println(search(num,target));
	}

	static int search(int[] num, int target) {		
		for(int i=0; i<num.length ;i++) {
			if(num[i] == target) {
				return i;
			}
		}
		return -1;
	}

}
