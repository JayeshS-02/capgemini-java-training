package day4;

import java.util.Scanner;

public class MyClassCnt {
	protected int a;
	protected int b;
	protected static int cnt;
	
	//initialize cnt using static block
	static {
		cnt=0;
	}
	
	public MyClassCnt() {
		cnt++;
	}
	
	public MyClassCnt(int a,int b) {
		this.a = a;
		this.b = b;
		cnt++;
	}
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public static int getCnt() {
		return cnt;
	}
	
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a : ");
		a=sc.nextInt();
		System.out.println("Enter b : ");
		b=sc.nextInt();
		sc.close();
	}
	
	public void showData() {
		
		System.out.println("a : "+a);
		
		System.out.println("b : "+b);
		System.out.println("Counter : "+cnt);
		
	}
	
	public static void getMsg() {
		if(MyClassCnt.getCnt()<5) {
			System.out.println("Too Less");
		}
		else if(MyClassCnt.getCnt()==5) {
			System.out.println("“Will do");
		}
		else {
			System.out.println("Exceeding the Limits");
		}
	}

	public static void main(String[] args) {
		MyClassCnt a = new MyClassCnt();
		MyClassCnt b = new MyClassCnt(11,21);
		MyClassCnt c = new MyClassCnt(31,30);
		MyClassCnt d = new MyClassCnt(31,30);
		MyClassCnt e = new MyClassCnt(31,30);
		MyClassCnt f = new MyClassCnt(31,30);
		f.acceptData();
		f.showData();
		MyClassCnt.getMsg();
	}
}
