package class_obj;

import java.util.Scanner;

class TempEmployee extends Employee1{
	
	protected int wageGrade;
	protected int numOfDays;
	
	public TempEmployee() {
		
	}
	
	public TempEmployee(int wageGrade, int numOfDays) {
		super(0000,"Admin");
		this.wageGrade = wageGrade;
		this.numOfDays = numOfDays;
	}
	
	public TempEmployee(int code,String name,int wageGrade, int numOfDays) {
		super(code,name);
		this.wageGrade = wageGrade;
		this.numOfDays = numOfDays;
	}
	
	public int getWageGrade() {
		return wageGrade;
	}

	public void setWageGrade(int wageGrade) {
		this.wageGrade = wageGrade;
	}

	public int getNumOfDays() {
		return numOfDays;
	}

	public void setNumOfDays(int numOfDays) {
		this.numOfDays = numOfDays;
	}
	
	public void acceptData() {
		super.acceptData();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter wageGrade");
		wageGrade=sc.nextInt();
		System.out.println("Enter numOfDays");
		numOfDays=sc.nextInt();
//		sc.close();
	}
	
	public void showData() {
		super.showData();
		System.out.println("wageGrade : "+wageGrade);
		System.out.println("numOfDays : "+numOfDays);
	}
	
	public static void main(String[] args) {
		
		
	}

}
