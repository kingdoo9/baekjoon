package Basic16; // 1149��
//RGB�Ÿ��� ��� ������� ���� ����, �ʷ�, �Ķ��߿� �ϳ��� ĥ�Ϸ��� �Ѵ�. ����, �׵��� ��� �̿��� ���� ������ ĥ�� �� ���ٴ� ��Ģ�� ���ߴ�. �� i�� �̿��� �� i-1�� �� i+1�̴�. ó�� ���� ������ ���� �̿��� �ƴϴ�.
//�� ���� �������� ĥ�� �� ��� ���, �ʷ����� ĥ�� �� ��� ���, �Ķ����� ��� ����� �־��� ��, ��� ���� ĥ�� �� ��� ����� �ּڰ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//�Է� 
//ù° �ٿ� ���� �� N�� �־�����. N�� 1,000���� �۰ų� ����. ��° �ٺ��� N���� �ٿ� �� ���� �������� ĥ�� ��, �ʷ����� ĥ�� ��, �Ķ����� ĥ�� �� ��� ����� �־�����. ����� 1,000���� �۰ų� ���� �ڿ����̴�.
//��� 
//ù° �ٿ� ��� ���� ĥ�� �� ��� ����� �ּڰ��� ����Ѵ�.

import java.io.*;
import java.util.StringTokenizer;
public class Main2 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int dp[][] = new int[N+1][4];	
		int[][] cost = new int[N+1][4];

		//�� ��ĥ ��� �Է�
		for (int i = 1; i < N+1; i++)
		{
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int j = 1; j < 4; j++)
			{
				cost[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		//�ʱⰪ ����
		dp[1][1] = cost[1][1];
		dp[1][2] = cost[1][2];
		dp[1][3] = cost[1][3];
		
		//DP ��� case Ž��
		for (int i = 2; i < N+1; i++)
		{
			dp[i][1] = Integer.min(dp[i-1][2], dp[i-1][3]) + cost[i][1];
			dp[i][2] = Integer.min(dp[i-1][1], dp[i-1][3]) + cost[i][2];
			dp[i][3] = Integer.min(dp[i-1][1], dp[i-1][2]) + cost[i][3];
		}
		
		//���
		int min = Integer.min(dp[N][1],dp[N][2]);
		min = Integer.min(min, dp[N][3]);
		System.out.print(min);
	}
}