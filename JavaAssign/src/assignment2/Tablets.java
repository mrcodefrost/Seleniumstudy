package assignment2;

public class Tablets  extends Smartphones{

	Tablets(String brand, String model, String color) {
		super(brand, model, color);
		
		System.out.println("Tablet Constructor using Super()");
		
	}
	
	void show() {
		System.out.println("Tablet Details");
		
	}
	
	
	void display() {
		show();  		// calling child class - show method
		super.show(); // calling parent class - show method
	}
	

	public static void main(String[] args) {
		
		
		Tablets T1 = new Tablets("LG", "Phab", "Gold");
		T1.display();
		
		
	}

	
	
	
}
