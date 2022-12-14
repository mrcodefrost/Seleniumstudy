package assignment3;

public abstract class Animals {

	String eat;
	String color;
	
	abstract String whatEat(); //abstract method OR non concrete method
	
//	abstract String watColor() {
//		
//	}
	
	public Animals(String color, String eat) {
		this.eat = eat;
		this.color = color;
	}
	
	public String whatColor() { // concrete method
		return color;
	}
	
}

class Herbivores extends Animals {

	public Herbivores(String color, String eat) {
		super(color, eat);
		
	}

	@Override
	String whatEat() {
		
		return "Herbivores eats grass";
	}
	
	public static void main(String[] args) {
		Herbivores H = new Herbivores("white","grass");
		
		H.whatEat();
	}
}