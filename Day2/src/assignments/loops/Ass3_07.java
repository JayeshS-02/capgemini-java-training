package assignments.loops;
import java.util.Scanner;

public class Ass3_07 {
	public static void main(String[] args) {
//		Write a program that accepts a number and print its multiplication table
		int num;
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		for(int i=1;i<=10;i++) {
			
			System.out.println(num+" * "+i+" = "+num*i);
		}
		sc.close();
	}
}
