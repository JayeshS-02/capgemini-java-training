package day4;
import java.util.Scanner;

enum Gender {
	MALE,FEMALE;
	
	public static Gender acceptGender() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str.equalsIgnoreCase("male"))
            return MALE;
        else
            return FEMALE;
            
    }
}
