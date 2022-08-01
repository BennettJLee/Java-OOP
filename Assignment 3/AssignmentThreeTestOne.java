public class AssignmentThreeTestOne {

	public static void main(String[] args){
		System.out.println("\nBST");

		BinarySearchTree bst = new BinarySearchTree();

		// Insert into the BST
		bst.insert("D");
		bst.insert("B");
		bst.insert("A");
		bst.insert("C");
		bst.insert("E");
		bst.insert("F");
		bst.insert("G");

		// Print the BST and calculate height
		int height = bst.height();
		System.out.println("\nHeight: " + height);
		System.out.println("\nDump Tree:");
		bst.dump();

		// Remove from the BST
		bst.remove("B");
		bst.remove("F");
		bst.printTree();

		
		// Print the BST and calculate height
		height = bst.height();
		System.out.println("\nHeight: " + height);
		System.out.println("\nDump Tree:");
		bst.dump();
	}
}

// Expected output:
//
// BST
// 
// Height: 3
// 
// Dump Tree:
// A
// B
// C
// D
// E
// F
// G
// 
// Height: 2
// 
// Dump Tree:
// A
// C
// D
// E
// G