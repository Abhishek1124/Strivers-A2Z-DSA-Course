package Basics;

import java.util.ArrayList;
import java.util.HashMap;

public class H1_CountArrayElements {

	public static void main(String[] args) {
		int[] n = { 3, 2, 2, 1, 3};
		System.out.println(elementCount(n));
	}

	static ArrayList<ArrayList<Integer>> elementCount(int[] n) {
		var map = new HashMap<Integer,Integer>();
		for(int i : n) {
			if(!map.containsKey(i)) {
				map.put(i, 1);
			}
			else {
				map.put(i, map.get(i)+1);
			}
		}
		
		 ArrayList<ArrayList<Integer>> result = new ArrayList<>();
	        for (int key : map.keySet()) {	
	            ArrayList<Integer> pair = new ArrayList<>();
	            pair.add(key);
	            pair.add(map.get(key));
	            result.add(pair);
	        }
	        
	     return result;
	}
}