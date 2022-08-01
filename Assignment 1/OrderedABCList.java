public class OrderedABCList extends ABCList{

	//have a look at constructors
	public void add(char c){
		System.out.println("Whoops, an ordered list does not include an 'add' method. Please use 'insert' instead");
	}
	//orders list and inserts new value in correct order
	public void insert(char c){

		ABCNode newNode = new ABCNode(c);

		ABCNode nextNode;
		char storedChar;

		newNode.next = head;
		head = newNode;

		ABCNode current = head;
		if(current.next!=null){
			while(current != null){
				nextNode = current.next;
				while(nextNode != null){

					if(current.value > nextNode.value){
						storedChar = current.value;
						current.value = nextNode.value;
						nextNode.value = storedChar;
					}
					nextNode = nextNode.next;
				}
				current = current.next;
			}
		}
	}
}