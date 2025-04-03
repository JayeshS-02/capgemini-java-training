package exception.handling;

public class Exception1 {
	public static void main(String[] args) {
		int num=0;
		try {
			num=Integer.parseInt(args[0]);
		}
		catch(NumberFormatException nfe) {
			System.out.println("Invalid Format");
		}
//		catch(NumberFormatException | ArrayIndexOutOfBoundsException nfe) {
//			System.out.println("Invalid Format");
//		}
		catch(ArrayIndexOutOfBoundsException aib) {
			System.out.println("Invalid Index");
		}
		catch (Exception e) {
			// TODO: handle exception
//			System.out.println();
//			e.getMessage();
			e.printStackTrace();
		}
		System.out.println("Square: "+Math.pow(num, 2));
	}
}
