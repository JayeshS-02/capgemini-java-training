package collections.assignment6;

import java.util.*;

import collections.assignment4.Product;

public class BookList {
	protected ArrayList<Book> books;
	Scanner sc = new Scanner(System.in);
	public BookList() {
		books = new ArrayList<Book>();
	}
	
	public void addBook() {
		Book obj = new Book();
		obj.acceptData();
		books.add(obj);
	}
	
	public void displayAllBooks() {
		books.forEach(System.out::println);
	}
	
	public void deleteBook(String isbn) {
		for(int i=0;i<books.size();i++) {
			Book obj = books.get(i);
			if(obj.getIsbn().equalsIgnoreCase(isbn)) {
				books.remove(i);
				System.out.println("Book with isbn"+isbn+" removed.");
				return;
			}
		}
		System.out.println("Book does not exist.");	
	}
	
//	Update a Book's price (by ISBN).
	public void updateBook(String isbn) {
		
	    
	    for (int i = 0; i < books.size(); i++) {
	        Book bk = books.get(i);
	        if (bk.getIsbn().equalsIgnoreCase(isbn)) {  // Correct check
	        	System.out.print("Enter new price: ");
	    	    double price = sc.nextDouble();
	            bk.setPrice(price);  // Update the existing book
	            System.out.println("Book price updated successfully.");
	            return;  // Exit after updating
	        }
	    }
	    
	    System.out.println("No Book Found with ISBN: " + isbn);
	}
	
//	5. Sort Books by title in ascending order.
	public void sortBookByTitle() {
		books.sort(Comparator.comparing(Book::getTitle));
		books.forEach(System.out::println);
	}
	
//	6. Sort Books by price in descending order.
	public void sortBookByPrice() {
		books.sort(Comparator.comparing(Book::getPrice).reversed());
		books.forEach(System.out::println);
	}
	
//	7. Calculate the total price of all books in stock (price * quantity).
	public double totalStockPrice() {
		double totalPrice=0.0;
		for(Book bk : books) {
			totalPrice+=(bk.getPrice()*bk.getQuantity());
		}
		return totalPrice;
	}
}
