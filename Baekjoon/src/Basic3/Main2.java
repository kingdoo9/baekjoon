package Basic3; // 2742��
//�ڿ��� N�� �־����� ��, N���� 1���� �� �ٿ� �ϳ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int X;
		X = scan.nextInt();
		
		for(int i=X; i>0; i--) {
			System.out.println(i);
		}
		scan.close();
	}
}
