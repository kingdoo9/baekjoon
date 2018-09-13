package Basic6; // 2577��
//�� ���� �ڿ��� A, B, C�� �־��� �� A��B��C�� ����� ����� 0���� 9���� ������ ���ڰ� �� ���� ���������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//���� ��� A = 150, B = 266, C = 427 �̶�� 
//A �� B �� C = 150 �� 266 �� 427 = 17037300 �� �ǰ�, 
//����� ��� 17037300 ���� 0�� 3��, 1�� 1��, 3�� 2��, 7�� 2�� ������.
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();

		int result = A*B*C;
		int score[] = new int[10];
		
		while(result > 0) {
			int temp = result % 10;
			score[temp]++;
			result /= 10;
		}
			
		for(int i = 0; i<10; i++) {
			System.out.println(score[i]);
		}
		scan.close();
	}
}
