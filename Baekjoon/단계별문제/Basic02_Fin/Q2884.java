package Basic02_Fin;

import java.util.Scanner;

public class Q2884 {
	public static void main(String[] args) {
		int A, B;
		Scanner S = new Scanner(System.in);
		A = S.nextInt()+23;
		B = S.nextInt()+15;
		if(B>=60) {
			A++;
			B=B-60;
		}
		A=A%24;
		System.out.print(A);
		System.out.print(" ");
		System.out.print(B);
		S.close();
	}
}
