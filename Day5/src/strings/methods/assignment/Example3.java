package strings.methods.assignment;

import java.util.Scanner;

public class Example3 {
	public static void main(String[] args) {
		
		/* Write a program that accepts a String from user and perform the following checks: 
			a. The string should have atleast 5 characters. 
			b. The string should not have any special characters or alphabets except digits. 
			If any condition is not satisfied appropriate error message should be displayed. */
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		
		while(!(str.length()>=5)) {
			System.out.println("Invalid Length, Enter String again");
			str = sc.nextLine();	
		}
		
		
		for(int i = 0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(!(ch>='0' && ch<='9')) {
				System.out.println("Invalid Character");
				break;
			}
			else if(i==str.length()-1){
			System.out.println("Valid String");	
			}
		}
	}
}
