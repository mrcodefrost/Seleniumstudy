package collections;

public class DiagnolSum {
	  public static void main(String[] args) {
	   
		int[][] array = {
	      {1, 2, 3, 0},
	      {4, 5, 6, 0},
	      {7, 8, 9, 0},
	      {7, 8, 9, 0}
	    };

	    int primarySum = 0;
	    for (int i = 0; i < array.length; i++) {
	      primarySum += array[i][i];
	    }

	    
	    int secondarySum = 0;
	    for (int i = 0; i < array.length; i++) {
	      secondarySum += array[i][array.length - i - 1];
	    }

	    int reverseSum = 0;
	    
	    
	    
	    System.out.println("Primary diagnol sum: " + primarySum);
	    System.out.println("Secondary diagnol sum: " + secondarySum);
	  }
	}
