import java.util.Arrays;
//Priority class implements a minheap using an array of Nodes
public class PriorityQueue{
	//set array of Nodes and set last in array(next)
	Node[] heapArray;
	int next = 0;

	//constructor that gets a capacity and adds 1
	public PriorityQueue(int capacity){
		heapArray = new Node[capacity+1];
		next = 1; //starts at 1, [0] isnt used
	}

	//inserts x into Queue and upheaps to adjust heap
	public void insert(Node n){
		try{
			heapArray[next] = n;
			upHeap(next);
			next++;
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException thrown");
		} finally{
			return;
		}
	}
	//adjust heap until its in priority order
	private void upHeap(int child){
		while(child > 1){
			int parent = child/2;
			//if child is less than parent swap
			if(heapArray[child].priority<heapArray[parent].priority){   
				swap(child, parent);
			}
			child = parent;
		}
	}

	//remove and return highest priority Node
	public Node delete(){
		int root = 1;
		int lastLeaf = next - 1;
		Node returnNode = heapArray[root];
		//if heap is empty return nothing
		if(next == 1){
			return null;
		}
		//if heap has 1 element remove it, else swap root with last element and remove root
		if(root == lastLeaf){
			heapArray[lastLeaf] = null;
			next --;
		}else{
			swap(root, lastLeaf);
			heapArray[lastLeaf] = null;
			next --;
			//return to priority order
			downHeap();
		}
		return returnNode;
	}
	//adjust heap until its in priority order
	private void downHeap(){

		int smallest = 1;
		int parent = 1;
		//while parent is inside heaparray
		while(parent < next){
			//get children
			int left = parent*2;
			int right = (parent*2)+1;
			//check if children is inside heaparray
			boolean lInBounds = (left > 0) && (left < next);
			boolean rInBounds = (right > 0) && (right < next);
			//if left is inbound and left is less than parent then smallest becomes left
			if(lInBounds && heapArray[left].priority < heapArray[parent].priority){
				smallest = left;
			}
			//if right is inbound and right is less than smallest then smallest becomes right
			if(rInBounds && heapArray[right].priority < heapArray[smallest].priority){
				smallest = right;
			}
			//if parent isnt equal to smallest swap else break
			if(parent != smallest){
				swap(parent,smallest);
				parent = smallest;
			}else{
				break;
			}
		}
	}

	//print the Root and the Left and Right of Root until the end of the array
	public void dump(){
		Node returnNode = null;
		//for each node in queue print heap textually
		for(int i = 1, length = next; i < length; i++){
			returnNode = heapArray[i]; 
			System.out.print("Root " + returnNode.toString() + "; ");
			//get left and right child
			for(int j=0; j <= 1; j++){
				int index = 2*i+j;
				//if index is inside queue, print left and right otherwise print null  
				if(index < length){
					returnNode = heapArray[index]; 
					//if j equals 0 its the left child otherwise its the right child
					if(j==0){
						System.out.print("Left " + returnNode.toString() + "; ");
					}
					else{
						System.out.println("Right " + returnNode.toString() + ";");
					}
				}
				else{
					if(j==0){
						System.out.print("Left null; ");
					}
					else{
						System.out.println("Right null;");
					}
				}
			}
		}
	}

	//swap the positions of position1 and position2
	private void swap(int pos1, int pos2){
		Node tmp = heapArray[pos1];
		heapArray[pos1] = heapArray[pos2];
		heapArray[pos2] = tmp;
	}

}