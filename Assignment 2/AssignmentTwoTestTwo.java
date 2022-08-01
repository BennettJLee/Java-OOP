public class AssignmentTwoTestTwo {

	public static void main(String[] args){

		Parser parser = new Parser();

		// Testing the examples given in the assignment specs
		String testString1 = "()()";	// true
		String testString2 = "()()("; 	// false
		String testString3 = "))()((";	// false

		boolean result1 = parser.check(testString1);
		boolean result2 = parser.check(testString2);
		boolean result3 = parser.check(testString3);

		System.out.println("\nTesting the examples given in the assignment specs:");
		System.out.println(String.format("%10s : %s", testString1, result1));
		System.out.println(String.format("%10s : %s", testString2, result2));
		System.out.println(String.format("%10s : %s", testString3, result3));


		// Testing an empty string
		String testString4  = "";	// true
		boolean result4 	= parser.check(testString4);
		System.out.println("\nTesting an empty string");
		System.out.println(String.format("%10s : %s", testString4, result4));


		// Testing an additional set of examples
		String testString5 = "((()())())";	// true
		String testString6 = "(((())()))"; 	// true
		String testString7 = "(()(())))";	// false

		boolean result5 = parser.check(testString5);
		boolean result6 = parser.check(testString6);
		boolean result7 = parser.check(testString7);

		System.out.println("\nTesting an additional set of examples:");
		System.out.println(String.format("%10s : %s", testString5, result5));
		System.out.println(String.format("%10s : %s", testString6, result6));
		System.out.println(String.format("%10s : %s", testString7, result7));


		// Testing the string generator method
		// String must be between 0 and 10 characters in length
		// String must contain ONLY "(" and ")"
		System.out.println("\nTesting the string generator method:");
		for(int i = 0; i < 10; i++){
			String parenthesisString = parser.getString();
			// String must be between 0 and 10 characters in length
			if(parenthesisString.length() < 0 || parenthesisString.length() > 10){
				System.out.println("False");
			} else {
				// String must contain ONLY "(" and ")"
				parenthesisString = parenthesisString.replace("(", "");
				parenthesisString = parenthesisString.replace(")", "");
				if(parenthesisString.length() == 0){
					System.out.println("True");
				} else {
					System.out.println("False");
				}
			}
		}


		// Expected output
		// 
		// Testing the examples given in the assignment specs:
		//       ()() : true
		//      ()()( : false
		//     ))()(( : false
		// 
		// Testing an empty string
		//            : true
		// 
		// Testing an additional set of examples:
		// ((()())()) : true
		// (((())())) : true
		//  (()(()))) : false
		// 
		// Testing the string generator method:
		// True
		// True
		// True
		// True
		// True
		// True
		// True
		// True
		// True
		// True


		// NOTE: you should also use your string generator method (parser.getString()) to test your application
		// I haven't included a test for that because the strings are generated randomly
		// This means that any strings I generate will be different to yours, which means you won't be able to compare the expected output.
		
	}
	
}