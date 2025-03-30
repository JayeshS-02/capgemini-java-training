package assignments.ifcase;
import java.util.Scanner;

public class Ass2_07 {
	public static void main(String[] args) {
		/*Write a program to accept a number as year of calender and print whether the year is a leap year or
		not.
		[Leap Years are any year that can be evenly divided by 4. A year that is evenly divisible by 100 is a
		leap year only if it is also evenly divisible by 400.]*/
		
		Scanner sc = new Scanner(System.in);
		int year;
		System.out.println("Enter year");
		year = sc.nextInt();
		
		if(year%4==0 || year%100==0 && year%400==0) {
			System.out.println("Leap Year");
		}
		else
			System.out.println("Not Leap year");
		
		sc.close();
	}
}
