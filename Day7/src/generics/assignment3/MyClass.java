package generics.assignment3;

import java.util.Arrays;

public class MyClass implements MinMax<Integer>{
	
	public Integer min(Integer[] arr) {
		Arrays.sort(arr);
		int min = arr[0];
		return min;
	}
	public Integer max(Integer[] arr) {
//		Arrays.sort(arr);
		int max = arr[arr.length-1];
		return max;
	}
	public static void main(String[] args) {
		MyClass m1 = new MyClass();
		Integer[] arr = {4,77,56,32,19,39};
		System.out.println("minimum: "+m1.min(arr));
		System.out.println("minimum: "+m1.max(arr));
	}
}
