package Basic15; // 11401번
//자연수 N 과 정수K가 주어졌을 때 이항계수를 1,000,000,007로 나눈 나머지를 구하는 프로그램을 작성하시오
//첫째 줄에 N과 K가 주어진다(1<=N<=4,000,000 0<=k<=N)
//이항계수를 1,000,000,007로 나눈 나머지를 출력한다.

import java.util.Scanner;

public class Main3 {
	static int Max = 4000001;
	static long mod = 1000000007l;
	static long[] Factorial = new long[Max];
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();

		
		//Factorial 설정
		long F = Factorial(N);
		long FK = Factorial(K);
		long NK = Factorial(N-K);

		//페르마의 소정리
		//N!/ (K! * (N-k)!) 의 역원을 구하면
		//{(K! * (N-k)!)^(mod-2)} * N! 의 값이 정답이다.
		FK = square(FK, mod-2);
		NK = square(NK, mod-2);
		
		F = (F * FK)%mod;
		F = (F * NK)%mod;
		
		System.out.println(F);
		
		sc.close();
	}
	
	static long square(long x, long y) {    //분할 정복을 이용하여 x^y 구하기
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
	
	//팩토리얼 계산 식 (+ 메모이제이션)
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
