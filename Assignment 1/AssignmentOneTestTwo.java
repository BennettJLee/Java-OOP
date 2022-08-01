public class AssignmentOneTestTwo {

	public static void main(String[] args){

		// (1) Testing a larger problem on the ordered ABC list
		System.out.println("(3) Testing a larger problem on the ordered ABC list");
		// Define a test string to work with
		String testString = "The Quick Brown Fox Jumped Over The Lazy Dog";
		// Create list 
		OrderedABCList orderedAbcList = new OrderedABCList();
		// Iterate through characters in the string and insert them into the ordered list
		for(int i = 0; i < testString.length(); i++){
			char c = testString.charAt(i);
			orderedAbcList.insert(c);
		}
		// print the list
		orderedAbcList.dump();
		// Remove one space character
		orderedAbcList.remove(' ');
		// print the list
		orderedAbcList.dump();
		// Remove all space characters from the list
		while(orderedAbcList.has(' ')){
			orderedAbcList.remove(' ');
		}
		// Re-print the list
		orderedAbcList.dump();

		System.out.println("\n");
		
		// (2) Repeat but first convert all characters to lower case
		System.out.println("(4) Repeat but first convert all characters to lower case");
		// Reset list
		orderedAbcList = new OrderedABCList();
		// Convert test string to all lower case
		testString = testString.toLowerCase();
		// Iterate through characters in the string and insert them into the ordered list
		for(int i = 0; i < testString.length(); i++){
			char c = testString.charAt(i);
			orderedAbcList.insert(c);
		}
		// Remove all space characters
		while(orderedAbcList.has(' ')){
			orderedAbcList.remove(' ');
		}
		// Print the list
		orderedAbcList.dump();
	}

}