package lambdaexpressions.Assignment2;

public class FactorialTest {
	public static void main(String[] args) {
		Factorial fact = (n) -> {
			long result =1l;
			for(int i=1;i<=n;i++) {
				result*=i;
			}
			return result;
		};
		System.out.println("Factorial : " + fact.compute(5));
	}
}
