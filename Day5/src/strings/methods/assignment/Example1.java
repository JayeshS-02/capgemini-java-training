package strings.methods.assignment;

import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) {
		
		String str = "Betty got a bit of bitter better butter";
		
//		 Display all the occurrences (index) of “b” and “t” in the String. 

		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch=='B' || ch=='b') {
				System.out.println("Index of B/b: "+i);
			}
		}
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch=='T' || ch=='t') {
				System.out.println("Index of T/t: "+i);
			}
		}
		
		System.out.println();
		
//		Display each word along with its length in a new line. 
		
		String s[]=str.split(" ");
		for(String s1: s) {
			System.out.println("String : "+s1+" Length: "+s1.length());
		}
		
		System.out.println();
//		Display all the words that starts with “b” is the String
		for(String s1: s) {
			if(s1.startsWith("b") || s1.startsWith("B")) {
				System.out.println(s1);
			}
		}
	}
}
