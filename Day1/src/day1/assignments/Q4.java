package day1.assignments;
import java.util.Scanner;


public class Q4 {
public static void main(String[] args) {
	
//	4  Write a program that accepts your name, address and mobile number and display it on screen.
		
	Scanner obj = new Scanner(System.in);
	
		String name1,address;
		long mob;
		System.out.println("Enter your name ");
		name1 = obj.nextLine();
			
		System.out.println("Enter your address ");
		address = obj.nextLine();
			
		System.out.println("Enter your mobile number ");
		mob = obj.nextLong();
			
		System.out.println("Name :"+ name1 + "\nAddress:"+address + "\nMobile no. : "+ mob);
		obj.close();
}
}
