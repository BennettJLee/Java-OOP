public class Node{
	//private variables
	private String value;
	Node next;
	// Constructor
	public Node(String v){
		if(v != null || v != ""){
			this.value = v;
			this.next = null;
		}else{return;};
	}
	//getter
	public String getValue(){
		return value;
	}
}