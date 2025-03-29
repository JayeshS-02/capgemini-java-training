package day1.assignments;
import java.util.Scanner;

public class Q12 {
	public static void main(String[] args) {
//		Ask the user to input an amount in dollars (double) and print the equivalent amount in euros. Assume the conversion
//		rate is 0.85 Euro per dollar.
		
		float dollar,euro;
		Scanner obj = new Scanner(System.in);
		System.out.println("Amount in dollar ");
		dollar = obj.nextFloat();
		
		euro = (float)(0.85*dollar);
		System.out.println("Euros : "+euro);
		
		obj.close();
	}
}
