package collections.assignment3;
import java.util.*;

public class EmployeeList {
	protected ArrayList<Employee> employees;
	
	public EmployeeList() {
		employees = new ArrayList<>();
	}
	
	public void addEmployee() {
		Employee obj = new Employee();
		obj.acceptData();
		employees.add(obj);
	}
	
	public void deleteEmployee(String name) {
		for(int i=0;i<employees.size();i++) {
			Employee emp = employees.get(i);
			
			if(name.equalsIgnoreCase(emp.name)) {
				employees.remove(i);
				System.out.println("Employee with name"+emp.getName()+" removed.");
				return;
			}
		}
		System.out.println("Employee does not exist.");
	}
	
	
	public void displayAllEmployees() {
		employees.forEach(System.out::println);
	}
	
	
	public void updateEmployee() {
		Employee obj = new Employee();
		obj.acceptData();
		for(int i=0;i<employees.size();i++) {
			Employee emp = employees.get(i);
			if(obj.name.equalsIgnoreCase(emp.name)) {
				emp.setCode(obj.getCode());
				emp.setDepartment(obj.getDepartment());
				emp.setDesignation(obj.getDesignation());
				emp.setBasics(obj.getBasics());
				System.out.println("Employee Updated");
				return;
			}
		}
		System.out.println("No Employee Found");
	}
	
	public void sortEmpAscendingName() {
		employees.sort(Comparator.comparing(Employee::getName));
		employees.forEach(System.out::println);
	}
	public void sortEmpDescendingSalary() {
		employees.sort(Comparator.comparingDouble(Employee::getBasics));
		employees.forEach(System.out::println);
	}
	
	public double averageSalary() {
		double totalSalary=0.0;
		for(Employee emp : employees) {
			totalSalary+=emp.getBasics();
		}
		return totalSalary/employees.size();
	}
	
}
