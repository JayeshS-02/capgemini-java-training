package assignments.loops;
import java.util.Scanner;

public class Ass3_14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		char ch;
		int evenCount=0,oddCount=0;
//		System.out.println("Enter a number");
//		num = sc.nextInt();
		System.out.println("Want number (Y/N)");
		ch = sc.next().charAt(0);
		
		while(ch=='Y') {
			System.out.println("Enter a number");
			num = sc.nextInt();
			if(num%2==0) {
				evenCount++;
			}
			else {
				oddCount++;
			}
			System.out.println("Want another number (Y/N)");
			ch = sc.next().charAt(0);
		}
		
		System.out.println("Even Count : "+ evenCount);
		System.out.println("Odd Count : "+ oddCount);
		
		sc.close();
	}
}
