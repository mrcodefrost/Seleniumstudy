package assignment3;

import java.util.Scanner;

public class CheckPrime {

	// Q4 - Write a function to reverse a number in Java
	
	public static boolean isItPrime(int number) {
		
		for(int i=2; i<number/2; i++) {
			
			if(number%i==0) 
				return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check if prime");
		int a = sc.nextInt();
		
		
		System.out.println(isItPrime(a));
		
		sc.close();
	}
}
