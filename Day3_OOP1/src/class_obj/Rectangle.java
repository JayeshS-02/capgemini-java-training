package class_obj;
import java.util.Scanner;

class Rectangle {
	private int width;
	private int height;
	
	public void setWidth(int a) {
		width = a;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setHeight(int a) {
		height = a;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter width");
		width = sc.nextInt();
		System.out.println("Enter height");
		height = sc.nextInt();
		sc.close();
	}
	
	public void getPerimeter() {
		System.out.println("Perimeter "+ 2*(height+width));
	}
	
	public void getArea() {
		System.out.println("Area "+ height*width);
	}
	
	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		rect.setWidth(12);
		rect.setHeight(20);
		rect.getPerimeter();
		rect.getArea();
		
		Rectangle rect2 = new Rectangle();
		rect2.acceptData();
		rect2.getPerimeter();
		rect2.getArea();
	}
	
}
