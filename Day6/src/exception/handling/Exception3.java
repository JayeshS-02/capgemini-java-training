package exception.handling;

public class Exception3 {
	
	public static double returnCube(int num) {
		return Math.pow(num, 3);
	}
	public static void main(String[] args) {
		int num=0;
		try{
			num=Integer.parseInt(args[0]);
			if(num>100) {
				BigException be = new BigException("NoCubeException");
				num=0;
				throw be;
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
		
		System.out.println("Cube: "+ returnCube(num));
    }
}
