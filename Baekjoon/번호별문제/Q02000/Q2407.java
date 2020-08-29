package Q02000; // 2407번
//문제 
//nCm을 출력한다.
//입력 
//n과 m이 주어진다. (5 ≤ n ≤ 100, 5 ≤ m ≤ 100, m ≤ n)
//출력 
//nCm을 출력한다.

import java.util.Scanner;

public class Q2407 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String[][] arr = new String[1001][1001];
		int N = sc.nextInt();
		int M = sc.nextInt();
		for(int i=1; i<1001; i++) arr[i][0] = "1"; //초기값 설정
		for(int i=1; i<1001; i++) arr[i][i] = "1";
		
		//배열로 보았을때 조합의 값은 이항계수와 같으므로 이항계수를 출력
		//\  0 1 2 3 4 5 6
		//0| 
		//1| 1 1
		//2| 1 2 1
		//3| 1 3 3 1
		//4| 1 4 6 4 1
		//5| 1 5 10 5 1
		
		for(int i=2; i<N+1; i++) {
			for(int j=1; j<i; j++) {
				arr[i][j] = Plus(arr[i-1][j-1], arr[i-1][j]);
			}
		}
		
		System.out.println(arr[N][M]);
		
		sc.close();
	}
	
	static String Plus(String x, String y) { //String으로 덧셈 계산을 하자!
		char[] X = new char[1001];
		char[] Y = new char[1001];
		String R = "";
		int abs = 0;
		
		for(int i=0; i<1001; i++) {X[i] ='0'; Y[i]='0';}
		
		for(int i=1,j=1000; i<=x.length(); i++, j--) {
			X[j] = x.charAt(x.length()-i);
		}
		for(int i=1,j=1000; i<=y.length(); i++, j--) {
			Y[j] = y.charAt(y.length()-i);			
		}
		
		abs = Math.abs(x.length() - y.length());
		
		for(int i=1,j=1000; i<=x.length()+abs; i++, j--) {
			X[j] = (char) (X[j] + Y[j] - '0');
			if(X[j] > '9') {
				X[j] -= 10;
				X[j-1]++;
			}
		}
		
		for(int i=950; i<=1000; i++) {
			if(X[i] > '0') {
				for(int j=i; j<=1000; j++) {
					R += X[j];
				}
				break;
			}
		}
		return R;
	}
}
