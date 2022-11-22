package assignment1;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		
		
		// Program 1 - File Creation
		try {
			File obj = new File("myfile.txt");
			if(obj.createNewFile()) {
				System.out.println("File Created: " + obj.getName());
			}
			
			else {
				System.out.println("File Already Exists");
			}
				
		}
		
		catch(IOException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
		
		
		
		// Program 2 - Writing in File
		
		
		try {
			FileWriter Writer = new FileWriter("myfile.txt");
			
			Writer.write("This is the first line");
			
			
			Writer.close();
			System.out.println("Line Written");
		}
		catch(IOException e) {
			System.out.println("Error in Writing");
			e.printStackTrace();
		}
		
		
		
		// Program 3 - Reading from File
		
		
		
	}
	
	
}
