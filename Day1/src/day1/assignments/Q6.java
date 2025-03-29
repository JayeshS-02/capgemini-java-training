package day1.assignments;
import java.util.Scanner;


public class Q6 {
public static void main(String[] args) {
//	6  Write a program that asks the user to input two floating-point numbers and prints their product.
	
	Scanner obj = new Scanner(System.in);
	
	float num1 , num2;
	System.out.print("Enter first number : ");
	num1 = obj.nextFloat();
			
	System.out.print("Enter second number : ");
	num2 = obj.nextFloat();
	
	
	System.out.print("Product : "+(num1*num2));
	obj.close();
}
}
