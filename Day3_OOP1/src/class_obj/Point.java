package class_obj;

import java.util.Scanner;

class Point {
//	private int x;
//	private int y;
	protected int x;
	protected int y;
	
	public Point() {                    //Default
    }

    public Point(int x, int y) {        //Paramtereized
        this.x = x;
        this.y = y;
    }
	
	public int getX() {
		return x;
	}
	
	public void setX(int a) {
		x = a;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int a) {
		y = a;
	}
	
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter X : ");
		x = sc.nextInt();
		System.out.println("Enter Y : ");
		y = sc.nextInt();
	
	}
	
	public void showData() {
		System.out.println("X : "+x);
		System.out.println("Y : "+y);
	}
	
	public static void main(String[] args) {
		Point p;
		p = new Point();
		p.setX(10);
		p.setY(20);
		p.showData();
		Point p1= new Point();
		p1.acceptData();
		p1.showData();
	}
}
