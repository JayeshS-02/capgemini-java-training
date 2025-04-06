package objectclass;

public class Student {
	int rollNo;
	String name;
	String grade;
	
	public Student() {
		
	}
	public Student(int rollNo,String name,String grade) {
		this.rollNo=rollNo;
		this.name=name;
		this.grade=grade;
	}
	
	public String toString() {
		return "Student ["+rollNo+","+name+","+grade+"]";
	}
	
	
	@Override
	public boolean equals(Object o) {
		if(o!=null && o instanceof Student) {
			Student s = (Student) o;
			if(rollNo==s.rollNo && name.equals(s.name) && grade.equals(s.grade))
				return true;
		}
		return false;
	}
	
	public int hashCode() {
		return (rollNo);
	}
	
	public static void main(String[] args) {
	
		Student s1 = new Student(101,"Jayesh","A");
		Student s2 = new Student(101,"Jayesh","A");
		Student s3 = new Student(101,"Jayesh","c");
		System.out.println(s1);
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s1));
		System.out.println(s1.hashCode() == s2.hashCode() );
		
	}
	
}
