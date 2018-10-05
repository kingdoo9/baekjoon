package Q10000; // 10872번
//0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
//입력 
//첫째 줄에 정수 N(0 ≤ N ≤ 12)가 주어진다.
//출력 
//첫째 줄에 N!을 출력한다.

import java.util.Scanner;

public class Q10872 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] Factorial = new int[13];
		Factorial[0] = 1;

		int N = sc.nextInt();
		
		//Factorial 계산공식
		for(int i=1; i<=N; i++) Factorial[i] = Factorial[i-1] * i;
		
		System.out.println(Factorial[N]);
		
		sc.close();
	}
}

