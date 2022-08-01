public class BinarySearchTree{

	protected BSTNode root;
	//a bst with a root node
	public BinarySearchTree(){
		root = null;
	}

	//search the tree for given value and return true if found otherwise false
	public boolean search(String x){
		boolean found = searchR(root, x);
		return found;
	}
	//search recursive
	private boolean searchR(BSTNode cRoot, String x){

		boolean found = false;
		//if the value doesnt exist return false
		if(cRoot == null){
			return false;
		} 
		//if the value exists return true
		else if(cRoot.getValue().compareTo(x) == 0){
			return true;
		}
		//search the left subtree and print value
		else if(cRoot.getValue().compareTo(x) > 0){
			found = searchR(cRoot.left, x);
		}
		//search right subtree and print value
		else if(cRoot.getValue().compareTo(x) < 0){
			found = searchR(cRoot.right, x);
		}
		return found;
	}

	//insert given value into the tree in the correct position
	public void insert(String x){
		root = insertR(root, x);
	}
	//insert recursion and if value exists do nothing
	private BSTNode insertR(BSTNode cRoot, String x){ 
		//No root so make Add here
		if(cRoot == null){
			cRoot = new BSTNode(x);
			return cRoot;
		}
		//Move down the left tree as value is smaller than root
		else if(cRoot.getValue().compareTo(x) > 0){
			cRoot.left = insertR(cRoot.left, x);
		}
		//Moves down the right subtree as value is larger than root
		else if(cRoot.getValue().compareTo(x) < 0){
			cRoot.right = insertR(cRoot.right, x);
		}

		return cRoot; //returns value to Tree
	}

	//search the tree for given value and remove once found
	public void remove(String x){
		root = removeR(root, x);
	}
	//search the tree for given value recursively
	private BSTNode removeR(BSTNode cRoot, String x){
		//if root is null the value doesnt exist but is its equal then remove otherwise keep searching
		if(cRoot == null){
			return cRoot;
		} 
		//search the left subtree
		else if(cRoot.getValue().compareTo(x) > 0){ //if its less than x search left
			cRoot.left = removeR(cRoot.left, x);
		}
		//search right subtree
		else if(cRoot.getValue().compareTo(x) < 0){ //if its more than x search right
			cRoot.right = removeR(cRoot.right, x);
		}
		//if value is found replace with next child
		else{
			if(cRoot.left == null) {
				return cRoot.right;
			} else if(cRoot.right == null){
				return cRoot.left;
			}
			cRoot.setValue(minValue(cRoot.right));
			cRoot.right = removeR(cRoot.right, cRoot.getValue());
		}
		return cRoot;
	}
	//next get the minimum Value
	private String minValue(BSTNode nextRoot){
		String mValue = nextRoot.getValue();
		//while the left child is not empty keep searching for minimum value and replace the parent 
		while(nextRoot.left != null){
			String nextValue = nextRoot.left.getValue();
			mValue = nextValue;
			nextRoot = nextRoot.left;
		}
		return mValue;
	}

	//prints tree with inorder traversal
	public void dump(){
		//give dumpR root 
		dumpR(root);
	}
	//gets each Node to print
	public void dumpR(BSTNode cRoot){
		if(cRoot != null){
			dumpR(cRoot.left);
			System.out.println(cRoot.getValue());
			dumpR(cRoot.right);
		}
	}

	//get the height of the tree
	public int height(){
		if(root == null){
			return 0;
		} else {
			return heightR(root);
		}
	}
	//get the max height of sub tree, pass the Node
	public int heightR(BSTNode cRoot){
		if(cRoot == null){
			return -1; //if cRoot is empty take 1 away from height
		}
		//returns after getting the max height of both sub trees
		return getMax(heightR(cRoot.left), heightR(cRoot.right))+1;
	}
	//get the max of subtrees, pass left and right subtree
	public int getMax(int lst, int rst){
		if(lst > rst){ 
			return lst;
		}	
		else{ 
			return rst; 
		}
	}

	// Print full tree structure
	public void printTree(){
		System.out.println("\nTree:");
		BSTPrinter.printNode(root);
	}
}