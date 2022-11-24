package assignment2;

public class SonDaughter extends MomDad{

	String name; // ye wala instance variable dono classes mein hai 
	
	SonDaughter() {
		
	}
	
	SonDaughter(String name){
		super.name = name;
	}
	
	
	SonDaughter(String nameMom, String nameDad){
		super(nameMom,nameDad);
	}
	
	
	

	void printMomDadname() { // ye wala method MomDad ke name ko print karta hai
		
		System.out.println(super.name); // momDad ka instance variable access karne k liye 
		
	}
	
	void showName() {
		// iske andar kuch bhi ho
		System.out.println("Ye wala SonDaughter ka showName method hai");
	}
	
	void showMomDadname() {
		// ye wala method MomDad ka showName method call karega
		super.showName();
	}
	

	
	
	public static void main(String[] args) {
		
	//  ClassName ObjectName = new KEYWORD Constructor(Argument);
		SonDaughter S = new SonDaughter("Vaishali");
		SonDaughter SDefault = new SonDaughter();
		
		System.out.println(S.name);
		// mein chahta hun ki MomDad wala name print ho
		
		S.printMomDadname();
		S.showName();
		S.showMomDadname();
		

		
		
	}
	
	
}

