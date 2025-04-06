package collections.assignment5;

import java.util.ArrayList;
import java.util.Comparator;

import collections.assignment3.Employee;

public class StudentList {
	protected ArrayList<Student> students;
	
	public StudentList() {
		students = new ArrayList<>();	
	}
	
	public void addStudent() {
		Student obj = new Student();
		obj.acceptData();
		students.add(obj);
	}
	
	public void deleteStudent(int id) {
		for(int i=0;i<students.size();i++) {
			Student std = students.get(i);
			
			if(id==std.id) {
				students.remove(i);
				System.out.println("Student with id"+std.getId()+" removed.");
				return;
			}
		}
		System.out.println("Student does not exist.");
	}
	
	public void displayAllStudents() {
		students.forEach(System.out::println);
	}
	
	public void updateStudentMarks() {
		Student obj = new Student();
		obj.acceptData();
		for(int i=0;i<students.size();i++) {
			
			Student std = students.get(i);
			if(obj.id==std.id) {
				std.setMarks(obj.getMarks());
				System.out.println("Student Marks Updated");
				return;
			}
		}
		System.out.println("No Student Found");
	}
	
	
	public void sortStudAscendingName() {
		students.sort(Comparator.comparing(Student::getName));
		students.forEach(System.out::println);
	}
	public void sortByCourseAndName() {
		students.sort(Comparator.comparing(Student::getCourse).thenComparing(Comparator.comparing(Student::getName)));
		students.forEach(System.out::println);
	}
	
	public double averageMarks() {
		double totalMarks=0.0;
		for(Student std : students) {
			totalMarks+=std.getMarks();
		}
		return totalMarks/students.size();
	}
	
}
