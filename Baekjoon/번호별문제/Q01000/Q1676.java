package Q01000; // 1676��
//N!���� �ڿ������� ó�� 0�� �ƴ� ���ڰ� ���� ������ 0�� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//�Է� 
//ù° �ٿ� N�� �־�����. (0 �� N �� 500)
//��� 
//ù° �ٿ� ���� 0�� ������ ����Ѵ�.

import java.util.Scanner;

public class Q1676 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		//���丮�� 0�� ������ 5�� ��������Ŀ����� ������ ������. 25�� 5�� �ŵ��������� �ѹ��� �����ش�.
		N = (N/5) + (N/25)+ (N/125);
		
		System.out.println(N);
		
		sc.close();
	}
}

