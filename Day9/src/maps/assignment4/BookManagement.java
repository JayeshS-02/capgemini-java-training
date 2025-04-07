package maps.assignment4;
import java.util.Scanner;

public class BookManagement {
	public static void main(String[] args) {
		BookMap bookFetch = new BookMap();
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			System.out.println("\n1. Add New Books \n"
					+ "2. Check if a Book Exists \n"
					+ "3. Remove a Book from the Library \n"
					+ "4. Update Book Price \n"
					+ "5. Display All Books \n"
					+ "6. Find the Most Expensive Book \n"
					+ "7. Exit the Program \n");
			
			int choice = sc.nextInt();
			switch(choice) {
				
			case 1:
				bookFetch.addBook();
				break;
				
			case 2:
				bookFetch.checkBook();
				break;
				
			case 3:
				bookFetch.removeBook();
				break;
				
			case 4:
				bookFetch.updatePrice();
				break;
				
			case 5:
				bookFetch.displayAllBooks();
				break;
				
			case 6:
				bookFetch.mostExpensiveBook();
				break;
				
			case 7:
				System.out.println("Exiting the Library Book Management System. Goodbye! ");
				System.exit(0);
				
			default:
				System.out.println("Invalid Choice");
			}
		}
	}
}
