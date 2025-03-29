package day1.assignments;
import java.util.Scanner;


public class Q5 {
public static void main(String[] args) {
	
//	5  Ask the user to input two integers and print the sum.
	Scanner obj = new Scanner(System.in);
	
	int num1 , num2;
	
	System.out.print("Enter first number : ");
	num1 = obj.nextInt();
	System.out.print("Enter second number : ");
	num2 = obj.nextInt();
	
	System.out.print("Sum : "+(num1+num2));
	obj.close();
	}
}
