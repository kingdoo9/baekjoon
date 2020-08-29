package Basic16; // 1149번
//RGB거리에 사는 사람들은 집을 빨강, 초록, 파랑중에 하나로 칠하려고 한다. 또한, 그들은 모든 이웃은 같은 색으로 칠할 수 없다는 규칙도 정했다. 집 i의 이웃은 집 i-1과 집 i+1이다. 처음 집과 마지막 집은 이웃이 아니다.
//각 집을 빨강으로 칠할 때 드는 비용, 초록으로 칠할 때 드는 비용, 파랑으로 드는 비용이 주어질 때, 모든 집을 칠할 때 드는 비용의 최솟값을 구하는 프로그램을 작성하시오.
//입력 
//첫째 줄에 집의 수 N이 주어진다. N은 1,000보다 작거나 같다. 둘째 줄부터 N개의 줄에 각 집을 빨강으로 칠할 때, 초록으로 칠할 때, 파랑으로 칠할 때 드는 비용이 주어진다. 비용은 1,000보다 작거나 같은 자연수이다.
//출력 
//첫째 줄에 모든 집을 칠할 때 드는 비용의 최솟값을 출력한다.

import java.io.*;
import java.util.StringTokenizer;
public class Q1149 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int dp[][] = new int[N+1][4];	
		int[][] cost = new int[N+1][4];

		//각 색칠 비용 입력
		for (int i = 1; i < N+1; i++)
		{
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int j = 1; j < 4; j++)
			{
				cost[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		//초기값 설정
		dp[1][1] = cost[1][1];
		dp[1][2] = cost[1][2];
		dp[1][3] = cost[1][3];
		
		//DP 모든 case 탐색
		for (int i = 2; i < N+1; i++)
		{
			dp[i][1] = Integer.min(dp[i-1][2], dp[i-1][3]) + cost[i][1];
			dp[i][2] = Integer.min(dp[i-1][1], dp[i-1][3]) + cost[i][2];
			dp[i][3] = Integer.min(dp[i-1][1], dp[i-1][2]) + cost[i][3];
		}
		
		//출력
		int min = Integer.min(dp[N][1],dp[N][2]);
		min = Integer.min(min, dp[N][3]);
		System.out.print(min);
	}
}