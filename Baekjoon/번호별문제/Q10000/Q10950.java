package Q10000; // 10950��
//�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//�Է� 
//ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����.
//�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
//��� 
//�� �׽�Ʈ ���̽����� A+B�� ����Ѵ�.

import java.util.Scanner;

public class Q10950 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++) {
			int A = sc.nextInt(); // �� ���� �Է�
			int B = sc.nextInt();
			
			System.out.println(A+B);
		}
		
		sc.close();
	}
}
