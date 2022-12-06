package assignment3;

import java.util.Scanner;

public class ReverseNumberFunction {

	// Q3- Write a function to reverse a number in Java
	
	
	public static int reverseNumber(int number) {
		
		
		int sum =0;
		
		while(number != 0) {
			sum = sum*10 + number%10;
			number = number/10;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to reverse");
		int a = sc.nextInt();

		System.out.println(reverseNumber(a));
		
		sc.close();

	}
	
	
	
}
