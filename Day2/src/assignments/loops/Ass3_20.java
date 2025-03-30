package assignments.loops;

import java.util.Scanner;

public class Ass3_20 {
	public static void main(String[] args) {
		/*Write a program to calculate the sum of following series where n is input by user.  
			1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n  */
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n :");
		n=sc.nextInt();
		sc.close();
		
		float sum=0.0f;
		for(int i=1;i<=n;i++) {
			sum=(float)(sum+(1f/i));
		}
		
		
		System.out.println("Sum : "+sum);
	}
}
