package assignment3;

public class TwoMaxOfArray {

	// Q5 - Write a Java program to find out the first two max values from an array
	
	public static void main(String[] args) {
		
		
		int arr[] = {1,2,3,4,5,6,9,7,6,2};
		
		
		// sorting array
		
		for(int i = 0; i<arr.length; i++) {
			
			for(int j = i+1; j < arr.length; j++) {
				
				int temp;
				if(arr[i] > arr[j]) {
				
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
					
				}
			}
		}
		
		
		// print array 
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
	


}
