package strings.methods.assignment;

import java.util.Scanner;

public class Example5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arr[] = new String[10];
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter name "+(i+1)+" : ");
			arr[i]=sc.nextLine();
		}
		for(String x: arr) {
			if(x.startsWith("a") || x.startsWith("A")){
					System.out.println(x);
			}
		}
		sc.close();
	}
}
