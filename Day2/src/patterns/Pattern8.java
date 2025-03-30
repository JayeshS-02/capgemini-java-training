package patterns;

public class Pattern8 {
	public static void main(String[] args) {
		int n = 5;
//		for(int i =1;i<=n;i++) {
////			spaces
//			for(int j=1;j<=(n-i);j++) {
//				System.out.print(" ");
//			}
//			
//			for(int j=1;j<=((i*2)-1);j++) {
//				System.out.print((i+j+1)%2);
//			}
//			System.out.println();
//		}
		
		
//		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=(n-i);j++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=2*i-1;j=j+1) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
