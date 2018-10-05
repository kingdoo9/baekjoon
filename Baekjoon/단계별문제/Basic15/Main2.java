package Basic15; // 11051번
//자연수 N 과 정수K가 주어졌을 때 이항계수를 10,007로 나눈 나머지를 구하는 프로그램을 작성하시오
//첫째 줄에 N과 K가 주어진다(1<=N<=1,000, 0<=k<=N)
//이항계수를 10,007로 나눈 나머지를 출력한다.

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[1001][1001];
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		for(int i=1; i<1001; i++) arr[i][0] = 1; //초기값 설정
		for(int i=1; i<1001; i++) arr[i][i] = 1;
		
		//배열로 보았을때 이항계수의 값은 전 열의 현재행과 이전행의 합을 이용
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
