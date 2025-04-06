package collections.assignment6;

import java.util.Objects;
import java.util.Scanner;

public class Book {
	protected String isbn;
	protected String title;
	protected String author;
	protected double price;
	protected int quantity;
	public Book() {

	}
	
	public Book(String isbn, String title, String author, double price, int quantity) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.price = price;
		this.quantity = quantity;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
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

	@Override
	public int hashCode() {
		return Objects.hash(author, isbn, price, quantity, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(isbn, other.isbn)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price) && quantity == other.quantity
				&& Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
//		return super.toString();
		return "[ISBN:" + isbn + " , Title: " + title+ " , Author : " + author + " , Price : "
				+ price + " , quantity: " + quantity + " ]";
	}
	
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Book's ISBN number ");
		isbn = sc.nextLine();
//		sc.nextLine();
		System.out.println("Title of the book ");
		title = sc.nextLine();
		System.out.println("Author of the book ");
		author = sc.nextLine();
		System.out.println(" Book's price");
		price = sc.nextDouble();
		sc.nextLine();
		System.out.println("Quantity of the book in stock ");
		quantity = sc.nextInt();
		sc.nextLine();
	}
	
}
