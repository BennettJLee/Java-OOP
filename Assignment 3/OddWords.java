import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class OddWords extends BinarySearchTree{
	//process given file
	public void processFile(String fileName){
		boolean found = false;;
		try {
      		File file = new File(fileName);
      		Scanner insertScan = new Scanner(file);
      		//while file still has words, search tree for word
     		while (insertScan.hasNext()) {
        		String wordI = insertScan.next();
        		search(wordI);
      		}
      		insertScan.close();
      		System.out.println("\nLEXICON:");
      		dump();
      		//printTree();
      		Scanner removeScan = new Scanner(file);
      		//remove all words to reset BST
      		while (removeScan.hasNext()) {
        		String wordR = removeScan.next();
        		remove(wordR);
      		}
      		removeScan.close();
    	} catch (FileNotFoundException e) {
      		System.out.println("An error occurred.");
      		e.printStackTrace();
    	}
	}

		//search the tree for given value
	public boolean search(String x){
		boolean found = searchR(root, x);
		return found;
	}
	//search recursive
	private boolean searchR(BSTNode cRoot, String x){

		boolean found = false;
		//if the value doesnt exist print it and insert it
		if(cRoot == null){
			System.out.println(x + " INSERTED");
			insert(x);
			return false;
		} 
		//if the value exists print it and delete it
		else if(cRoot.getValue().compareTo(x) == 0){
			System.out.println(cRoot.getValue() + " DELETED");
			remove(x);
			return true;
		}
		//search the left subtree and print value
		else if(cRoot.getValue().compareTo(x) > 0){
			System.out.print(cRoot.getValue() + " ");
			found = searchR(cRoot.left, x);
		}
		//search right subtree and print value
		else if(cRoot.getValue().compareTo(x) < 0){
			System.out.print(cRoot.getValue() + " ");
			found = searchR(cRoot.right, x);
		}
		return found;
	}
}