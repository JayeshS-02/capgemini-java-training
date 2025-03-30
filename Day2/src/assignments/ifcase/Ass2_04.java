package assignments.ifcase;
import java.util.Scanner;

public class Ass2_04 {
	public static void main(String[] args) {
		/*Write a program that accepts a number and display whether the number is positive, negative, or zero*/
		
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		num = sc.nextInt();
		if(num>0) {
			System.out.println("Positive");
		}
		else if(num<0) {
			System.out.println("Negative");
		}
		else {
			System.out.println("Zero");
		}
		sc.close();
	}
}
