package Basics;

import java.util.HashMap;

public class H2_HighestOccuringElementInArray {

	public static void main(String[] args) {
		int[] num = { 3, 2, 2, 1, 3, 2};
		System.out.println(highestOccuringElement(num));
	}

	static int highestOccuringElement(int[] n) {
		var map = new HashMap<Integer,Integer>();
		int result = Integer.MIN_VALUE;
		int element = -1;

		for(int i : n) {
			if(!map.containsKey(i)) {
				map.put(i, 1);
			}
			else {
				map.put(i, map.get(i)+1);
			}
		}

		for (int key : map.keySet()) {
			if (map.get(key) > result) {
				result = map.get(key);
				element = key;
			}
		}

		return element;
	}
}