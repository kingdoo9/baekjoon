package Basic15; // 11401��
//�ڿ��� N �� ����K�� �־����� �� ���װ���� 1,000,000,007�� ���� �������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�
//ù° �ٿ� N�� K�� �־�����(1<=N<=4,000,000 0<=k<=N)
//���װ���� 1,000,000,007�� ���� �������� ����Ѵ�.

import java.util.Scanner;

public class Main3 {
	static int Max = 4000001;
	static long mod = 1000000007l;
	static long[] Factorial = new long[Max];
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();

		
		//Factorial ����
		long F = Factorial(N);
		long FK = Factorial(K);
		long NK = Factorial(N-K);

		//�丣���� ������
		//N!/ (K! * (N-k)!) �� ������ ���ϸ�
		//{(K! * (N-k)!)^(mod-2)} * N! �� ���� �����̴�.
		FK = square(FK, mod-2);
		NK = square(NK, mod-2);
		
		F = (F * FK)%mod;
		F = (F * NK)%mod;
		
		System.out.println(F);
		
		sc.close();
	}
	
	static long square(long x, long y) {    //���� ������ �̿��Ͽ� x^y ���ϱ�
	    long A = 1;
	    while (y > 0) {
	        if (y % 2 == 1) {
	            A *= x;
	            A %= mod;
	        }
	        x *= x;
	        x %= mod;
	        y /= 2;
	    }
	    return A;
	}
	
	//���丮�� ��� �� (+ �޸������̼�)
	static long Factorial(int n) {
		Factorial[1] = 1;
		if(n==0) return 1;
		else if(n<=2) return n;
		else {
			for(int i=2; i<=n; i++) {
				 Factorial[i] = (Factorial[i-1] * i)%mod;
			}
			return Factorial[n];
		}
	}
}
