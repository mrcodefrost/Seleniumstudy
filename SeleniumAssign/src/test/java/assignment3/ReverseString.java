package assignment3;

public class ReverseString {

	// Q9) - Write a Java program to demonstrate string reverse with and without StringBuffer class?
	
	public static void main(String[] args) {
		
		
		String s = "Hello";
		
		// With StringBuffer
		
		StringBuffer obj = new StringBuffer(s);
		System.out.println(obj.reverse());
		
		// Without StringBuffer
		
		for(int i=s.length()-1; i>=0;i--) {
			System.out.print(s.charAt(i));
		}
		
	}
	
}
