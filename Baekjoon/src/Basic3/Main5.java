package Basic3;
//ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ����
//������, �������� �������� ������ �� (���� ����)�� ����Ͻÿ�.
import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int X, temp;
		X = scan.nextInt();
		temp = X-1;
		
		while(temp>-1) {
			for(int i=temp; i>0; i--) {
				System.out.print(" ");
			}
			for(int i=0; i<X-temp;i++) {
				System.out.print("*");
			}
			System.out.println();
			temp = temp-1;
		}
		scan.close();
	}
}
