package lambdaexpressions.Assignment5;
import java.util.Scanner;


public class Test {
	public static String covert(StringLibOne sl, String str) {
		return sl.convert(str);
	}
	public static int covert(StringLibTwo sl2, String str) {
		return sl2.convert(str);
	}
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		while(true) {

//			System.out.println("Enter Your Choice : ");
			System.out.println("1. Title Case");
			System.out.println("2. To Camel Case");
			System.out.println("3. Remove Space");
			System.out.println("4. Count Vowels");
			System.out.println("5. Count Consonants ");
			System.out.println("6. Count Alphabets");
			System.out.println("7. Count Words");
//			System.out.println("4. Count Vowels");
//			public static int countConsonants(String str) 
//			 public static int countAlphabets(String str) 
//			 public static int countWords(String str)

			System.out.println("Enter Your Choice : ");
			int choice = in.nextInt();
			in.nextLine();
			switch(choice) {
				case 1 : 
					System.out.println("Enter String :");
					String strTitleCase = in.nextLine();
					String strTitleCaseOut = covert(StringLibrary::toTitleCase, strTitleCase);
					System.out.println(strTitleCaseOut);
					break;
				case 2 : 
					System.out.println("Enter String :");
					String strCamelCase = in.nextLine();
					String strCamelCaseOut = covert(StringLibrary::toTitleCase, strCamelCase);
					System.out.println(strCamelCaseOut);
					break;
					
					
				case 3: System.out.println("Enter String :");
					String strRemoveSpace = in.nextLine();
					String strRemoveSpaceOut = covert(StringLibrary::removeSpaces, strRemoveSpace);
					System.out.println(strRemoveSpaceOut);
					break;
					
				case 4: System.out.println("Enter String :");
				String strCountVowel = in.nextLine();
				int vowelCount = covert(StringLibrary::countVowels, strCountVowel);
				System.out.println("Vovel count : "+vowelCount);
				break;
				
				case 5: System.out.println("Enter String :");
				String strConsonants = in.nextLine();
				int consCount = covert(StringLibrary::countVowels, strConsonants);
				System.out.println("Vovel count : "+consCount);
				break;
				
				
				case 6: System.out.println("Enter String :");
				String strAlphabets = in.nextLine();
				int alphaCount = covert(StringLibrary::countVowels, strAlphabets);
				System.out.println("Vovel count : "+alphaCount);
				break;
				
				case 7: System.out.println("Enter String :");
				String strWords = in.nextLine();
				int wordCount = covert(StringLibrary::countVowels, strWords);
				System.out.println("Vovel count : "+wordCount);
				break;
				
				default :
					System.out.println("Program Terminated");
			}
		}
	}
}
