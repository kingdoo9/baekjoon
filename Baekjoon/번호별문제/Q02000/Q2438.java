package Q02000; //2438��
//ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ����
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
