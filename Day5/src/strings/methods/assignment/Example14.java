package strings.methods.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Example14 {
	public static void main(String[] args) {
		/*Write a Java program that: (Sorting and Searching) 
a. Takes an integer array as input from the user. 
b. Sorts the array in ascending order using Arrays.sort(). 
c. Asks the user to enter a number to search for. 
d. Uses Arrays.binarySearch() to find the index of the number and displays the result.*/
		
		Scanner sc = new Scanner(System.in);
		int num[]= new int[4];
		int searchNumber;
		System.out.println("Enter number in array");
		for(int i=0;i<num.length;i++) {
			num[i]=sc.nextInt();
		}
		
//		Arrays.sort(num);
//		
		System.out.println("Enter number to be searched in array");
		searchNumber=sc.nextInt();
		
		System.out.println("Number present at index: "+ Arrays.binarySearch(num, searchNumber));
	}
}
