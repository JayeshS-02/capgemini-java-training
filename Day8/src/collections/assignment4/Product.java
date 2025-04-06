package collections.assignment4;

import java.util.Scanner;

public class Product {
	protected int code;
	protected String name;
	protected String category;
	protected double price;
	protected int quantity;

	public Product() {

	}
	
	public Product(int code, String name, String category, double price, int quantity) {
		super();
		this.code = code;
		this.name = name;
		this.category = category;
		this.price = price;
		this.quantity = quantity;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter product code");
		code=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter product Name");
		name=sc.nextLine();
		System.out.println("Enter product category");
		category=sc.nextLine();
		System.out.println("Enter product price");
		price=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter product quantity");
		quantity=sc.nextInt();
		sc.nextLine();
	}
	
	public String toString() {
		return "[Code:" + code + " , Name: " + name + " , category : " + category + " , price : "
				+ price + " , quantity: " + quantity+" ]";
	}
}
