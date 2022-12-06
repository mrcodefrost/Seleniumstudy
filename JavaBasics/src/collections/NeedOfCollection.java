package collections;

public class NeedOfCollection {

	public static void main(String[] args) {
		
		
		int a = 10;
		int b = 1;
		int c = 10;
		
		int[] arr = new int[100];
		
		// limitations of an array
		// 1. Arrays are fixed in size
		// 2. Arrays can hold only homogeneous data type
		
		
		Student[] students = new Student[5];
		students[0] = new Student();
		students[1] = new Student();
		// students[2] = new Book();
		
		Object[] objects = new Object[10];
		objects[0] = new Student();
		objects[1] = new Student();
		objects[2] = new Book();
		
		// ready-made API support is not available
		
	}
	
	
}

 class Book{}
 class Student{}
