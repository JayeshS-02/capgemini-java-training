package strings.methods;

import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		abc:
		while(true) {
			System.out.println("Enter string");
			String str = sc.nextLine();
			
			if(str.length()<5) {
				System.out.println("Invalid Length!!!");
				continue;
			}
			
			for(int i=0;i<str.length();i++) {
				char ch = str.charAt(i);
				if(!(ch>='A' && ch<='Z' || ch>='a' && ch<='z')) {
					System.out.println("Invalid Character");
					continue abc;
					
				}
			}
			System.out.println("Valid String : "+str);
			break;
		}
	}
}
