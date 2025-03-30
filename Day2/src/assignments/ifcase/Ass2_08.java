package assignments.ifcase;
import java.util.Scanner;

public class Ass2_08 {
	public static void main(String[] args) {
		/*Write a program to accept a character and print whether it is upper case, lower case, digit or a special
character.*/
		
		char ch;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter char");
		ch = sc.next().charAt(0);
		if(ch>='A' && ch<='Z') {
			System.out.println("Upper case");
		}
		else if(ch>='a' && ch<='z') {
			System.out.println("Lower case");
		}
		else if(ch>='0' && ch<='9') {
			System.out.println("Digit");
		}
		else {
			System.out.println("Special Case");
		}
		sc.close();
	}
}
