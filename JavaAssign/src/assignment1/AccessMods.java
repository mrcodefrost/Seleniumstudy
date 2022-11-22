package assignment1;

public class AccessMods {
 // public class 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		defaultclass obj = new defaultclass();
		
		
		obj.setName("Daksh");
		obj.getName();
		obj.sayName();
		
		// below line will not work cause name is a private variable
		// obj.name; 
		
	}

}

class defaultclass {
	// no explicit access modifier given hence it's a default 
	
	// private variable , this cannot be accessed in another class
	private String name;
	
	
	// Getter
	public void getName() {
		System.out.println(this.name);
	}
	
	// Setter
	public void setName(String name) {
		this.name = name;
	}
	
	
	// protected - can be accessed within same package  
	protected void sayName() {
		System.out.println(name);
	}
}

