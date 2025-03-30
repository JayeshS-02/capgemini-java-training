package assignments.loops;

public class Ass3_18 {
	public static void main(String[] args) {
		/*Write a program to print out all Armstrong numbers between 1 and 500. If sum of cubes of each digit of 
the number is equal to the number itself, then the number is called an Armstrong number. 
For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 ) */
		
		for (int i = 1; i <= 500; i++) {
            int num = i;
            int result = 0;
            int temp = i;

            
            while (temp > 0) {
                int rem = temp % 10; 
                result += (rem * rem * rem); 
                temp /= 10; 
            }

            if (result == num) {
                System.out.println(num);
            }
		}
	}
}
