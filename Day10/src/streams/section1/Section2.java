package streams.section1;
import java.util.*;
import java.util.stream.Collectors;


public class Section2 {
	public static void main(String[] args) {
//		11. Sorting a List of Integers:
//		Sort List<Integer> numbers = [9, 3, 6, 1, 8, 4] in ascending order and print them.
		
		List<Integer> numbers = Arrays.asList(9, 3, 6, 1, 8, 4);
		List<Integer> sortedNumbers = numbers.stream()
		.sorted()
		.collect(Collectors.toList());
		System.out.println(sortedNumbers);
		
		
//		12. Sorting a List of Strings:
//		Given List<String> words = ["banana", "apple", "cherry", "date"], sort them alphabetically.
		
		List<String> names = Arrays.asList("banana", "apple", "cherry", "date");
		List<String> sortedNames = names.stream()
		.sorted()
		.collect(Collectors.toList());
		System.out.println(sortedNames);
		
//		13. Sorting Products by Price (Custom Class):
//			Given a List<Product>, sort products by price in descending order and print them.
		List<Product> products = List.of(
				new Product("Product 1",5000),
				new Product("Product 2",2000),
				new Product("Product 3",3000),
				new Product("Product 4",5000)
				);
		
		products.stream().sorted((a,b)->Double.compare(b.getPrice(), a.getPrice())).forEach(System.out::println);;
		
		
		//14. Find Maximum Price in Product List:
		//Find and print the product with the highest price.
//		products.stream().filter(e->e.)
		Optional<Product> maxProduct = products.stream()
		.max(Comparator.comparingDouble(e -> e.price));
		maxProduct.ifPresent(System.out::println);
		
//		15. Find Minimum Price in Product List:
//			 Find and print the product with the lowest price.
		Optional<Product> minProduct = products.stream()
				.min(Comparator.comparingDouble(e -> e.price));
				minProduct.ifPresent(System.out::println);
				
//		16. Find Sum of All Prices in a List:
//		 Given List<Product> products, find the sum of all product prices using reduce().
				float totalPrice = products.stream().map(e->e.price).reduce(0.0f,(a,b)->a+b);	
				System.out.println("Total Price:"+totalPrice);
	
		//17. Find Average Price of Products:
//		  Given a List<Product>, calculate and print the average price of products.
		double avgPrice = products.stream().collect(Collectors.averagingDouble(e->e.price));
			System.out.println("Average Price :"+avgPrice);	
				
//		18. Find the Total Number of Products:
//		Count the number of products using count() and print the result.
//			double productCount = products.stream().collect(Collectors.counting(e->e.price));
//			System.out.println("Average Price :"+avgPrice);
			
//		System.out.println(products.size());
		Map<Product, Long> productCount = products.stream()
				.collect(Collectors.groupingBy(w -> w, Collectors.counting()));

				System.out.println(productCount);
//		double avgPrice = products.stream().collect(Collectors.averagingDouble(e->e.price));
//		System.out.println("Average Price :"+avgPrice);	
				
				
//				19. Get DisƟnct Numbers from a List:
//					 Given List<Integer> numbers = [2, 4, 2, 6, 8, 4, 10, 8], remove duplicates and print the unique values.
				List<Integer> nums = Arrays.asList(2, 4, 2, 6, 8, 4, 10, 8);
				List<Integer> uniqueNumbers = nums.stream().distinct().collect(Collectors.toList());
				System.out.println(uniqueNumbers);
				
//				20. Find the Top 3 Most Expensive Products:
//					 Given a List<Product>, find the three most expensive products using sorted() and limit().
				List<Product> topThreeProduct = products.stream()
						.sorted((a,b)->Double.compare(a.getPrice(), b.getPrice()))
						.limit(3)
						.collect(Collectors.toList());
						System.out.println(topThreeProduct);
						
//			21. Concatenate Product Names with Collectors.joining():
//			Given List<Product>, concatenate product names into a single string separated by commas.
			
						String prodNames = products.stream()
								.map(e -> e.name)
								.collect(Collectors.joining(", "));
								System.out.println("Products: " + prodNames);
								
			
											
					
				
	}
}
