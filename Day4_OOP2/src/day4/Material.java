package day4;

import java.util.Scanner;

enum Material {
	IRON, STEEL, WOODEN;
	
	public static Material acceptMaterial() {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		if(str.equalsIgnoreCase("iron"))
			return IRON;
		else if(str.equalsIgnoreCase("steel"))
			return STEEL;
		else
			return WOODEN;
	}
}
