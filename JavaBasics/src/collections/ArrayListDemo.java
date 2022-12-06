package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

//	An Arraylist is a resizeable array
//	Internally uses an array to store elements
//	Allows element retrievel using index
//	Allows duplicate and null values
//	Ordered collection - maintains the insertion order
//	Cannot create arraylist of primitive types like int char
//	Need to use boxed types like Integer, Character, Boolean
//	Is not synchronized. Multi-threading will produce NDR
//	Explicit sychronization needed to multi-thread
	
	
	public static void main(String[] args) {
		
		List<String> fruits = new ArrayList<>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Mango");
		
		System.out.println(fruits);
		
		
		List<Integer> firstPrimeNumbers =  new ArrayList<>();
		firstPrimeNumbers.add(2);
		firstPrimeNumbers.add(5);
		firstPrimeNumbers.add(7);
		firstPrimeNumbers.add(11);
		firstPrimeNumbers.add(13);


		
		

		

		
	}
	
}
