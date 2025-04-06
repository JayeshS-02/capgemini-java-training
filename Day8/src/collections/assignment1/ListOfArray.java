package collections.assignment1;

import java.util.ArrayList;
import java.util.*;

//. Add an integer to the ArrayList. 
//2. Check if a given number exists in the ArrayList. 
//3. Remove a particular element from the ArrayList and display the updated list. 
//4. Print all elements using a for loop. 
//5. Print all elements using the Iterator interface. 
//6. Print all elements using the for-each loop. 
//7. Print all elements in descending order. 
//8. Count the total number of elements in the ArrayList. 
//9. Exit the program. 

public class ListOfArray {
	
	public static void main(String[] args) {
		List<Integer> integers = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		Integer integ;
		
		while(true) {
			System.out.println("\n1. Add an integer to the ArrayList \n"
					+ "2. Check if a given number exists in the ArrayList.\n"
					+ "3. Remove a particular element from the ArrayList and display the updated list\n"
					+ "4. Print all elements using a for loop.\n"
					+ "5. Print all elements using the Iterator interface\n"
					+ "6. Print all elements using the for-each loop\n"
					+ "7. Print all elements in descending order.\n"
					+ "8. Count the total number of elements in the ArrayList\n"
					+ "9. Exit the program");
			
//			System.out.println();
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
				System.out.println("Enter new number : ");
				integ = sc.nextInt();
				integers.add(integ);
				break;
				
				
			case 2:
				System.out.println("Enter number to be checked in List");
				integ = sc.nextInt();
				if(integers.contains(integ)) {
					System.out.println("Given number exists in List");
				}
				else {
					System.out.println("Given number does not exists in List");	
				}
				break;
				
				
			case 3:
				System.out.println("Enter number to be removed and displayed");
				integ = sc.nextInt();
				if(integers.contains(integ)) {
					System.out.println("Element :"+integers.remove(integers.indexOf(integ)) + " has been removed.");
				}
				else {
					System.out.println("Element does not exist");
				}
				break;
				
			case 4:
				for(int i=0;i<integers.size();i++) {
					System.out.println(integers.get(i));
				}
				break;
				
			case 5:
				Iterator<Integer> it = integers.iterator();
				while(it.hasNext()) {
					int i = it.next();
					System.out.println(i);
				}
				break;
				
			case 6:
				for(int x : integers) {
					System.out.println(x);
				}
				break;
				
			case 7:
//				Print all elements in descending order.
				
				break;
				
			case 8:
				System.out.println("Size: "+integers.size());
				break;
				
			case 9:
				sc.close();
				System.out.println("Program Terminated");
				System.exit(0);
				break;
				
			default:
				break;
			}
		}
		
	}
}
