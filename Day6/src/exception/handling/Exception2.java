package exception.handling;

public class Exception2 {
/*Write a program that accepts a number as command line argument and display its table. Handle all possible 
exceptions. If the number is greater than 25 it should generate a custom exception.*/
	
	public static void main(String[] args) {
		int num=0;
		try {
			num=Integer.parseInt(args[0]);
			if(num>25) {
				BigException be = new BigException("Number bigger than 25");
				num = 0;
				throw be;
			}
			for(int i=1;i<=10;i++) {
				System.out.println(num+" * "+i+" = "+(num*i));
			}
		}
		catch(NumberFormatException nfe) {
			System.out.println("invalid Format");
		}
		catch(ArrayIndexOutOfBoundsException aib) {
			System.out.println("invalid Index");
		}
		catch(BigException b) {
			System.out.println(b.getMessage());
		}
		
		
	}
}
