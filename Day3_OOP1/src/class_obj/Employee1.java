package class_obj;

import java.util.Scanner;

public class Employee1 {
	
	protected int code;
	protected String name;
	
	public Employee1() {
		
	}
	public Employee1(int code,String name) {
		this.code = code;
		this.name = name;
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
	
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Code");
		code = sc.nextInt();
		System.out.println("Enter Name");
		name = sc.nextLine();
		
	}
	
	public void showData() {
		System.out.println("Emp Code : "+ code);
		System.out.println("Emp Name : "+ name);
	}
	
	public static void main(String[] args) {
		
	}
}
