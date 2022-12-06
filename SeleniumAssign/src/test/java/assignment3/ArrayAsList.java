package assignment3;

import java.util.ArrayList;
import java.util.List;

public class ArrayAsList {

	// Q1 - Write code to filter duplicate elements from an array and print as a
	// list

	public static List<Integer> filterDuplicates(int[] array) {
		List<Integer> list = new ArrayList<Integer>();
		for (int x : array) {
			if (!list.contains(x)) {
				list.add(x);
			}
		}
		return list;
	}

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 1, 2, 4, 5, 5, 6, 6, 6 };
		List<Integer> filtered = filterDuplicates(array);
		System.out.println("Filtered array: " + filtered);
	}

}