package assignment3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringListSorting {

	// Q2) Write code to sort the list of strings using Java collection
	
    public static void sortStrings(List<String> strings) {
        Collections.sort(strings);
    }

    public static void main(String[] args) {
        
        List<String> strings = Arrays.asList("hello", "hey", "hi", "daksh");
        sortStrings(strings);
        System.out.println("Sorted strings: " + strings);
    }

}
