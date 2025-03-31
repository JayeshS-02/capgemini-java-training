package class_obj;

import java.util.Scanner;

class Rectangle2 extends Point{
	
	protected int width,height;
	
	public Rectangle2() {
		
	}
	
	public Rectangle2(int width, int height) {
		super(10,10);
		this.width = width;
		this.height = height;
	}
	
	public Rectangle2(int x,int y, int width, int height) {
		super(x,y);
		this.width = width;
		this.height = height;
	}
	
	public Rectangle2(Point p) {
		super(p.getX(),p.getY());
		this.width = 20;
		this.height = 30;
	}
	
	public Rectangle2(Point p, int width,int height) {
		super(p.getX(),p.getY());
		this.width = width;
		this.height = height;
	}
	
	public void setWidth() {
		this.width=width;
	}
	public int getWidth() {
		return width;
	}
	public void setHeight() {
		this.height=height;
	}
	public int getHeight() {
		return height;
	}
	
	@Override
	public void acceptData() {
		super.acceptData();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Width");
		width = sc.nextInt();
		System.out.println("Enter Height");
		height = sc.nextInt();
	
	}
	
	@Override
	public void showData() {
		super.showData();
		System.out.println("Width : " + width);
		System.out.println("Height : " + height);
	}
	
	public int getArea() {
		return width*height;
	}
	
	public int getPerimeter() {
		return 2*(width*height);
	}
	
	public Point getLeftPoint() {
        int x = getX();
        int y = getY();
        Point p = new Point(x, y);
        return p;
        // return new Point(getX(), getY());        //anonymous
    }
	
	public static void main(String[] args) {
		Rectangle2 r1 = new Rectangle2(20,40);
		r1.showData();
		
		System.out.println();
		
		Point p = new Point(1, 2);
		Rectangle2 r2 = new Rectangle2(p,25,30);
        r2.showData();
        
		System.out.println();
		
		Rectangle2 r3 = new Rectangle2(10,12,24,26);
		r3.showData();
		
		System.out.println();
		
		Point p1 = new Point(11,12);
		Rectangle2 r4 = new Rectangle2(p1);
        r4.showData();
        
        System.out.println();
		
		
		Rectangle2 r5 = new Rectangle2();
        r5.acceptData();
        r5.showData();
        System.out.println("Area : "+r5.getArea());
        
		Rectangle2 r6 = new Rectangle2(p);
		r6.getLeftPoint().showData();
	}

}
