package arrays.examples;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		int mat[][]= new int[3][4];
		int rowSum[]= new int[mat.length];
		int colSum[]= new int[mat[0].length];
		Scanner sc = new Scanner(System.in);
		int sum =0;
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				System.out.println("Enter elements ["+i+","+j+"] : ");
				mat[i][j]=sc.nextInt();
				sum+=mat[i][j];
				rowSum[i] += mat[i][j];
				colSum[j] +=mat[i][j];
			}
		}
		
	}
}
