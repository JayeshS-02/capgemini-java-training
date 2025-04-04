package lambdaexpressions.Assignment1;

public class Test {
	public static void main(String[] args) {
		MathOperation addition = (a,b) -> {
			return a+b;
		};
		MathOperation subtraction = (a,b) -> {
			return a-b;
		};
		MathOperation multiplication = (a,b) -> {
			return a*b;
		};
		MathOperation division = (a,b) -> {
			return a/b;
		};
		
		System.out.println("Addition : "+addition.operate(10, 21));
		System.out.println("subtraction : "+subtraction.operate(21,12));
		System.out.println("multiplication : "+multiplication.operate(2, 3));
		System.out.println("division : "+division.operate(10, 2));
	}
}
