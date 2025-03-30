package assignments.loops;
import java.util.Scanner;

public class Ass3_09 {
	public static void main(String[] args) {
//		Write a program that accepts a number and print its factorial value
		int num;
		int fact=1;
		Scanner sc = new Scanner(System.in);
		num= sc.nextInt();
		for(int i=num;i>=1;i--) {
			fact=fact*i;
		}
		System.out.println("Factorial: "+fact);
		sc.close();
	}
}
