package strings.methods.assignment;

import java.util.Scanner;

public class Example6 {
	public static void main(String[] args) {
//		Write a program that accepts 10 names in an array and display all names that ends with “h”
		
		Scanner sc = new Scanner(System.in);
		String arr[] = new String[10];
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter name "+(i+1)+" : ");
			arr[i]=sc.nextLine();
		}
		for(String x: arr) {
			if(x.endsWith("h") || x.endsWith("H")){
					System.out.println(x);
			}
		}
		sc.close();
	}
}
