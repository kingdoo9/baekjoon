package Basic16; // 1932번
//위 그림은 크기가 5인 정수 삼각형의 한 모습이다.
//맨 위층 7부터 시작해서 아래에 있는 수 중 하나를 선택하여 아래층으로 내려올 때, 이제까지 선택된 수의 합이 최대가 되는 경로를 구하는 프로그램을 작성하라. 아래층에 있는 수는 현재 층에서 선택된 수의 대각선 왼쪽 또는 대각선 오른쪽에 있는 것 중에서만 선택할 수 있다.
//삼각형의 크기는 1 이상 500 이하이다. 삼각형을 이루고 있는 각 수는 모두 정수이며, 범위는 0 이상 9999 이하이다.
//입력 
//첫째 줄에 삼각형의 크기 n(1 ≤ n ≤ 500)이 주어지고, 둘째 줄부터 n+1번째 줄까지 정수 삼각형이 주어진다.
//출력 
//첫째 줄에 합이 최대가 되는 경로에 있는 수의 합을 출력한다.

import java.util.Scanner;

public class Q1932 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[][] tri = new int[N+1][N+1];
		int[][] dp = new int[N+1][N+1];
		
		int Result=0;
		
		for(int i=1; i<=N; i++) { //값들 입력
			for(int j=1; j<=i; j++) {
				tri[i][j] = sc.nextInt();
			}
		}

		dp[1][1] = tri[1][1]; //초기값 설정
		
		for(int i=2; i<=N; i++) { //해당칸까지 최대값으로 도달하자!
			for(int j=1; j<=i; j++) {
				dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j]) + tri[i][j];
			}
		}
		
		for(int i=1; i<=N; i++) { //맨 아래쪽 칸들중 가장 큰값이 이문제의 정답
			Result = Math.max(Result,dp[N][i]);
		}
		
		System.out.println(Result);
		sc.close();
	}
}