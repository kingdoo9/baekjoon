package Q10000; // 10872��
//0���� ũ�ų� ���� ���� N�� �־�����. �̶�, N!�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//�Է� 
//ù° �ٿ� ���� N(0 �� N �� 12)�� �־�����.
//��� 
//ù° �ٿ� N!�� ����Ѵ�.

import java.util.Scanner;

public class Q10872 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] Factorial = new int[13];
		Factorial[0] = 1;

		int N = sc.nextInt();
		
		//Factorial ������
		for(int i=1; i<=N; i++) Factorial[i] = Factorial[i-1] * i;
		
		System.out.println(Factorial[N]);
		
		sc.close();
	}
}

