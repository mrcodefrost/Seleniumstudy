package assignment2;

	public class MomDad { // parent class

	// instance variables
		String nameMom;
		String nameDad;
		String name = "Daksh";
		String momAge;
		
	// Constructor = Default
		MomDad(){
			System.out.println("ye wala default constructor");
		}
		
	// Constructors - Parameterized 
		MomDad(String nameMom, String nameDad){ // you can take 2 variables entries
			this.nameMom = nameMom; // instance variable wala nameMom = constructor wala nameMom
			this.nameDad = nameDad;
			
		}
	// Constructors - Parameterized 2	
		MomDad(String nameMom, String nameDad, String momAge){ // you can take 3 variables entries
			this(nameMom, nameDad);
			this.momAge = momAge;
		}
		
	// Constructors - Parameterized 3
		MomDad(String nameMom, String nameDad, String momAge, String name){ // you can take 3 variables entries
			this(nameMom,nameDad, momAge);
			this.name=name;
		}
		

		
	// showName naam ka method number 1 
		void showName() {
			System.out.println("Ye wala MomDad class ka method hai");
		}
		
		
		// Same Naam ki problem - This And Super
		
		// Situations in which same name problem occurs 
		// Same instance Variables in both classes
		// Same constructor in same class
		// Same Methods name in both class
	
}



