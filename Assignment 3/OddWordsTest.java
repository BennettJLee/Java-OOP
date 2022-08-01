import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions.*;
import java.io.*;
//javac -cp "junit-platform-console-standalone-1.8.2.jar" *.java
//java -jar junit-platform-console-standalone-1.8.2.jar -cp .\ -c OddWordsTest
public class OddWordsTest{
	private final PrintStream standardOut = System.out;
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

	@BeforeEach
	public void setOut() {
		System.setOut(new PrintStream(outputStreamCaptor));
	} 

	@Test
	@DisplayName("search test, dependent on single insert")
	public void searchTestforSingleInsert(){
		// Assign
		OddWords oddWords = new OddWords();
		// Act
		oddWords.search("quick");
		String actual = outputStreamCaptor.toString().trim();
		// Assert
		Assertions.assertEquals(actual, "quick INSERTED");
	}

	@Test
	@DisplayName("search test, dependent on multiple insert")
	public void searchTestforMultipleInsert(){
		// Assign
		OddWords oddWords = new OddWords();
		// Act
		oddWords.search("quick");
		oddWords.search("brown");
		oddWords.search("fox");
		String actual = outputStreamCaptor.toString().trim();
		// Assert
		Assertions.assertEquals(actual, "quick INSERTED" + System.lineSeparator() + "quick brown INSERTED" + System.lineSeparator() + "quick brown fox INSERTED");
	}

	@Test
	@DisplayName("search test, dependent on remove")
	public void searchTestforSingleRemove(){
		// Assign
		OddWords oddWords = new OddWords();
		// Act
		oddWords.search("quick");
		oddWords.search("quick");
		String actual = outputStreamCaptor.toString().trim();
		// Assert
		Assertions.assertEquals(actual, "quick INSERTED" + System.lineSeparator() +"quick DELETED");
	}

	@Test
	@DisplayName("search test, dependent on remove")
	public void searchTestforMultipleRemove(){
		// Assign
		OddWords oddWords = new OddWords();
		// Act
		oddWords.search("quick");
		oddWords.search("brown");
		oddWords.search("fox");
		oddWords.search("brown");
		oddWords.search("fox");
		String actual = outputStreamCaptor.toString().trim();
		// Assert
		Assertions.assertEquals(actual, "quick INSERTED" + System.lineSeparator() + "quick brown INSERTED" + System.lineSeparator() + "quick brown fox INSERTED" + System.lineSeparator() + "quick brown DELETED" + System.lineSeparator() + "quick fox DELETED");
	}

}