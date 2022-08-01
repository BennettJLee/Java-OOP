public class ABCList{
	//intialises head.
	protected ABCNode head;

	//checks if the list has given variable
	public boolean has(char c){
		//used to point at a Node
		ABCNode current = head;
		//loop while current is not null
		while(current!=null){
			//if current is equal to c then return true
			if(current.value == c){
				return true;
			}
			current = current.next;
		} 
		//otherwise return false
		return false;
	}

	//checks the length of the list
	public int length(){
		//counter to show list length
		int counter = 0;
		//points at current Node
		ABCNode current = head;
		//loops while current is not null
		while(current!=null){
			counter++; //increment on every loop
			current = current.next; //move to next head
		}
		return counter;
	}

	//checks if list is empty
	public boolean isEmpty(){
		//if head is null list is empty return true
		if(length() == 0){
			return true;
		}
		//otherwise return false
		return false;
	}

	//adds new Node to front of list
	public void add(char c){
		//create newNode to insert
		ABCNode newNode = new ABCNode(c);
		//check if list is empty
		if(isEmpty()){
			head = newNode;
		}
		//if not then add newNode into head
		else{ 
			newNode.next = head;
			head = newNode;
		}
	}

	//removes given value
	public void remove(char c){
		//List must not be empty
		if(isEmpty()){
			return;
		}
		//Value must exist
		if(!has(c)){
			return;
		}
		//remove head
		if(head.value == c){
			head = head.next;
			return;
		}
		//remove given Node after Head
		ABCNode previous = head; // this allows us to save the previous Node
		ABCNode current = head.next;
		//loop while current is not null
		while(current!=null){
			//if Node value is equal to c
			if(current.value == c){
				//set toRemove to one Node ahead
				ABCNode toRemove = current;
				previous.next = toRemove.next; //c becomes .next Node
				current = previous.next;
				return;
			}
			//step forward
			else{ 
				previous = previous.next;
				current = current.next;
			}
		}
	}
	//prints the list
	public void dump(){
		System.out.println("ABCList:");
		ABCNode current = head;
		while(current != null){
			System.out.println(current.value);
			current = current.next;
		}
	}
}