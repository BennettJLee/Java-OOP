//Node class creates a Node element for Binary Heap
public class Node{
	//priority of Node
	int priority = 0; 
	// Constructor takes p as priority and sets it
	public Node(int p){
		this.priority = p;
	}
	public String toString(){
		return "Priority: " + this.priority;
	}
}