package strings.methods.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Example16 {
	public static void main(String[] args) {
		/* Write a Java program that: (Comparing Arrays) 
		a. Takes two integer arrays as input from the user. 
		b. Compares them using Arrays.equals(). 
		c. Prints whether they are equal or not. */
		
		Scanner sc = new Scanner(System.in);
		int arr1[]= new int[4];
		int arr2[]= new int[4];
		
		System.out.println("Enter elements in array 1");
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("Enter elements in array 2");
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=sc.nextInt();
		}
		
		boolean isEqual = Arrays.equals(arr1, arr2);
		if(isEqual) {
			System.out.println("Both arrays are Equal");	
		}
		else {
			System.out.println("Both arrays are not Equal");		
		}
	}
}
