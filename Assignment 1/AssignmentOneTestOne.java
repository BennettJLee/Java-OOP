public class AssignmentOneTestOne{

	public static void main(String[] args){

		// Testing the unordered ABC list
		System.out.println("(1) Testing the unordered ABC list");
		ABCList abcList = new ABCList(); 

		System.out.println("(1a) Adding to the unordered ABC list");
		abcList.add('a');
		abcList.add('b');
		abcList.add('c');
		abcList.dump();
		System.out.println("(1b) Removing from the unordered ABC list");
		abcList.remove('d');
		abcList.remove('b');
		abcList.dump();
		System.out.println("(1c) Testing other operations on the unordered ABC list");
		System.out.println("Is empty? " + abcList.isEmpty());
		System.out.println("Has value 'e'? " + abcList.has('e'));
		System.out.println("Has value 'a'? " + abcList.has('a'));
		System.out.println("List length? " + abcList.length());


		System.out.println("\n");

		// Testing the ordered ABC list
		System.out.println("(2) Testing the ordered ABC list");
		OrderedABCList orderedAbcList = new OrderedABCList(); 
		System.out.println("(2a) Adding to the ordered ABC list");
		orderedAbcList.add('a');
		orderedAbcList.add('b');
		orderedAbcList.add('c');
		orderedAbcList.dump();
		System.out.println("(2a) Inserting into the ordered ABC list");
		orderedAbcList.insert('a');
		orderedAbcList.insert('b');
		orderedAbcList.insert('c');
		orderedAbcList.dump();
		System.out.println("(2b) Removing from the ordered ABC list");
		orderedAbcList.remove('d');
		orderedAbcList.remove('b');
		orderedAbcList.dump();
		System.out.println("(2c) Testing other operations on the ordered ABC list");
		System.out.println("Is empty? " + orderedAbcList.isEmpty());
		System.out.println("Has value 'e'? " + orderedAbcList.has('e'));
		System.out.println("Has value 'a'? " + orderedAbcList.has('a'));
		System.out.println("List length? " + orderedAbcList.length());
	}
}