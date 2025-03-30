package assignments.ifcase;
import java.util.Scanner;

public class Ass2_03 {
	public static void main(String[] args) {
		/*Write a program that accepts 3 numbers and then displays the largest number*/
		int num1,num2,num3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println(num1+" is largest");
		}
		else if(num2 > num1 && num2 > num3) {
			System.out.println(num2+" is largest");
		}
		else {
			System.out.println(num3+" is largest");
		}
		sc.close();
		
//		ternary
//		(num1>num2 && num1>num3 ? num1 : num2 > num3 ? num2 : num3);
	}
}
