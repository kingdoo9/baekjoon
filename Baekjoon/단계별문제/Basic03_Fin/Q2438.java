package Basic03_Fin; // 2438번
//첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
import java.util.Scanner;

public class Q2438 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int X;
		X = scan.nextInt();
		
		for(int i=0; i<X; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scan.close();
	}
}
