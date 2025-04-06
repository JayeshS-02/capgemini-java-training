package collections.assignment3;

import java.util.Objects;
import java.util.Scanner;

public class Employee {
	protected int code;
	protected String name;
	protected String department;
	protected String designation;
	protected double basics;

	public Employee() {

	}

	public Employee(int code, String name, String department, String designation, double basics) {
		super();
		this.code = code;
		this.name = name;
		this.department = department;
		this.designation = designation;
		this.basics = basics;
	}

	@Override
	public int hashCode() {
		return Objects.hash(basics, code, department, designation, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Double.doubleToLongBits(basics) == Double.doubleToLongBits(other.basics) && code == other.code
				&& Objects.equals(department, other.department) && Objects.equals(designation, other.designation)
				&& Objects.equals(name, other.name);
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getBasics() {
		return basics;
	}

	public void setBasics(double basics) {
		this.basics = basics;
	}

	public void acceptData() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee code");
		code = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Employee Name");
		name = sc.nextLine();
		System.out.println("Enter Employee department");
		department = sc.nextLine();
		System.out.println("Enter Employee designation");
		designation = sc.nextLine();
		System.out.println("Enter Employee basics");
		basics = sc.nextDouble();
		sc.nextLine();
	}
//	public void displayData() {
//		System.out.println();
//		System.out.println();
//		System.out.println();
//	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
//		return super.toString();
		return "[Code:" + code + " , Name: " + name + " , Designation : " + designation + " , Department : "
				+ department + " , basics: " + basics;
	}
}
