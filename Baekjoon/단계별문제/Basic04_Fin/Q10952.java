package Basic04_Fin; // 10952��
//�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//�Է� 
//�Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ִ�.
//�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
//A�� B�� ��� 0�� ��쿡 ���α׷��� �����Ѵ�.
//��� 
//�� �׽�Ʈ ���̽����� A+B�� ����Ѵ�.

import java.util.Scanner;

public class Q10952 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			int A = sc.nextInt(); // �� ���� �Է�
			int B = sc.nextInt();
			
			if(A==0 && B==0) break;
			
			System.out.println(A+B);
		}
		
		sc.close();
	}
}
