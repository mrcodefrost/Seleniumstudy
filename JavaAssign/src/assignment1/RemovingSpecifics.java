package assignment1;

import java.util.Scanner;

public class RemovingSpecifics {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String x = sc.nextLine();
		
		System.out.println("Enter Character to be removed");
		String a = sc.nextLine();
		
		System.out.println("Output : ");
		System.out.println(x.replace(a, ""));
		
		
		sc.close();
	}
	
}
