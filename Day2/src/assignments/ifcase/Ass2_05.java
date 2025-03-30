package assignments.ifcase;
import java.util.Scanner;

public class Ass2_05 {
	public static void main(String[] args) {
		/*Write a program that accepts three integers as angles and check whether a triangle is valid or not*/
		int a1,a2,a3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three angles of triangle");
		a1=sc.nextInt();
		a2=sc.nextInt();
		a3=sc.nextInt();
		
		if((a1+a2+a3)==180) {
			System.out.println("valid Traingle");
		}
		else {
			System.out.println("Invalid Triangle");
		}
		sc.close();
	}
}
