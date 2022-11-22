package assignment1;

public class PalindromeString {

	
	public static void main(String[] args) {
		
		String s1 = "aca";
		String rev = "";
		boolean pal = false;
		
		
		for(int i=s1.length()-1; i>=0; i--) {
			rev = rev + s1.charAt(i);
		}
		
		for(int i=0; i<s1.length();i++) {
			if(s1.charAt(i) != rev.charAt(i)) {
				System.out.println("not a palindrome");
				pal = false;
			}
			else {
				pal = true;
			}
		}
		
		if(pal)
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
	}
	
}
