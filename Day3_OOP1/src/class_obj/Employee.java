package class_obj;

import java.util.Scanner;

public class Employee {
	protected String name,dept,desig;
	protected int salary;
	
	public Employee() {
		
	}
	public Employee(String name, String dept, String desig, int salary) {
		super();
		this.name = name;
		this.dept = dept;
		this.desig = desig;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDesig() {
		return desig;
	}

	public void setDesig(String desig) {
		this.desig = desig;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name");
		name = sc.nextLine();
		
		System.out.println("Department");
		dept = sc.next();
		
		System.out.println("Designation");
		desig = sc.next();
		
		System.out.println("Salary");
		salary=sc.nextInt();
		
		
		sc.close();
		
	}
	
	public void display() {
		System.out.println("Name : "+name);
		System.out.println("Department : "+dept);
		System.out.println("Designation : "+desig);
		System.out.println("Salary : "+salary);
	}
	
	public float getHra() {
		return 0.2f*salary;
	}
	
	public float getDa() {
		return 0.1f*salary;
	}
	public float getCa() {
		return 0.1f*salary;
	}


	public static void main(String[] args) {
		Employee e1 = new Employee("Jayesh","Software","Engineer",425000);
		e1.display();
		System.out.println("HRA allowance : "+e1.getHra());
		System.out.println("DA allowance : "+e1.getDa());
		System.out.println("CA allowance : "+e1.getCa());
		
		System.out.println();
		
		Employee e2 = new Employee();
		e2.acceptData();
		e2.display();
		System.out.println("HRA allowance : "+e2.getHra());
		System.out.println("DA allowance : "+e2.getDa());
		System.out.println("CA allowance : "+e2.getCa());
	}
}
