package Basic04_Fin; // 10951��
//�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//�Է� 
//�Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ִ�.
//�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
//��� 
//�� �׽�Ʈ ���̽����� A+B�� ����Ѵ�.

import java.util.Scanner;

public class Q10951 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()) {
			int A = sc.nextInt(); // �� ���� �Է�
			int B = sc.nextInt();
			
			System.out.println(A+B);
		}
		
		sc.close();
	}
}
