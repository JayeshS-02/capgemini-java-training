package day4;
import java.util.Scanner;

public class Student {
	
	protected int enrollmentNo;
	protected String name;
	protected Gender gender;
	protected String classStud;
	protected char section;
	protected House house;
	
	public Student() {
		
	}
	
	public Student(int enrollmentNo, String name, Gender gender, String classStud, char section, House house) {
//		super();
		this.enrollmentNo = enrollmentNo;
		this.name = name;
		this.gender = gender;
		this.classStud = classStud;
		this.section = section;
		this.house = house;
	}

	public int getEnrollmentNo() {
		return enrollmentNo;
	}

	public void setEnrollmentNo(int enrollmentNo) {
		this.enrollmentNo = enrollmentNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getClassStud() {
		return classStud;
	}

	public void setClassStud(String classStud) {
		this.classStud = classStud;
	}

	public char getSection() {
		return section;
	}

	public void setSection(char section) {
		this.section = section;
	}

	public House getHouse() {
		return house;
	}

	public void setHouse(House house) {
		this.house = house;
	}
	
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Enter enrollmentNo");
		enrollmentNo = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name");
		name = sc.nextLine();
		System.out.println("Enter gender");
		gender = Gender.acceptGender();
		System.out.println("Enter classStud");
		classStud = sc.nextLine();
		System.out.println("Enter section");
		section = sc.next().charAt(0);
		System.out.println("Enter house");
		house = House.acceptHouse();
	}
	
	public void showData() {
        System.out.println("enrollmentNo : " + enrollmentNo);
        System.out.println("name : " + name);
        System.out.println("gender : " + gender);
        System.out.println("classStud : " + classStud);
        System.out.println("section : " + section);
        System.out.println("house : " + house + "/ncolor: "+house.getColor());
    }

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.acceptData();
		s1.showData();
	}
}
