package generics.assignment1;

class Box<T> {
	
	T item;
	
	public Box() {
		
	}
	
	public Box(T item) {
		this.item=item;
	}
	
	public void set(T item) {
		this.item = item;
	}
	public T get() {
		return item;
	}
	public static void main(String[] args) {
		Box<Integer> intBox = new Box<>(); 
		intBox.set(10); 
		System.out.println(intBox.get());
		
		Box<String> strBox = new Box<>(); 
		strBox.set("Hello"); 
		System.out.println(strBox.get()); 
	}
}
