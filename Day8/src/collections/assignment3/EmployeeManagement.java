package collections.assignment3;

import java.util.Iterator;
import java.util.Scanner;

public class EmployeeManagement {
//	1. Add an Employee to the list. 
//	2. Display all Employees in the list. 
//	3. Update an Employee (by name). 
//	4. Delete an Employee (by name). 
//	5. Sort Employees by name in ascending order. 
//	6. Sort Employees by basic salary in descending order. 
//	7. Exit the program. 
	public static void main(String[] args) {
		EmployeeList list = new EmployeeList();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("//	1. Add an Employee to the list. \r\n"
					+ "2. Display all Employees in the list. \r\n"
					+ "3. Update an Employee (by name). \r\n"
					+ "4. Delete an Employee (by name). \r\n"
					+ "5. Sort Employees by name in ascending order. \r\n"
					+ "6. Sort Employees by basic salary in descending order. \r\n"
					+ "7. Exit the program.");
			
			
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
				list.addEmployee();
				break;
				
				
			case 2:
				list.displayAllEmployees();
				break;
				
				
			case 3:
				list.updateEmployee();
				break;
				
			case 4:
				System.out.println("Enter name to be deleted");
				String name = sc.nextLine();
				list.deleteEmployee(name);
				break;
				
			case 5:
//				"5. Sort Employees by name in ascending order. \r\n"
				list.sortEmpAscendingName();
				break;
				
			case 6:
//				"6. Sort Employees by basic salary in descending order. \r\n"
				list.sortEmpDescendingSalary();
				break;
				
			case 7:
//				Print all elements in descending order.
				sc.close();
				System.out.println("Program Terminated");
				System.exit(0);
				break;
				
			default:
				break;
			}
		}
		
		
		
		
		
		
//		list.addEmployee();
//		list.addEmployee();
//		list.addEmployee();
//		list.addEmployee();
//		
//		
//		Scanner sc = new Scanner(System.in);
//		
//		list.displayAllEmployees();
	}
}
