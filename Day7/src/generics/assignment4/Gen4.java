package generics.assignment4;

import java.util.Arrays;

class Gen4 {
	
	public static<T> void swap(T arr[],int i,int j) {
		T temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public static void main(String[] args) {
		Integer[] numbers = {1, 2, 3, 4}; 
		swap(numbers, 0, 2); 
		System.out.println(Arrays.toString(numbers)); // Output: [3, 2, 1, 4] 
		String[] words = {"A", "B", "C"}; 
		swap(words, 1, 2); 
		System.out.println(Arrays.toString(words)); // Output: ["A", "C", "B"]
	}
}
