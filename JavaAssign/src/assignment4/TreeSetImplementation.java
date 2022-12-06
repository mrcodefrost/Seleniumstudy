package assignment4;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetImplementation {

	public static void main(String[] args) {
		
		
		Set<String> treeObject = new TreeSet<>();
		
		treeObject.add("Daksh");
		treeObject.add("One");
		treeObject.add("Two");
		
		// removes duplicate element
		treeObject.add("Two");
		
		// Normal Printing
		System.out.println(treeObject);

		// Using Iterator
		Iterator<String> it = treeObject.iterator();
		
		while (it.hasNext())
		{
		System.out.print(it.next() + " | ");
		}
		
	}
	
	
}
