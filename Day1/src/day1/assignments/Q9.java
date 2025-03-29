package day1.assignments;
import java.util.Scanner;

public class Q9 {
	public static void main(String[] args) {
		/* 9  Write a program that accepts temperature in Centigrade and display it in Fahrenheit. 
		Use the formula: `F=C*9/5+32 */
		
		Scanner obj = new Scanner(System.in);
		int centi;
		float Faren;
		System.out.println("Enter temperature in Celcius");
		centi = obj.nextInt();
		
		Faren = (float)((centi*9/5)+32);
		System.out.println("Farenheit : "+Faren);
		
		obj.close();
	}
}
