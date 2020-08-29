package Basic10; // 1978번
//주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.


import java.util.Scanner;

public class Q1978 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int Count=0;
		
		// 테스트 케이스만큼 반복
		for(int i=0; i<T; i++) {
			int N = sc.nextInt();
			boolean NotCount = false; // 소수가 아니면 true 반환
			
			for(int j=2; j<=N-1; j++) {
				if(N%j == 0) {NotCount = true; break;}
			}
			// 아무것도 나누어떨어진것이 없으면 Count +1
			if( N!=1 && NotCount == false) Count++;
		}
		
		System.out.println(Count);
		
		sc.close();
	}
}
