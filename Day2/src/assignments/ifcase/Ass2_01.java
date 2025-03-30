package assignments.ifcase;
import java.util.Scanner;

public class Ass2_01 {
	public static void main(String[] args) {
		/*Write a program that accepts a number and displays whether entered number is an odd number or
		even number*/
		Scanner sc =  new Scanner(System.in);
		int num;
		System.out.println("Enter number");
		num = sc.nextInt();
		if(num%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
		sc.close();
	}
}
