import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions.*;
import java.io.*;
//javac -cp "junit-platform-console-standalone-1.8.2.jar" *.java
//java -jar junit-platform-console-standalone-1.8.2.jar -cp .\ -c MedicalCentreTest
public class MedicalCentreTest{
	private final PrintStream standardOut = System.out;
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

	@BeforeEach
	public void setOut() {
		System.setOut(new PrintStream(outputStreamCaptor));
	} 

	@Test
	@DisplayName("invalid file test")
	public void invalidFileTest(){
		// Assign
		MedicalCentre medicalCentre = new MedicalCentre();
		// Act
		medicalCentre.processQueue("invalidFile");
		String actual = outputStreamCaptor.toString().trim();
		// Assert
		Assertions.assertEquals(actual, "An error occurred.");
	}

	@Test
	@DisplayName("ProcessQueue insert test")
	public void insertTest(){
		// Assign
		MedicalCentre medicalCentre = new MedicalCentre();
		// Act
		medicalCentre.processQueue("patients_small.txt");
		String actual = outputStreamCaptor.toString().trim();
		// Assert
		Assertions.assertEquals(actual, "Priority: 1, Name: Amanda Lopez, Age: 91, Medical severity level: medium, Patient number: 2" + System.lineSeparator() +
			"Priority: 1, Name: Jesse Curry, Age: 7, Medical severity level: high, Patient number: 3" + System.lineSeparator() + 
			"Priority: 2, Name: John Schmidt, Age: 25, Medical severity level: medium, Patient number: 4" + System.lineSeparator() + 
			"Priority: 3, Name: Emily Hughes, Age: 84, Medical severity level: low, Patient number: 5" + System.lineSeparator() + 
			"Priority: 3, Name: Michael Howard, Age: 9, Medical severity level: low, Patient number: 1");
	}
}