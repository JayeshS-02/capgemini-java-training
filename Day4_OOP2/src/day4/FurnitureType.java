package day4;

import java.util.Scanner;

enum FurnitureType {
	CHAIR,TABLE,BED;
	
	public static FurnitureType acceptFurnitureType() {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		if(str.equalsIgnoreCase("chair"))
			return CHAIR;
		else if(str.equalsIgnoreCase("table"))
			return TABLE;
		else
			return BED;
	}
}
