package collections.assignment5;

import java.util.Objects;
import java.util.Scanner;

public class Student {
	protected int id;
	protected String name;
	protected String course;
	protected double marks;
	
	public Student() {
		
	}
	public Student(int id, String name, String course, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.marks = marks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(course, id, marks, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(course, other.course) && id == other.id
				&& Double.doubleToLongBits(marks) == Double.doubleToLongBits(other.marks)
				&& Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
//		return super.toString();
		return "[id:" + id + " , Name: " + name + " , course : " + course + " , marks : "
				+ marks + " ]";
	}
	
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student ID");
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Student Name");
		name = sc.nextLine();
		System.out.println("Enter Student course");
		course = sc.nextLine();
		System.out.println("Enter Student total marks");
		marks = sc.nextDouble();
		sc.nextLine();
	}
	
	
}
