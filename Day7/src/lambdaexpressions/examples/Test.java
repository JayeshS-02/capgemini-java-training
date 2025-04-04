package lambdaexpressions.examples;

interface MyNumber{
	double getValue();
}
class Test {
	
	public static void main(String[] args) {
		MyNumber myNum = () -> {
			return 123.45;
		};
		System.out.println("A fixed value: " + myNum.getValue());
		
		myNum = () -> 33.333;
		System.out.println("A fixed value: " + myNum.getValue());
	}
}	
