package Basics;

public class R6_ReverseAnArrayUsingRecursion {

	    public static void main(String[] args) {
	        int[] arr = {9, 2, 4, 1, 1};
	        reverse(arr, 0, arr.length - 1);
	        print(arr, 0);
	    }

	    static void reverse(int[] arr, int p1, int p2) {
	        if (p1 >= p2) return;

	        int temp = arr[p1];
	        arr[p1] = arr[p2];
	        arr[p2] = temp;

	        reverse(arr, p1 + 1, p2 - 1);
	    }

	    static void print(int[] arr, int index) {
	        if (index == arr.length) return;
	        System.out.print(arr[index] + " ");
	        print(arr, index + 1);
	    }
	}