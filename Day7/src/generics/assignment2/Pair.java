package generics.assignment2;

class Pair<K,V> {
	K key;
	V value;
	
	public Pair() {
		
	}
	public Pair(K key,V value) {
		this.key=key;
		this.value=value;
	}
	
	public void setKey(K key) {
		this.key=key;
	}
	public K getKey() {
		return key;
	}
	
	public void setValue(V value) {
		this.value=value;
	}
	public V getValue() {
		return value;
	}
	public static void main(String[] args) {
		Pair<String,Integer> student = new Pair<>("Jayesh",90);
		System.out.println(student.getKey());
		System.out.println(student.getValue());
		System.out.println();
		Pair<Integer,String> student2 = new Pair<>(21512315,"John");
		System.out.println(student2.getKey());
		System.out.println(student2.getValue());
	}
}
