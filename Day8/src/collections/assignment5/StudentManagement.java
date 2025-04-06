package collections.assignment5;

import java.util.Scanner;

import collections.assignment3.EmployeeList;

public class StudentManagement {
	public static void main(String[] args) {
		StudentList list = new StudentList();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("\n1. Add a Student to the list. \r\n"
					+ "2. Display all Students in the list. \r\n"
					+ "3. Update a Student's marks (by ID). \r\n"
					+ "4. Delete a Student (by ID). \r\n"
					+ "5. Sort Students by name in ascending order. \r\n"
					+ "6. Sort Students by course and name in ascending order. \r\n"
					+ "7. Calculate the average marks of all students. \r\n"
					+ "8. Exit the program. ");
			
			
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
				list.addStudent();
				break;
				
				
			case 2:
				list.displayAllStudents();
				break;
				
				
			case 3:
				list.updateStudentMarks();
				break;
				
			case 4:
				System.out.println("Enter Student ID to be deleted");
				int id = sc.nextInt();
				list.deleteStudent(id);
				break;
				
			case 5:
//				"5. Sort Student by name in ascending order. \r\n"
				list.sortStudAscendingName();
				break;
				
			case 6:
//				"6. Sort Student by course and name in ascending order. \r\n"
				list.sortByCourseAndName();
				break;
				
			case 7:
//				Calculate avg marks.
				System.out.println("Average Marks of class :"+list.averageMarks());
				break;
			case 8:
//				Print all elements in descending order.
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
