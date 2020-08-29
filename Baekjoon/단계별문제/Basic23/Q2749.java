package Basic23; // 2749��
//�Ǻ���ġ ���� 0�� 1�� �����Ѵ�. 0��° �Ǻ���ġ ���� 0�̰�, 1��° �Ǻ���ġ ���� 1�̴�. �� ���� 2��° ���ʹ� �ٷ� �� �� �Ǻ���ġ ���� ���� �ȴ�.
//�̸� ������ �Ẹ�� Fn = Fn-1 + Fn-2 (n>=2)�� �ȴ�.
//n=17�϶� ���� �Ǻ���ġ ���� �Ẹ�� ������ ����.
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
//n�� �־����� ��, n��° �Ǻ���ġ ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//�Է� 
//ù° �ٿ� n�� �־�����. n�� 1,000,000,000,000,000,000���� �۰ų� ���� �ڿ����̴�.
//��� 
//ù° �ٿ� n��° �Ǻ���ġ ���� 1,000,000���� ���� �������� ����Ѵ�.

import java.util.Scanner;

public class Q2749 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int Pisano = 1500000; //�ǻ�� �ֱ⸦ ����
		int[] fibo = new int[Pisano];
		fibo[0] =0; fibo[1]= 1;
		
		long N = sc.nextLong();
		
		for(int i=2; i<Pisano; i++) {
			fibo[i] = fibo[i-1] + fibo[i-2];
			fibo[i] %= 1000000;
		}
		
		//�鸸���� ���� �������� ���
		System.out.println(fibo[(int) (N%Pisano)]);
		
		sc.close();
	}
}
