package strings.methods.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Example15 {
	public static void main(String[] args) {
		 /*Write a Java program that: (Copying and Filling) 
		 a. Creates an array of size 10 and fills it with the number 5 using Arrays.fill(). 
		 b. Copies the first 5 elements of the filled array into a new array using Arrays.copyOf(). 
		 c. Prints both arrays using Arrays.toString().*/
		
		Scanner sc = new Scanner(System.in);
		int num[]= new int[10];
		
		Arrays.fill(num, 5);
		System.out.println(Arrays.toString(num));
		int copyArray[] = Arrays.copyOf(num, 5); 
		System.out.println(Arrays.toString(copyArray));
	}
}
