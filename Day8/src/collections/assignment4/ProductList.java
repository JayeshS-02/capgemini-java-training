package collections.assignment4;

import java.util.ArrayList;
import java.util.Comparator;

import collections.assignment3.Employee;
import collections.assignment5.Student;

public class ProductList {
	protected ArrayList<Product> products;
	
	public ProductList() {
		// TODO Auto-generated constructor stub
		products = new ArrayList<>();
	}
	
	public void addProduct() {
		Product obj = new Product();
		obj.acceptData();
		products.add(obj);
	}
	
	public void deleteProduct(int code) {
		for(int i=0;i<products.size();i++) {
			Product pr = products.get(i);
			
			if(code==pr.code) {
				products.remove(i);
				System.out.println("Product with code"+pr.getCode()+" removed.");
				return;
			}
		}
		System.out.println("Product does not exist.");
	}
	
	public void displayAllProducts() {
		products.forEach(System.out::println);
	}
	
	public void updateProduct(int code) {
		Product obj = new Product();
		obj.acceptData();
		for(int i=0;i<products.size();i++) {
			
			Product pr = products.get(i);
			if(obj.code==pr.code) {
				pr.setName(obj.getName());
				pr.setCategory(obj.getCategory());
				pr.setPrice(obj.getPrice());
				pr.setQuantity(obj.getQuantity());
				System.out.println("Product Updated");
				return;
			}
		}
		System.out.println("No Product Found");
	}
	
	public void sortProductByName() {
		products.sort(Comparator.comparing(Product::getName));
		products.forEach(System.out::println);
	}
	public void sortProductByPrice() {
		products.sort(Comparator.comparingDouble(Product::getPrice).reversed());
		products.forEach(System.out::println);
	}
	
	public double totalStockValue() {
		double totalStock=0.0;
		for(Product pr : products) {
			totalStock+=(pr.getPrice()*pr.getQuantity());
		}
		return totalStock;
	}
}
