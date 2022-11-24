package assignment2;

public class Smartphones {

	String brand;
	String model;
	String color;
	double price = 10000.00;
	
	
	
	Smartphones(String brand, String model, String color){
		
		this.brand = brand;	// this keyword to refer to class instance variable
		this.model = model; // this keyword to refer to class instance variable
		this.color = color; // this keyword to refer to class instance variable
		

	}
	
	
	Smartphones(String brand, String model, String color,double price){

		this(brand,model,color); //using this() for constructor calling
		this.price = price;		// this keyword to refer to class instance variable
	}
	
	void show() {
		System.out.println(brand);
		System.out.println(model);
		System.out.println(color);
		System.out.println(price);
		System.out.println("=================");
	}
	
	
	
	
}

