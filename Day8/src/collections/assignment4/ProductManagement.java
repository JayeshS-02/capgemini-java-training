package collections.assignment4;
import java.util.Scanner;

import collections.assignment3.EmployeeList;

public class ProductManagement {
	public static void main(String[] args) {
		ProductList list = new ProductList();
		int cd;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("//	1. Add a Product to the list. \r\n"
					+ "2. Display all Products in the list. \r\n"
					+ "3. Update a Product (by code). \r\n"
					+ "4. Delete a Product (by code). \r\n"
					+ "5. Sort Products by name in ascending order. \r\n"
					+ "6. Sort Products by price in descending order. \r\n"
					+ "7. Calculate the total stock value (price * quantity) for all products. \r\n"
					+ "8. Exit the program. ");
			
			
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
				list.addProduct();
				break;
				
				
			case 2:
				list.displayAllProducts();
				break;
				
				
			case 3:
				System.out.println("Enter code to updated Product");
				cd = sc.nextInt();
				list.updateProduct(cd);
				break;
				
			case 4:
				System.out.println("Enter product code to be deleted");
				cd = sc.nextInt();
				list.deleteProduct(cd);
				break;
				
			case 5:
//				"5. Sort Product by name in ascending order. \r\n"
				list.sortProductByName();
				break;
				
			case 6:
//				"6. Sort Product by price in descending order. \r\n"
				list.sortProductByPrice();
				break;
				
			case 7:
//				Calculate stock value.
				System.out.println("Total Stock Value : "+list.totalStockValue());
				break;
				
			case 8:
				sc.close();
				System.out.println("Program Terminated");
				System.exit(0);
				break;
				
			default:
				break;
			}
		}
		
	}
}
