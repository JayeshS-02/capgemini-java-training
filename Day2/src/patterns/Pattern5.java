package patterns;

public class Pattern5 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
//			spaces
			for(int j=i;j<=(n-1);j++) {
				System.out.print(" ");
			}
			
			for(int j=(n-i+1);j<=n;j=j+1) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
