package assignments.loops;

import java.util.Scanner;

public class Ass3_19 {
	public static void main(String[] args) {
		/*Write a program to print fibonacci series of n terms where n is input by user */
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("How may fibonacci numbers you want");
		num=sc.nextInt();
		int fib1 = 0;
		int fib2 = 1;
		int res;
		for(int i=0;i<num;i++) {
			System.out.println(fib1+" ");
			res = fib1+fib2;
			fib1=fib2;
			fib2=res;
		}
		
		sc.close();
		
	}
}
