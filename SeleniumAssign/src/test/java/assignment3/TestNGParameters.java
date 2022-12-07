package assignment3;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameters {
	
	// Q15: How to pass a string value to a test using the “TestNG.XML” file
@Parameters("string")
@Test
public void testMethod(String value) {
 // Use the parameter value in the test
	
 System.out.println("String value: " + value);
}
}
