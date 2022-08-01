import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions.*;
import java.io.*;
//javac -cp "junit-platform-console-standalone-1.8.2.jar" *.java
//java -jar junit-platform-console-standalone-1.8.2.jar -cp .\ -c BinarySearchTreeTest
public class BinarySearchTreeTest{
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
		BinarySearchTree bst = new BinarySearchTree();
		// Act
		bst.insert("A");
		bst.dump();
		String actual = outputStreamCaptor.toString().trim();
		// Assert
		Assertions.assertEquals(actual, "A");
	}

	@Test
	@DisplayName("insert() test, dependent on search()")
	public void insertTestdependentSearch(){
		// Assign
		BinarySearchTree bst = new BinarySearchTree();
		// Act
		bst.insert("A");
		boolean actual = bst.search("A");
		// Assert
		Assertions.assertTrue(actual);
	}

	@Test
	@DisplayName("insert test(), dependent on height()")
	public void insertTestdependentHeight(){
		// Assign
		BinarySearchTree bst = new BinarySearchTree();
		// Act
		bst.insert("D");
		bst.insert("B");
		bst.insert("A");
		bst.insert("C");
		bst.insert("E");
		bst.insert("F");
		bst.insert("G");
		int actual = bst.height();
		// Assert
		Assertions.assertEquals(actual, 3);
	}

	@Test
	@DisplayName("remove() test, dependent on dump()")
	public void removeTestdependentDump(){
		// Assign
		BinarySearchTree bst = new BinarySearchTree();
		// Act
		bst.insert("A");
		bst.insert("B");
		bst.remove("B");
		bst.dump();
		String actual = outputStreamCaptor.toString().trim();
		// Assert
		Assertions.assertEquals(actual, "A");
	}

	@Test
	@DisplayName("remove() test, dependent on search()")
	public void removeTestdependentSearch(){
		// Assign
		BinarySearchTree bst = new BinarySearchTree();
		// Act
		bst.insert("A");
		bst.remove("A");
		boolean actual = bst.search("A");
		// Assert
		Assertions.assertFalse(actual);
	}

}