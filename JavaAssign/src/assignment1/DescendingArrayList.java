package assignment1;
import java.util.*;

public class DescendingArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("mercedes");
		list.add("audi");
		list.add("nissan");
		list.add("aston martin");
		
		System.out.println("Before Sorting :" + list);
		
		Collections.sort(list, Collections.reverseOrder());
		
		System.out.println("Sorted   : " + list);
	}
	
}
