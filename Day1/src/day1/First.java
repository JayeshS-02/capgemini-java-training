package day1;
import java.util.Scanner;


public class First {
	public static void main(String[] args) {
//		System.out.println("Hello World");
		
//		int num= 010;
		
		String name , address;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Name : ");
		name = obj.nextLine();
		System.out.println("Enter address : ");
		address = obj.nextLine();
		System.out.println("Name : "+name);
		System.out.println("Address : "+address);
		
		
		
		int num1 , num2 , result;
		System.out.print("Enter first number : ");
		num1 = obj.nextInt();
		System.out.print("Enter second number : ");
		num2 = obj.nextInt();
		result = num1+num2;
		System.out.print("Sum : "+result);
		
		obj.close();
		
	}
}
