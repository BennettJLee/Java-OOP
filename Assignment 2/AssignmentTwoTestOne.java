public class AssignmentTwoTestOne {

	public static void main(String[] args){

		Stack stack = new Stack();

		// Test pushing to stack
		System.out.println("\nTest pushing onto the stack:");
		stack.push("apple");
		stack.push("b");
		stack.push("cat");
		stack.dump();

		// Testing peeking at stack
		System.out.println("\nTest peeking at the top of the stack:");
		String topValue = stack.peek();
		System.out.println(topValue);

		// Test popping from stack
		System.out.println("\nTest popping off of the stack:");
		stack.pop();
		stack.dump();

		// Expected output:
		//
		// Test pushing onto the stack:
		// cat
		// b
		// apple
		//
		// Test peeking at the top of the stack:
		// cat
		//
		// Test popping off of the stack:
		// b
		// apple

	}
	
}