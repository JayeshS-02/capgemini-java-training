package day1;
import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
		float radius,area,cir;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Radius : ");
		radius = obj.nextFloat();
		area = (float) (Math.PI * Math.pow(radius, 2));
		cir = 2 * 3.14f * radius;
		
		System.out.println("Area : " + area  + "\nCircumference : "+ cir);
		obj.close();
		
		
//		9893075987
	}
}
