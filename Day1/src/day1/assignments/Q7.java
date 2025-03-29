package day1.assignments;
import java.util.Scanner;

public class Q7 {
public static void main(String[] args) {
	/* 7  Take the radius of a circle as input from the user and print the area of the circle. Use the formula: 
	`Area = π * r^2`,
	`Circumference = 2 * π * r`.  */
	
	Scanner obj = new Scanner(System.in);
	
	float radius, area, circ;
	
	System.out.println("Enter the size of radius ");
	radius = obj.nextFloat();
	
	area = (float) (Math.PI * radius * radius);
	
	circ = (float) (2 * Math.PI * radius) ;
	
	System.out.println("Area : "+ area + "\nCircumference : "+circ);
	obj.close();
	
	}
}
