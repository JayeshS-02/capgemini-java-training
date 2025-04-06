package collections.assignment6;

import java.util.Scanner;


public class BookManagement {
	public static void main(String[] args) {
		BookList list = new BookList();
		Scanner sc = new Scanner(System.in);
		String isbn;
		while(true) {
			System.out.println("\n1. Add a Book to the list.  \r\n"
					+ "2. Display all Books in the list. \r\n"
					+ "3. Update a Book's price (by ISBN).  \r\n"
					+ "4. Delete a Book (by ISBN).  \r\n"
					+ "5. Sort Books by title in ascending order. \r\n"
					+ "6. Sort Books by price in descending order. \r\n"
					+ "7. Calculate the total price of all books in stock (price * quantity). \r\n"
					+ "8. Exit the program. ");
			
			
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
				list.addBook();
				break;
				
				
			case 2:
				list.displayAllBooks();
				break;
				
			case 3:
				System.out.println("Enter ISBN to Update book price");
				isbn =sc.nextLine();
				list.updateBook(isbn);
				break;
				
			case 4:
				System.out.println("Enter ISBN to delete book");
				isbn =sc.nextLine();
				list.deleteBook(isbn);
				break;
				
				
			case 5:
//				"5. Sort Student by name in ascending order. \r\n"
				list.sortBookByTitle();
				break;
				
			case 6:
//				"6. Sort Student by course and name in ascending order. \r\n"
				list.sortBookByPrice();
				break;
				
			case 7:
//				Calculate avg marks.
				System.out.println("Total price of books in stock:"+list.totalStockPrice());
				break;
			case 8:
//				Print all elements in descending order.
				sc.close();
				System.out.println("Program Terminated");
				System.exit(0);
				break;
				
			default:
				System.out.println("Invalid selection");
				break;
			}
		}
	}
}
