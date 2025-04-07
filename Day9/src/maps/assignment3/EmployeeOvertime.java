package maps.assignment3;

import java.util.*;
import java.util.Scanner;
/**
 You are developing an Employee Overtime Pay Management System to track overtime hours and payments for
employees. The system should use a LinkedHashMap to store Employee IDs as keys and the corresponding overtime
hours as values, preserving insertion order. Implement a menu-driven program that helps HR efficiently manage
overtime records.
Menu Options:
1. Record Overtime for Employees
 The user can enter multiple unique Employee IDs and their overtime hours.
 If a duplicate Employee ID is entered, it should not be added.
 Expected output:
Overtime records added successfully.
2. Check Overtime for an Employee
 The user enters an Employee ID to check their overtime hours.
 Expected output:
o If the Employee is found:
The Employee ID [ID] has worked [hours] overtime hours.
o If the Employee is not found:
The Employee ID [ID] is not recorded in the system.
3. Remove an Employee's Overtime Record
 The user enters an Employee ID to remove their overtime record from the system.
 Expected output:
o If the Employee exists and is removed:
The Employee ID [ID] overtime record was removed from the system.
o If the Employee is not found:
The Employee ID [ID] was not found in the system.
4. Update Overtime Hours for an Employee
 The user enters an Employee ID and provides a new overtime hour count to update their record.
 Expected output:
o If the Employee exists:
The Employee ID [ID] overtime hours updated to [new_hours].
o If the Employee is not found:
The Employee ID [ID] was not found in the system.
5. Display Overtime Records in Order of Entry
 The program should display all stored Employee IDs in insertion order, along with their overtime hours.
 Expected output:
Overtime Records:
Employee ID: [ID1], Overtime Hours: [HOURS1]
Employee ID: [ID2], Overtime Hours: [HOURS2]
...
 If no records are present, display:
No overtime records available in the system.
6. Calculate Total Overtime Payout
 The program calculates and displays the total overtime pay, assuming each hour is paid at a fixed rate (e.g.,
$20 per hour).
 Expected output:
Total Overtime Payout: $[total_payout]
 If no overtime is recorded, display:
No overtime records available to calculate payout.
7. Exit the Program
 The program should terminate when the user selects this option.
 Expected output:
Exiting the Employee Overtime Pay Management System. Goodbye! 
 
 */
public class EmployeeOvertime {
	public static void main(String[] args) {
		Map<Integer, Integer> empData =new LinkedHashMap<>();
		Scanner sc = new Scanner(System.in);
		int empId,overtimeHours;
		float rate;
		
		while(true) {
			System.out.println("\n1. Record Overtime for Employees\n"
					+ "2. Check Overtime for an Employee\n"
					+ "3. Remove an Employee's Overtime Record\n"
					+ "4. Update Overtime Hours for an Employee\n"
					+ "5. Display Overtime Records in Order of Entry\n"
					+ "6. Calculate Total Overtime Payout\n"
					+ "7. Exit the Program\n");
			
			int choice = sc.nextInt();
			switch(choice) {
				case 1:
					System.out.println("enter unique Employee IDs to record Overtime");
					empId=sc.nextInt();
					if(empData.containsKey(empId)) {
						System.out.println("Duplicate Employee ID\n");
						break;
					}
					//No need of Else
					System.out.println("Enter Overtime hours");
					overtimeHours = sc.nextInt();
					empData.put(empId, overtimeHours);
					System.out.println("Overtime records added successfully.");
					break;
				
				case 2:
					System.out.println("Enters an Employee ID to check their overtime hours");
					empId=sc.nextInt();
					if(empData.containsKey(empId)) {
						System.out.println("The Employee ID ["+empId+"] has worked ["+empData.get(empId)+"] overtime hours.");
						break;
					}
					System.out.println("The Employee ID ["+empId+"] is not recorded in the system");
					break;
					
				case 3:
					System.out.println("Enters an Employee ID to remove their overtime record from the system");
					empId=sc.nextInt();
					if(empData.containsKey(empId)) {
						empData.remove(empId);
						System.out.println("The Employee ID ["+empId+"] overtime record was removed from the system");
						break;
					}
					System.out.println("The Employee ID ["+empId+"] was not found in the system.");
					break;
					
				case 4:
					System.out.println("Enters an Employee ID and provides a new overtime hour count to update their record");
					empId=sc.nextInt();
					if(empData.containsKey(empId)) {
						System.out.println("Enters new overtime hour count to update record");
						overtimeHours = sc.nextInt();
						empData.put(empId, overtimeHours);
						System.out.println("The Employee ID ["+empId+"] overtime hours updated to ["+overtimeHours+"]. ");
					}
					else {	
						System.out.println("The Employee ID ["+empId+"] was not found in the system.");
					}
					break;
					
					
				case 5:
					if(empData.isEmpty()) {
						System.out.println("No overtime records available in the system.");
					}
					else {
						for(Map.Entry<Integer,Integer>entry : empData.entrySet()) {
							System.out.println("Employee ID: ["+entry.getKey()+"], Overtime Hours: ["+entry.getValue()+"] ");
						}
					}
					break;
					
				case 6:
					float totalPay= 0.0f;
					if(empData.isEmpty()) {
						System.out.println("No overtime records available to calculate payout");
					}
					else {
						System.out.println("Enter Overtime pay rate");
						rate=sc.nextFloat();
						for(Map.Entry<Integer, Integer> entry:empData.entrySet()) {
							totalPay+=(float)entry.getValue()*rate;
						}
						System.out.println("Total Overtime Payout: $["+totalPay+"] ");
					}
					break;
					
				case 7:
					sc.close();
					System.out.println("Exiting the Employee Overtime Pay Management System. Goodbye!");
					System.exit(0);
					break;
					
				default:
					System.out.println("Invalid choice");
					break;
			}
		}
	}
}
