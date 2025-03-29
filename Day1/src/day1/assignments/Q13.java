package day1.assignments;
import java.util.Scanner;

public class Q13 {
	public static void main(String[] args) {
//		Write a program to take a character input from the user and display it with a message
		
		Scanner obj = new Scanner(System.in);
		char ch;
		
		System.out.println("Enter Character");
		ch = obj.next().charAt(0);
		
		System.out.println("character : "+ch);
		obj.close();
	}
}
