package Basic01_Fin;

import java.util.Scanner;

public class Q2588 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int i = b;
		while(i != 0) {
			System.out.println(a*(i%10));
			i /= 10;
		}
		System.out.println(a*b);
		
		scan.close();
	}
}
