package strings.methods;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		// Write a program that accept string and print all index of 'a'
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sc.nextLine();

		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch=='A' || ch=='a') {
				System.out.println("Index: "+i);
			}
		}
		
		
		System.out.println();
		
		int index = 0;
		while(index!=-1) {
			index = str.indexOf("a",index);
			if(index!=-1) {
				System.out.println("Index :"+index);
				index++;
			}
		}
		System.out.println();
		
		int ind = str.length();
		while(ind!=-1) {
			ind = str.lastIndexOf("a",ind);
			if(ind!=-1) {
				System.out.println("Index :"+ind);
				ind--;
			}
		}
	}
}
