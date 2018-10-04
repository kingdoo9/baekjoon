package Basic16; // 1463번
//정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다.
//X가 3으로 나누어 떨어지면, 3으로 나눈다.
//X가 2로 나누어 떨어지면, 2로 나눈다.
//1을 뺀다.
//정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다. 연산을 사용하는 횟수의 최솟값을 출력하시오.
//입력 
//첫째 줄에 1보다 크거나 같고, 106보다 작거나 같은 정수 N이 주어진다.
//출력 
//첫째 줄에 연산을 하는 횟수의 최솟값을 출력한다.

import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] dp = new int[N+3]; // N=1일때 런타임에러를 방지하기 위함
		
		dp[0] = 0; dp[1] = 0;
		dp[2] = 1; dp[3] = 1;
		
		//차례대로 올라가면서 더 작게 그 수를 만드는 방법이 있다면 대입함.
		for(int i=2; i<N+1; i++) {
			dp[i] = dp[i-1] +1 ;
			if(i%2==0 && dp[i] > dp[i/2]+1){
				dp[i] = dp[i/2]+1;
			
			}
			if(i%3==0 && dp[i] > dp[i/3]+1) {
				dp[i] = dp[i/3]+1;
			}
			
		}

		System.out.println(dp[N]);
		sc.close();
	}
}