package assignment3;

import java.util.*;


public class IterateHashMap {
	
	
	// Q19: Write a Java Program to iterate HashMap using While and advance for loop.
	
	
	public static void main(String[] args) {
	
		HashMap<String, Double> prices = new HashMap<String, Double>();


		prices.put("Pen", 20.0);
		prices.put("Pencil", 40.0);
		prices.put("Penguin", 50.0);


		System.out.println("using a while loop:");

		Iterator<Map.Entry<String, Double>> iterator = prices.entrySet().iterator();
		
		while (iterator.hasNext()) {
			Map.Entry<String, Double> entry = iterator.next();
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

		System.out.println("using an enhanced for loop:");

		for (Map.Entry<String, Double> entry : prices.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
}
}


