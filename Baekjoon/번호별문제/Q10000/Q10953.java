package Q10000; // 10952��
//�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//�Է� 
//�Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ִ�.
//�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
//A�� B�� ��� 0�� ��쿡 ���α׷��� �����Ѵ�.
//��� 
//�� �׽�Ʈ ���̽����� A+B�� ����Ѵ�.

import java.util.Scanner;

public class Q10953 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<T; i++) {
			String[] N = sc.nextLine().split(",");
			System.out.println(Integer.parseInt(N[0])+Integer.parseInt(N[1]));
		}
		
		sc.close();
	}
}
