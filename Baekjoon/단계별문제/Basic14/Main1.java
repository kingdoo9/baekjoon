package Basic14; // 2747��
//�Ǻ���ġ ���� 0�� 1�� �����Ѵ�. 0��° �Ǻ���ġ ���� 0�̰�, 1��° �Ǻ���ġ ���� 1�̴�. �� ���� 2��° ���ʹ� �ٷ� �� �� �Ǻ���ġ ���� ���� �ȴ�.
//�̸� ������ �Ẹ�� Fn = Fn-1 + Fn-2 (n>=2)�� �ȴ�.
//n=17�϶� ���� �Ǻ���ġ ���� �Ẹ�� ������ ����.
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
//n�� �־����� ��, n��° �Ǻ���ġ ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//�Է� 
//ù° �ٿ� n�� �־�����. n�� 45���� �۰ų� ���� �ڿ����̴�.
//��� 
//ù° �ٿ� n��° �Ǻ���ġ ���� ����Ѵ�.

import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int A=0, B=1;
		int C=0;
		
		for(int i=1; i<N; i++) {
			C = A+B;
			A = B;
			B = C;
		}
		if(N == 1) System.out.println(B);
		else System.out.println(C);
		sc.close();
	}
}
