import java.io.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
//MedicalCentre class gets a file with patients and inserts them into a Binary heap to get priority order
public class MedicalCentre{
	//processes a file and extracts and prints the Nodes from Binary heap
	public void processQueue(String fileName){
		try{
			//Get filename and scan it
      		File file = new File(fileName);
      		Scanner insertScan = new Scanner(file);
      		insertScan.useDelimiter("");
      		PriorityQueue priorityQueue = new PriorityQueue(10);
      		//Declare variables
      		int pri = 0;
      		String name = "";
      		int age = 0;
      		String sev = "";
      		int pnum = 0;
      		Patient newPatient;
      		ArrayList<String> pArray = new ArrayList<String>();
      		//while file still has lines, insert patients into heap in priority order
     		while (insertScan.hasNextLine()) {
     			String line = insertScan.nextLine();
     			String[] data = line.split(",");
        		name = data[0];
        		age = Integer.parseInt(data[1]);
        		sev = data[2];
        		pnum += 1;
        		//calculate priority
        		if(sev.equals("low")){
        			pri = 3;
        		}else if(sev.equals("medium") && age < 65){
        			pri = 2;
        		}else if((sev.equals("medium") && age >= 65) || (sev.equals("high"))){
        			pri = 1;
        		}
        		newPatient = new Patient(pri, name, age, sev, pnum);
        		priorityQueue.insert(newPatient);
      		}
      		insertScan.close();
      		//delete each value inserted into Heap
      		for(int i = 0; i < pnum; i++){
      		 	Node pNode = priorityQueue.delete();
      		 	System.out.println(pNode);
      		}

    	} catch (FileNotFoundException e) {
      		System.out.println("An error occurred.");
    	}
	}
}