package strings.methods.assignment;

import java.util.Scanner;

public class Example4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		
		while(!(str.length()>=6)) {
			System.out.println("Invalid Length, Enter String again");
			str = sc.nextLine();	
		}
		
		
		for(int i = 0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(!(ch>='0' && ch<='9' || ch>='A' && ch<='Z' || ch>='a' && ch<='z' || ch=='@')) {
				System.out.println("Invalid Character");
				break;
			}
			else if(i==str.length()-1){
			System.out.println("Valid String");	
			}
		}
	}
}
