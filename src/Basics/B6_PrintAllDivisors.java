package Basics;

import java.util.ArrayList;
import java.util.List;

public class B6_PrintAllDivisors {

	public static void main(String[] args) {
		int num = 24;
		System.out.println(printAllDivisiors(num));
	}
	
	static List<Integer> printAllDivisiors(int num) {
		ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                ans.add(i);  // smaller divisor
                if (i != num / i) {
                    ans.add(num / i);  // larger divisor
                }
            }
        }
        return ans;
	}
	
}
