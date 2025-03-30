package assignments.ifcase;
import java.util.Scanner;

public class Ass2_02 {
	public static void main(String[] args) {
		/*Write a program that accepts a number and displays the absolute value of that number.*/
		
		Scanner sc = new Scanner(System.in);
		
		float num;
		System.out.println("Enter a number");
		num = sc.nextFloat();
		
		System.out.println("Absoulte value: "+ Math.abs(num));
		sc.close();
		
	}
}
