package assignment1;

import java.util.Arrays;

public class StringAnagram {

	
	public static void main(String[] args) {
		
		
		String s1 = "race";
		
		String s2 = "care";
		
		char[] a1 = s1.toLowerCase().toCharArray();
		char[] a2 = s2.toLowerCase().toCharArray();
		
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		
		if(Arrays.equals(a1, a2)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not an Anagram");
		}
		
		
		// Method 2
		

	
		
		
	}
		
		
			
	
}
