package set1.factorymanagement;


import java.util.HashSet;
import java.util.Scanner;
/**
 * Set 3: Employee Attendance Tracking System
You are developing an Employee Attendance Tracking System for an office to manage unique employee ID numbers
of employees who check in daily. The system should use a HashSet to store employee IDs, ensuring no duplicates.
Implement a menu-driven program to perform the following operations.
Menu Options:
1. Mark Employee Attendance (Check-In)
 The user enters an employee ID number to mark attendance for the day.
 If the employee has already checked in, the system should not allow duplicate entries.
 Expected output:
Employee ID [ID] has checked in successfully. 
 If duplicate entry:
Employee ID [ID] has already checked in today.
2. Check If an Employee Checked In
 The user enters an employee ID to verify if they have checked in for the day.
 Expected output:
o If the employee is found:
Employee ID [ID] has checked in today.
o If the employee is not found:
Employee ID [ID] has not checked in today.
3. Remove Employee from Attendance (Check-Out)
 The user enters an employee ID to remove their attendance record (indicating they checked out).
 Expected output:
o If the employee is found and removed:
Employee ID [ID] has checked out.
o If the employee is not found:
Employee ID [ID] was not found in the attendance list.
4. Display All Employees Who Checked In
 The program should display all checked-in employees stored in the HashSet.
 Expected output:
Employees who checked in today:
Employee ID: [ID_1]
Employee ID: [ID_2]
...
 If the HashSet is empty, display:
No employees have checked in today.
5. Count Employees with Even Employee IDs
 The program counts how many checked-in employees have an even employee ID number.
 Expected output:
Number of employees with even ID numbers: [COUNT]
6. Exit the Program
 The program should terminate when the user selects this option.
 Expected output: 
Exiting the Employee Attendance Tracking System. Goodbye! 
 */
public class SetAssignment3 {
	public static void main(String[] args) {
		HashSet<Integer> employeeIds = new HashSet<Integer>();
		Scanner sc = new Scanner(System.in);
		int empId;
		
		while(true) {
			
			System.out.println("\n1. Mark Employee Attendance (Check-In)\n"
					+ "2. Check If an Employee Checked In\n"
					+ "3. Remove Employee from Attendance (Check-Out)\n"
					+ "4. Display All Employees Who Checked In\n"
					+ "5. Count Employees with Even Employee IDs\n"
					+ "6. Exit the Program\n");
			
			int choice = sc.nextInt();
			switch(choice) {
			
			case 1:
				System.out.println("enters an Employee ID number to mark attendance for the day");
				empId = sc.nextInt();
				if (employeeIds.add(empId)) {
					System.out.println("Employee ID ["+empId+"] has checked in successfully.");
				} else {
					System.out.println("Employee ID ["+empId+"] has already checked in today.");
				}
				break;

			case 2:
				System.out.println("enters an Employee ID number to verify if they have checked in for the day.");
				empId = sc.nextInt();
				if (employeeIds.contains(empId)) {
					System.out.println("Employee ID ["+empId+"] has checked in today. ");
				} else {
					System.out.println("Employee ID ["+empId+"] has not checked in today");
				}
				break;

			case 3:
				System.out.println("enters an Employee ID number to remove their attendance record (indicating they checked out).");
				empId = sc.nextInt();
				if (employeeIds.contains(empId)) {
					employeeIds.remove(empId);
					System.out.println("Employee ID ["+empId+"] has checked out. ");
				} else {
					System.out.println("Employee ID ["+empId+"] was not found in the attendance list. ");
				}
				break;

			case 4:
				if (employeeIds.isEmpty()) {
					System.out.println("No employees have checked in today");
				}
				System.out.println("Employees who checked in today:");
				for(int x : employeeIds) {
					System.out.println("Employee ID: ["+x+"]");
				}
				break;

			case 5:
				int evenCount=0;
				for(int x : employeeIds) {
					if(x%2==0) {
						evenCount++;
					}
				}
				System.out.println("Number of employees with even ID numbers: [" + evenCount+"]");
				break;

			case 6:
				sc.close();
				System.out.println("Exiting the Employee Attendance Tracking System. Goodbye!");
				System.exit(0);
				break;

			default:
				break;
			}
		}
	}
}
