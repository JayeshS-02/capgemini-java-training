package day4;
import java.util.Scanner;

enum House {
	PALASH("Orange"),GULMOHAR("Red"),KACHNAR("Purple"),AMALTAS("Yellow");
	String color;
	
	House(String color){
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	public static House acceptHouse() {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		if(str.equalsIgnoreCase("PALASH")) {
			return PALASH;
		}
		else if(str.equalsIgnoreCase("GULMOHAR")) {
			return GULMOHAR;
		}
		else if(str.equalsIgnoreCase("KACHNAR")) {
			return KACHNAR;
		}
		else {
			return AMALTAS;
		}
		
	}
}
