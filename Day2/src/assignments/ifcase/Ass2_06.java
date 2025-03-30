package assignments.ifcase;
import java.util.Scanner;

public class Ass2_06 {
	public static void main(String[] args) {
		/*Write a program that accepts product price and quantity and then calculate the revenue. If the revenue
is more than 5000 a discount is 10% offered. Program should display the discount and net revenue*/
		
		int price,qnt;
		float rev,discount = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the price and quanity");
		price = sc.nextInt();
		qnt = sc.nextInt();
		
		rev = price*qnt;
		if(rev>5000) {
			discount = (float) (rev*0.1);
			rev = rev - discount;
		}
		
		System.out.println("Discount : "+discount + "\nNet Revenure : "+rev);
		
		sc.close();
	}
}
