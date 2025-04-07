package maps.assignment4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BookMap {
	HashMap<String, Book> bookMap;
	Scanner sc = new Scanner(System.in);
	String isbn;
	double newPrice;

	public BookMap() {
		bookMap = new HashMap<>();
	}

	public void addBook() {
		System.out.println("Enter ISBN number");
		isbn = sc.nextLine();
		if (bookMap.containsKey(isbn)) {
			System.out.println("Book already exist");
			return;
		}
		Book book = new Book();
		book.acceptData();
		bookMap.put(isbn, book);
		System.out.println("Book added successfully");
	}

	public void checkBook() {
		System.out.println("Enter ISBN number");
		isbn = sc.nextLine();
		if (bookMap.containsKey(isbn)) {
			System.out.println("The book with ISBN [" + isbn + "] exists in the library. ");
			return;
		}
		System.out.println("The book with ISBN [" + isbn + "] is not available in the library. ");
	}

	public void removeBook() {
		System.out.println("Enter ISBN number");
		isbn = sc.nextLine();
		if (bookMap.containsKey(isbn)) {
			bookMap.remove(isbn);
			System.out.println("The book with ISBN [" + isbn + "] was removed from the library. ");
			return;
		}
		System.out.println("The book with ISBN [ISBN] was not found in the library. ");
	}

	public void updatePrice() {
		System.out.println("Enter ISBN number");
		isbn = sc.nextLine();
		if (!bookMap.containsKey(isbn)) {
			System.out.println("The book with ISBN [" + isbn + "] was not found in the library. ");
			return;
		}
		System.out.println("Enter new price for book");
		newPrice = sc.nextDouble();
		sc.nextLine();
		Book book = bookMap.get(isbn);
		book.setPrice(newPrice);
		System.out.println("The price for book [" + book.getTitle() + "] has been updated to $[" + newPrice + "].");
	}

	public void displayAllBooks() {
		if (bookMap.isEmpty()) {
			System.out.println("No books are available in the library. ");
		} else {
			System.out.println("Library Book List: ");
			bookMap.forEach((K, V) -> {
				System.out.println("ISBN: [" + K + "], Title: [" + V.getTitle() + "], Author: [" + V.getAuthor()
						+ "], Price: $[" + V.getPrice() + "] ");
			});
		}
	}

	public void mostExpensiveBook() {
		if (bookMap.isEmpty()) {
			System.out.println("No books available to determine the most expensive book.");
		} else {
			Book book = null;
			double highestPrice = 0.0;
			for (Map.Entry<String, Book> entry : bookMap.entrySet()) {
				if (entry.getValue().getPrice() > highestPrice) {
					highestPrice = entry.getValue().getPrice();
					book = entry.getValue();
				}
			}
			System.out.println("The most expensive book is [" + book.getTitle() + "] by [" + book.getAuthor()
					+ "] with a price of $[" + highestPrice + "]. ");
		}
	}
}
