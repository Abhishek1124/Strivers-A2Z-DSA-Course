package Basics;

public class R7_StringPalindromeCheckUsingRecursion {

	public static void main(String[] args) {
		String str = "madam";
		System.out.println(palindromeCheck(0, str));
	}
	
	static boolean palindromeCheck(int i, String s) {
	        if (i >= s.length() / 2) return true;
	        if (s.charAt(i) != s.charAt(s.length() - i - 1)) return false;
	        return palindromeCheck(i + 1, s);
	    }
	}
