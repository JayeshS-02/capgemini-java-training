package assignments.loops;

import java.util.Scanner;

public class Ass3_17 {
	public static void main(String[] args) {
		/*Write a program to enter the numbers till the user wants and at the end the program should display the 
		largest and smallest numbers entered.*/
		
		int num,smallestNum,largeNum;
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		num=sc.nextInt();
		smallestNum=num;
		largeNum=num;
		System.out.println("Continue ? Y/N");
		ch = sc.next().charAt(0);
		
		while(ch=='Y') {
			System.out.println("Enter number");
			num=sc.nextInt();
			if(num<smallestNum) {
				smallestNum=num;
			}
			if(num>largeNum) {
				largeNum=num;
			}
			
			System.out.println("Continue ? Y/N");
			ch = sc.next().charAt(0);
			
		}
		sc.close();
		System.out.println("Smallest :"+smallestNum);
		System.out.println("Largest : "+largeNum);
	}
}
