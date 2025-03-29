package day1.assignments;
import java.util.Scanner;

public class Q11 {
	public static void main(String[] args) {
//		Write a program that asks the user to input a number in decimal format (double) and then prints the number.
		
		double num;
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter decimal number");
		num = obj.nextDouble();
		
		System.out.println("num : "+num);
		obj.close();
	}
}
