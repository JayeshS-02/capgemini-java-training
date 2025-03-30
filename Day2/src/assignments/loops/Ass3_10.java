package assignments.loops;
import java.util.Scanner;

public class Ass3_10 {
	public static void main(String[] args) {
		/*Write a program that accepts two numbers. Find the value of one number raised to the power of
		another. (without using pre-defined functions)*/
		
		Scanner sc = new Scanner(System.in);
		int n1 , n2, result=1;
		System.out.println("Enter number");
		n1=sc.nextInt();
		System.out.println("Enter power");
		n2=sc.nextInt();
		
		for(int i=1;i<=n2;i++) {
			result*=n1;
		}
		System.out.println(n1+" raised to "+n2+" : "+ result);
		
		sc.close();
	}
}
