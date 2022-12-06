package assignment3;

public class SwapWithoutTemp {

	// Q8 - Write Java code to swap two numbers without using a temporary variable
	
	public static void main(String[] args) {
		
		
		int a=10, b =20;
		
		System.out.println("Before swap: " + a + " " + b);
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("After swap: " + a + " " + b);
		
	}
}
