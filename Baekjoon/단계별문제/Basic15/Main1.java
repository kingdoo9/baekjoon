package Basic15; // 11050��
//�ڿ��� N �� ����K�� �־����� �� ���װ�� �� ���ϴ� ���α׷��� �ۼ��Ͻÿ�
//ù° �ٿ� N�� K�� �־�����(1<=N<=10, 0<=k<=N)
//���װ���� ����Ѵ�.

import java.util.Scanner;

public class Main1 {
	static int[] Facto = new int[1001];
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		for(int i=1; i<1001; i++) {
			Facto[i] = i;
		}
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		// ���װ�� ������
		double F = Factorial(N)/(Factorial(K)*(Factorial(N-K)));
		
		System.out.println(Math.round(F));
		
		sc.close();
	}
	
	//���丮�� ��� �� (+ �޸������̼�)
	static int Factorial(int n) {
		if(n==0) return 1;
		else if(n<=2) return n;
		else if(Facto[n] != n) return Facto[n];
		else {
			return Facto[n] *= Factorial(n-1);
		}
	}
}
