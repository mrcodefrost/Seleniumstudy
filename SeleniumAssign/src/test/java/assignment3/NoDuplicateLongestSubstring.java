package assignment3;

public class NoDuplicateLongestSubstring {

	
	
	// Q6 - Write a Java program to find the longest substring from a given string which doesn’t
	// contain any duplicate characters
	
	public static String longestSubstring(String s) {
	   
	    String substringChars = "";
	    
	    
	    String longestSubstring = "";
	    int longestLength = 0;
	    
	    
	    for (char c : s.toCharArray()) {
	   
	        if (substringChars.indexOf(c) == -1) {
	            substringChars += c;
	            if (substringChars.length() > longestLength) {
	                longestSubstring = substringChars;
	                longestLength = substringChars.length();
	            }
	        }
	     
	        else {
	            substringChars = "";
	            substringChars += c;
	        }
	    }
	    
	    return longestSubstring;
	}
	
	
	public static void main(String[] args) {
		
		
		String  s = "LongggestSubstring";
		
		System.out.println(longestSubstring(s));
		
	}
	
	
	
}
