package assignment1;

public class SecondLargest {

	
	public static void main(String[] args) {
		
		
		int[] arr = {12,3,4,5,6};
		
		// Sorting Array - ascending
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				
				int temp=0;
				if(arr[j]<arr[i]) {
					temp = arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
				
			}
		}
		
		// Picking the 2nd last index
		System.out.println("Second Largest Element : "+ arr[arr.length-2]);

		
	}
	
}
