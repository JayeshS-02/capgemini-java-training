package lambdaexpressions.Assignment5;

class StringLibrary {
	public static String toTitleCase(String str) {
		String s[] = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for (String x : s)
			sb.append(x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase());
		return sb.toString();
	}

	public static String removeSpaces(String str) {
		String s[] = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for (String x : s)
			sb.append(x);
		return sb.toString();
	}
	
	public static String toCamelCase(String str) {
		String s[] = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<s.length;i++) {
			if(i==0) {
				sb.append(s[i].toLowerCase());
			}
			else {
				sb.append(s[i].substring(0, 1).toUpperCase() + s[i].substring(1).toLowerCase());
			}
		}
		return sb.toString();
	}

	public static int countVowels(String str) {
//		String s[] = str.split(" ");
//		StringBuilder sb = new StringBuilder();
//		for(String x : s)
//			sb.append(x);
//		return sb.toString();

		int vowCount = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.toLowerCase().charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
					|| str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				vowCount++;
			}
		}
		return vowCount;
	}
	
	public static int countConsonants(String str) {
		int consCount = 0;
		for (int i = 0; i < str.length(); i++) {
			if (!(str.toLowerCase().charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
					|| str.charAt(i) == 'o' || str.charAt(i) == 'u')) {
				consCount++;
			}
		}
		return consCount;
	}
	
	public static int countAlphabets(String str) {
		int alphaCount = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.toLowerCase().charAt(i) >= 'a' && str.toLowerCase().charAt(i) <= 'z') {
				alphaCount++;
			}
		}
		return alphaCount;
	}
	
	public static int countWords(String str) {
		String s[] = str.split(" ");
//		StringBuilder sb = new StringBuilder();
//		for (String x : s)
//			sb.append(x);
//		return sb.toString();
		return s.length;
	}

}
