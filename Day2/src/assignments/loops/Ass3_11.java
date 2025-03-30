package assignments.loops;
import java.util.Scanner;

public class Ass3_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num,count=0;
		System.out.println("Enter the number");
		num=sc.nextInt();
		while(num>0) {
			num/=10;
			count++;
		}
		System.out.println(count);
		sc.close();
	}
}
