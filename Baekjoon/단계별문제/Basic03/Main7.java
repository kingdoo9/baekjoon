package Basic03; // 2441��
//ù° �ٿ��� �� N��, ��° �ٿ��� �� N-1��, ..., N��° �ٿ��� �� 1���� ��� ����
//������, �������� �������� ������ �� (���� ����)�� ����Ͻÿ�.
import java.util.Scanner;

public class Main7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int X, temp;
		X = scan.nextInt();
		temp = X;
		
		while(temp>0) {
			for(int i=0; i<X-temp;i++) {
				System.out.print(" ");
			}
			for(int i=temp; i>0; i--) {
				System.out.print("*");
			}
			System.out.println();
			temp = temp-1;
		}
		scan.close();
	}
}
