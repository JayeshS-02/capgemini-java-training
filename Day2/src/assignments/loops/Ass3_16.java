package assignments.loops;
import java.util.Scanner;

public class Ass3_16 {
	public static void main(String[] args) {
		int num1,num2,hcf=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers to check HCF");
		num1=sc.nextInt();
		num2=sc.nextInt();
		for(int i=1;i<Math.min(num1,num2);i++) {
			if(num1%i==0 && num2%i==0) {
				hcf=i;
			}
		}
		sc.close();
		System.out.println("HCF: "+hcf);
	}
}
