package day1.assignments;
import java.util.Scanner;

public class Q8 {
	public static void main(String[] args) {
		/* 8  Write a program that accepts principle, rate and time and display simple and compound interest. 
		 Use the formula:
		`Simple Interest = Principal x Rate x Time / 100`, 
		`Compound Interest = Principal (1 + Rate)^Time - Principal`
		*/
		
		int pri, time;
		float rate, SI, CI;
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter principle amt");
		pri=obj.nextInt();
		
		System.out.println("Enter rate of interest");
		rate=obj.nextFloat();
		
		System.out.println("Enter time");
		time=obj.nextInt();
		
		SI = (float) ((pri*rate*time)/100);
		CI = (float) (pri * Math.pow(1+rate,time)-pri);
		
		System.out.println("Simple Interest : "+SI + "\nCompound Interest : "+CI);
		obj.close();
		
		
	}
}
