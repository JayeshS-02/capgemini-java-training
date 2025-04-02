package strings.methods.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Example8 {
	public static void main(String[] args) {
//		Write a program that accepts 10 numbers in an array and display then in ascending order.
		
		Scanner sc = new Scanner(System.in);
		int num[]= new int[5];
		
		for(int i=0;i<num.length;i++) {
			num[i]=sc.nextInt();
		}
		
		System.out.println("Ascending order");
//		int smaller =1000;
//		for(int i=0;i<num.length;i++) {
//			if(num[i]<=smaller) {
//				smaller=num[i];
//				continue;
//			}
//			System.out.println(smaller);
//		}
		
		Arrays.sort(num);
		for(int x:num) {
			System.out.println(x);
		}
	}
}
