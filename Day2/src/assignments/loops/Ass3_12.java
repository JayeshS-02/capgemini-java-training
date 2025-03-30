package assignments.loops;
import java.util.Scanner;

public class Ass3_12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num,rem,result=0;
		System.out.println("Enter number");
		num = sc.nextInt();
		
		while(num>0) {
			rem = num%10;
			num/=10;
			result = result*10+rem;
		}
		System.out.println(result);
		sc.close();
	}
}
