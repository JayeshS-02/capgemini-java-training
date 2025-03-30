package assignments.loops;
import java.util.Scanner;

public class Ass3_15 {
	public static void main(String[] args) {
		/*Write a program that accepts a positive integer. It should then print a message indicating whether the
		number is a prime number or not*/
		
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter number");
		num = sc.nextInt();
		boolean isprime =  true;

		if (num <= 1)
			isprime=  false;

	    // Check divisibility from 2 to n-1
	    for (int i = 2; i <=num; i++)
	        {
	            if (num % i == 0) 
	            	isprime =  false;
	        }

	    
	    if(isprime) {
	    	System.out.println("Prime");
	    }
	    else {
	    	System.out.println("Not Prime");
	    }
	    sc.close();
	}
}
