package assignment3;

import java.util.*;


public class IterateHashMap {
	
	public static void main(String[] args) {
	
		HashMap<String, Double> prices = new HashMap<String, Double>();


		prices.put("Apple", 20.0);
		prices.put("Orange", 40.0);
		prices.put("Banana", 50.0);


		System.out.println("Iterating over map using a while loop:");

		Iterator<Map.Entry<String, Double>> iterator = prices.entrySet().iterator();
		
		while (iterator.hasNext()) {
			Map.Entry<String, Double> entry = iterator.next();
			System.out.println(entry.getKey() + ": $" + entry.getValue());
		}

		System.out.println("Iterating over map using an enhanced for loop:");

		for (Map.Entry<String, Double> entry : prices.entrySet()) {
			System.out.println(entry.getKey() + ": $" + entry.getValue());
		}
}
}


