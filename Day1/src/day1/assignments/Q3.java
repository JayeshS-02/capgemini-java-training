package day1.assignments;
import java.util.Scanner;

public class Q3 {
public static void main(String[] args) {
	Scanner obj = new Scanner(System.in);
	/* 3 Write a program that prompts the user to enter their full name and age. Print a greeting message including their name
	and age. */
		String name;
		int age;
		System.out.println("Enter your name ");
		name = obj.nextLine();
		
		System.out.println("Enter your age ");
		age = obj.nextInt();
			
		System.out.println("Good Morning "+ name + " your age is :"+age);
		
		obj.close();
	}
}
