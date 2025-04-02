package arrays.examples;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
//		Write  a program that accepts 10 numbers and print the sum and average
		
		Scanner sc = new Scanner(System.in);
		int num[]= new int[10];
		float sum=0,avg=0;
		for(int i=0;i<num.length;i++) {
			num[i]=sc.nextInt();
		}
		
		for(int x:num) {
			sum+=x;
		}
		avg = sum/num.length;
		
		System.out.println("Sum : "+sum);
		System.out.println("Avg : "+avg);
		sc.close();
		
	}
}
