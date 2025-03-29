package day1.assignments;
import java.util.Scanner;

public class Q10 {
	public static void main(String[] args) {
//		Ask the user to input two separate strings and print them concatenated into one sentence
		
		String s1,s2;
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter string 1 : ");
		s1 = obj.nextLine();
		System.out.println("Enter String 2 : ");
		s2 = obj.nextLine();
		
		System.out.println(s1+" "+s2);
		obj.close();
	}
}
