package streams.section1;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

class Product{
	protected String name;
	protected float price;
	public Product(String name,float price) {
		this.name=name;
		this.price=price;
	}
	public float getPrice()
	{
		return price;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return name + " - $" + price;
	}
	
}

public class Question1 {
	public static void main(String[] args) {
//		1. Stream from an Array:
//		Convert an array of integers {5, 10, 15, 20, 25} into a stream and print all elements.
		
//		Integer[] numbers = {5, 10, 15, 20, 25};
//		Stream<Integer> stream1 = Arrays.stream(numbers);
//		stream1.forEach(System.out::println);	
//		
//		
//		2. Stream from a List:
//		Convert a List<String> containing names ["Alice", "Bob", "Charlie", "David"] into a stream and print
//			each name in uppercase.
		
//		List<String>names = Arrays.asList("Alice", "Bob", "Charlie", "David");
//		List<String>upperNames= names.stream().map(String::toUpperCase).collect(Collectors.toList());
//		System.out.println(upperNames);
		
//		3 Stream from a Set:
//			Convert a Set<Integer> {3, 6, 9, 12, 15} into a stream and print all elements.
		
//		Set<Integer> set1 = new HashSet<Integer>(Set.of(3, 6, 9, 12, 15));
//		set1.stream().forEach(System.out::println);	
		
		
//		4 Stream from a Map (Keys):
//		Create a Map<Integer, String> with student IDs and names. Convert the keys to a stream and print
//			them.
		Map<Integer, String> studentMap = new HashMap<>();
		studentMap.put(1, "Jayesh");
		studentMap.put(2, "Nikhil");
		studentMap.put(3, "Tejas");
		
		studentMap.keySet().stream().forEach(System.out::println);		
		
//		5. Stream from a Map (Values):
//			From the same map, extract and print all student names using a stream.
		
		studentMap.entrySet().stream().forEach(System.out::println);
	
//		6. Filtering a List:
//		Given List<Integer> numbers = [12, 45, 67, 89, 23, 56, 78], filter out numbers greater than 50 and
//			print them.
		
		List<Integer>numbers = Arrays.asList(12,45,67,89,23,56,78);
		numbers.stream().filter(n->n>50).forEach(System.out::println);
	
//		7. Filtering a List of Strings:
//		Given List<String> names = ["Mike", "Michael", "John", "Jonathan", "Mona"], filter and print names
//			starƟng with "M".
		
		List<String>names = Arrays.asList("Mike", "Michael", "John", "Jonathan", "Mona");
		names.stream().filter(name->name.startsWith("M")).forEach(System.out::println);
	
		
//		8. Filtering Products (Custom Class):
//		Given a List<Product> (with name and price fields), filter and print products that cost more than 500.
		
		List<Product> products = List.of(
				new Product("Product 1",5000),
				new Product("Product 2",2000),
				new Product("Product 3",3000),
				new Product("Product 4",5000)
				);
		List<Product> searchProducts = products.stream().filter(p->p.getPrice()>500).collect(Collectors.toList());
		System.out.println(searchProducts);
		
//		9 Mapping Data:
//		Convert a list of lowercase words ["java", "streams", "lambda"] to uppercase using map() and print
//			them.
		List<String>lowercases = Arrays.asList("java", "streams", "lambda");
		List<String>uppercases=lowercases.stream().map(String::toUpperCase).collect(Collectors.toList());
		uppercases.forEach(System.out::println);
	
//		10. Mapping Product Names:
//			Given a List<Product>, extract only product names and print them.
	
		products.stream().map(name->name.getName()).forEach(System.out::println);
	}
}
