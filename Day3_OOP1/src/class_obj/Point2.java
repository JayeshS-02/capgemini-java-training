package class_obj;
import java.util.Scanner;

public class Point2 {
	protected int x;
	protected int y;
	
	public Point2() {          //Point p = new Point();
		
	}
	
	public Point2(int x,int y) {          //Point p = new Point(10,20);
		this.x = x;
		this.y = y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	public int getX() {
		return x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	public int getY() {
		return y;
	}
	
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter X ");
		x=sc.nextInt();
		System.out.println("Enter Y ");
		y=sc.nextInt();
		sc.close();
		
	}
	
	public void showData() {
		System.out.println("X : "+x);
		System.out.println("Y : "+y);
	}
	
	public static void main(String[] args) {
		Point2 p1 = new Point2();
		p1.showData();
		
		Point2 p2 = new Point2(10,20);
		p2.showData();
		
		Point2 p3 = new Point2();
		p3.acceptData();
		p3.showData();
	}
}
