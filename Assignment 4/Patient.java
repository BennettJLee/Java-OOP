//Patient class inherits from the Node class and creates a Patient element for Binary Heap
public class Patient extends Node{
	//private variables
	String name = "";
	int age = 0;
	String severity = "";
	int pNum = 0;
	// Constructor which takes arguements and inserts them into members
	public Patient(int p, String name, int age, String sev, int pNum){
		super(p);
		this.name = name;
		this.age = age;
		this.severity = sev;
		this.pNum = pNum;
	}
	//Creates a string using Patient members
	public String toString(){
		return "Priority: " + this.priority + ", Name: " + this.name + ", Age: " + this.age + ", Medical severity level: " + this.severity + ", Patient number: " + this.pNum;
	}
}	