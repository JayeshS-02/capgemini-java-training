package collections.assignment2;
import java.util.*;

public class ListOfString {
//	1. Add a string to the ArrayList. 
//	2. Check if a given string exists in the ArrayList. 
//	3. Remove a particular string from the ArrayList and display the updated list. 
//	4. Print all strings in the ArrayList. 
//	5. Count the total number of strings in the ArrayList. 
//	6. Find all strings that start with a given prefix. 
//	7. Find all strings that end with a given suffix. 
//	8. Find all strings that contain a given substring. 
//	9. Sort the strings in ascending order. 
//	10. Sort the strings in descending order. 
//	11. Exit the program.
	public static void main(String[] args) {
		List<String> strings = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		String str;
		while(true) {
			System.out.println("\n1. 1. Add a string to the ArrayList. \n"
					+ "2. Check if a given string exists in the ArrayList.\n"
					+ "3. Remove a particular string from the ArrayList and display the updated list.\n"
					+ "4. Print all strings in the ArrayList.\n"
					+ "5. Count the total number of strings in the ArrayList.\n"
					+ "6. Find all strings that start with a given prefix.\n"
					+ "7. Find all strings that end with a given suffix.\n"
					+ "8. Find all strings that contain a given substring.\n"
					+ "9. Sort the strings in ascending order.\n"
					+ "10. Sort the strings in descending order.\n"
					+ "11. Exit the program.");
			
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			
			case 1:
				System.out.println("Enter new string : ");
				str = sc.nextLine();
				strings.add(str);
				break;
					
			case 2:
				System.out.println("Enter string to be checked in List");
				str = sc.nextLine();
				if(strings.contains(str)) {
					System.out.println("Given string exists in List");
				}
				else {
					System.out.println("Given string does not exists in List");	
				}
				break;
				
				
			case 3:
				System.out.println("Enter string to be removed and displayed");
				str = sc.nextLine();
				if(strings.contains(str)) {
					System.out.println("String :"+strings.remove(strings.indexOf(str)) + " has been removed.");
				}
				else {
					System.out.println("String does not exist");
				}
				break;
				
			case 4:
				for(int i=0;i<strings.size();i++) {
					System.out.println(strings.get(i));
				}
				break;
				
//			case 5:
//				Iterator<Integer> it = integers.iterator();
//				while(it.hasNext()) {
//					int i = it.next();
//					System.out.println(i);
//				}
//				break;
//				
//			case 6:
//				for(int x : integers) {
//					System.out.println(x);
//				}
//				break;
//				
//			case 7:
////				Print all elements in descending order.
//				
//				break;
//				
//			case 8:
//				System.out.println("Size: "+integers.size());
//				break;
//				
//			case 9:
//				sc.close();
//				System.out.println("Program Terminated");
//				System.exit(0);
//				break;
//			case 10:
//				sc.close();
//				System.out.println("Program Terminated");
//				System.exit(0);
//				break;
//			case 11:
//				sc.close();
//				System.out.println("Program Terminated");
//				System.exit(0);
//				break;
//				
			default:
				break;
			
			}
			
		}
	}
}
