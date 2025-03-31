package class_obj;

class PermanentEmployee extends Employee1{
	
	protected String dept;
	protected String design;
	protected int salary;
	
	
	
	public PermanentEmployee() {
		super();
	}



	public PermanentEmployee(int code, String name) {
		super(code, name);
	}



	public PermanentEmployee(String dept, String design, int salary) {
		super();
		this.dept = dept;
		this.design = design;
		this.salary = salary;
	}



	public static void main(String[] args) {
		
	}

}
