import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions.*;
import java.io.*;
//javac -cp "junit-platform-console-standalone-1.8.2.jar" *.java
//java -jar junit-platform-console-standalone-1.8.2.jar -cp .\ -c PriorityQueueTest
public class PriorityQueueTest{
	private final PrintStream standardOut = System.out;
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

	@BeforeEach
	public void setOut() {
		System.setOut(new PrintStream(outputStreamCaptor));
	} 
	
	@Test
	@DisplayName("insert test, dependent on dump")
	public void insertTestdependentDump(){
		// Assign
		PriorityQueue priorityQueue = new PriorityQueue(3);
		// Act
		priorityQueue.insert(new Node(3));
		priorityQueue.insert(new Node(1));
		priorityQueue.insert(new Node(2));
		priorityQueue.dump();
		String actual = outputStreamCaptor.toString().trim();
		// Assert
		Assertions.assertEquals(actual, "Root Priority: 1; Left Priority: 3; Right Priority: 2;" + System.lineSeparator() + "Root Priority: 3; Left null; Right null;" + System.lineSeparator() + "Root Priority: 2; Left null; Right null;");
	}

	@Test
	@DisplayName("delete test")
	public void deleteTest(){
		// Assign
		PriorityQueue priorityQueue = new PriorityQueue(0);
		// Act
		priorityQueue.insert(new Node(3));
		String actual = outputStreamCaptor.toString().trim();
		// Assert
		Assertions.assertEquals(actual, "ArrayIndexOutOfBoundsException thrown");
	}
}