package patterns;

public class Pattern7 {
	public static void main(String[] args) {
		int n = 5;
		for(int i=1;i<=n;i++) {
			//spaces
			for(int j=1;j<=(n-i);j++) {
				System.out.print(" ");
			}
			
			for(int j=(n-i+1);j<=5;j++) {
				System.out.print((j+i+1)%2);
			}
			System.out.println();
		}
	}
}
