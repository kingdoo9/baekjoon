package Basic15; // 11051��
//�ڿ��� N �� ����K�� �־����� �� ���װ���� 10,007�� ���� �������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�
//ù° �ٿ� N�� K�� �־�����(1<=N<=1,000, 0<=k<=N)
//���װ���� 10,007�� ���� �������� ����Ѵ�.

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[1001][1001];
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		for(int i=1; i<1001; i++) arr[i][0] = 1; //�ʱⰪ ����
		for(int i=1; i<1001; i++) arr[i][i] = 1;
		
		//�迭�� �������� ���װ���� ���� �� ���� ������� �������� ���� �̿�
		//\  0 1 2 3 4 5 6
		//0| 
		//1| 1 1
		//2| 1 2 1
		//3| 1 3 3 1
		//4| 1 4 6 4 1
		//5| 1 5 10 5 1
		
		for(int i=2; i<N+1; i++) {
			for(int j=1; j<i; j++) {
				arr[i][j] = (arr[i-1][j-1] + arr[i-1][j])%10007;
			}
		}
		
		System.out.println(arr[N][M]);
		
		sc.close();
	}
}
