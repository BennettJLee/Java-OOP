public class BSTNode{
	//private variables
	private String value;
	BSTNode left;
	BSTNode right;
	// Constructor
	public BSTNode(String v){
		this.value = v;
		this.left = null;
		this.right = null;
	}
	//getter
	public String getValue(){
		return value;
	}
	//setter
	public void setValue(String v){
		this.value = v;
	}
}