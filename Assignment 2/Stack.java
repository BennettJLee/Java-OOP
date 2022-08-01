public class Stack{

	protected Node head;

	//Constructor
	public Stack(){
		head = null;
	}

	//checks if Stack is Empty
	public boolean isEmpty(){
		if(head == null){
			return true;
		}
		return false;
	}

	//gets number of items in the Stack
	public int length(){
		int count = 0;
		Node current = head;
		return lengthR(current, count);
	}
	//recursive length searchs through Stack for # of items
	private int lengthR(Node current, int count){
		if(current == null){
			return count;
		}
		else{
			return lengthR(current.next, count++);
		}
	}

	//Add item to top of the Stack
	public void push(String x){
		Node newNode = new Node(x);
		if(isEmpty()){
			head = newNode;
		}else{
			newNode.next = head;
			head = newNode;
		}
	}

	//Remove item from top of stack
	public void pop(){
		if(isEmpty()){
			return;
		}
		head = head.next;
	}

	//looks at the first item on stack and returns its value
	public String peek(){
		if(isEmpty()){
			return null;
		}
		return head.getValue();
	}

	public void dump(){
		Node current = head;
		dumpR(current);
	}

	private void dumpR(Node current){
		if(current == null){
			return;
		}
		else{
			System.out.println(current.getValue());
			dumpR(current.next);
		}
	}
}
