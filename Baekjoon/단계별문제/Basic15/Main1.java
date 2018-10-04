package Basic15; // 11050번
//자연수 N 과 정수K가 주어졌을 때 이항계수 를 구하는 프로그램을 작성하시오
//첫째 줄에 N과 K가 주어진다(1<=N<=10, 0<=k<=N)
//이항계수를 출력한다.

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
		
		// 이항계수 계산공식
		double F = Factorial(N)/(Factorial(K)*(Factorial(N-K)));
		
		System.out.println(Math.round(F));
		
		sc.close();
	}
	
	//팩토리얼 계산 식 (+ 메모이제이션)
	static int Factorial(int n) {
		if(n==0) return 1;
		else if(n<=2) return n;
		else if(Facto[n] != n) return Facto[n];
		else {
			return Facto[n] *= Factorial(n-1);
		}
	}
}
