package class_obj;
import java.util.Scanner;

public class Student {
	protected String name;
	protected String studClass;
	protected char section;
	protected int mark1,mark2,mark3,mark4;
	
	
	public Student() {
		
	}
	
	
	public Student(String name, String studClass, char section, int mark1, int mark2, int mark3, int mark4) {
		super();
		this.name = name;
		this.studClass = studClass;
		this.section = section;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
		this.mark4 = mark4;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getStudClass() {
		return studClass;
	}


	public void setStudClass(String studClass) {
		this.studClass = studClass;
	}


	public char getSection() {
		return section;
	}


	public void setSection(char section) {
		this.section = section;
	}


	public int getMark1() {
		return mark1;
	}

	public void setMark1(int mark1) {
		this.mark1 = mark1;
	}

	public int getMark2() {
		return mark2;
	}


	public void setMark2(int mark2) {
		this.mark2 = mark2;
	}

	public int getMark3() {
		return mark3;
	}

	public void setMark3(int mark3) {
		this.mark3 = mark3;
	}

	public int getMark4() {
		return mark4;
	}

	public void setMark4(int mark4) {
		this.mark4 = mark4;
	}
	
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name");
		name = sc.nextLine();
		
		System.out.println("Class");
		studClass = sc.next();
		
		System.out.println("Section");
		section = sc.next().charAt(0);
		
		System.out.println("Marks1");
		mark1=sc.nextInt();
		
		System.out.println("Marks2");
		mark2=sc.nextInt();
		
		System.out.println("Marks3");
		mark3=sc.nextInt();
		
		System.out.println("Marks4");
		mark4=sc.nextInt();
//		System.out.println();
		sc.close();
		
	}
	
	public void display() {
		System.out.println("Name : "+name);
		System.out.println("Class : "+studClass);
		System.out.println("Section : "+section);
		System.out.println("Mark1 : "+mark1);
		System.out.println("Mark2 : "+mark2);
		System.out.println("Mark3 : "+mark3);
		System.out.println("Mark4 : "+mark4);
		
	}
	
	public int getTotal() {
		return mark1+mark2+mark3+mark4;
	}
	
	public float getPercentage() {
		return (float)(getTotal()*100/400f);
	}
	

	public static void main(String[] args) {
		Student st1 = new Student("Jayesh","BECOMP",'B',78,89,87,90);
		System.out.println("Total Marks: "+st1.getTotal());
		System.out.println("Percentage : "+st1.getPercentage());
		
		System.out.println();
		Student st2 = new Student();
		st2.acceptData();
		st2.display();
		System.out.println("Total Marks: "+st2.getTotal());
		System.out.println("Percentage : "+st2.getPercentage());
		
		
	}
}
