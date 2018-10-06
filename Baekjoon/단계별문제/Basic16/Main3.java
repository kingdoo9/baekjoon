package Basic16; // 1932��
//�� �׸��� ũ�Ⱑ 5�� ���� �ﰢ���� �� ����̴�.
//�� ���� 7���� �����ؼ� �Ʒ��� �ִ� �� �� �ϳ��� �����Ͽ� �Ʒ������� ������ ��, �������� ���õ� ���� ���� �ִ밡 �Ǵ� ��θ� ���ϴ� ���α׷��� �ۼ��϶�. �Ʒ����� �ִ� ���� ���� ������ ���õ� ���� �밢�� ���� �Ǵ� �밢�� �����ʿ� �ִ� �� �߿����� ������ �� �ִ�.
//�ﰢ���� ũ��� 1 �̻� 500 �����̴�. �ﰢ���� �̷�� �ִ� �� ���� ��� �����̸�, ������ 0 �̻� 9999 �����̴�.
//�Է� 
//ù° �ٿ� �ﰢ���� ũ�� n(1 �� n �� 500)�� �־�����, ��° �ٺ��� n+1��° �ٱ��� ���� �ﰢ���� �־�����.
//��� 
//ù° �ٿ� ���� �ִ밡 �Ǵ� ��ο� �ִ� ���� ���� ����Ѵ�.

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[][] tri = new int[N+1][N+1];
		int[][] dp = new int[N+1][N+1];
		
		int Result=0;
		
		for(int i=1; i<=N; i++) { //���� �Է�
			for(int j=1; j<=i; j++) {
				tri[i][j] = sc.nextInt();
			}
		}

		dp[1][1] = tri[1][1]; //�ʱⰪ ����
		
		for(int i=2; i<=N; i++) { //�ش�ĭ���� �ִ밪���� ��������!
			for(int j=1; j<=i; j++) {
				dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j]) + tri[i][j];
			}
		}
		
		for(int i=1; i<=N; i++) { //�� �Ʒ��� ĭ���� ���� ū���� �̹����� ����
			Result = Math.max(Result,dp[N][i]);
		}
		
		System.out.println(Result);
		sc.close();
	}
}