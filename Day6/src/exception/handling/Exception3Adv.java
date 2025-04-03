package exception.handling;

public class Exception3Adv {
	
	public static int getCube(int num) throws NoCubeException{
		if(num>100) {
			NoCubeException nce = new NoCubeException("Number greater than 100. No cube");
			throw nce;
		}
		return num*num*num;
	}
	
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		try {
			System.out.println("Cube : "+ getCube(num));
		}
		catch(NumberFormatException nfe) {
			System.out.println("invalid Format");
		}
		catch(ArrayIndexOutOfBoundsException aib) {
			System.out.println("invalid Index");
		}
		catch(NoCubeException b) {
			System.out.println(b.getMessage());
		}
	}
}
