package Basic10; // 2581번
//자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최소값을 찾는 프로그램을 작성하시오.
//예를 들어 M=60, N=100인 경우 60이상 100이하의 자연수 중 소수는 61, 67, 71, 73, 79, 83, 89, 97 총 8개가 있으므로, 이들 소수의 합은 620이고, 최소값은 61이 된다.

import java.util.Scanner;

public class Q2581 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		int sum=0, min=0;
		
		// N-M만큼 반복
		for(int i=M; i<=N; i++) {
			boolean NotCount = false; // 소수가 아니면 true 반환
			
			for(int j=2; j<=i-1; j++) {
				if(i%j == 0) {NotCount = true; break;}
			}
			// 최소값구하기
			if(min ==0 && NotCount == false && i!=1) min = i;
			
			// 아무것도 나누어떨어진것이 없으면 Sum 에 저장
			if( i!=1 && NotCount == false) sum += i;
		}
		//M이상 N이하의 자연수 중 소수가 없을 경우는 첫째 줄에 -1을 출력한다.
		if(min == 0){System.out.println("-1");}
		else {
			System.out.println(sum);
			System.out.println(min);
		}
		
		sc.close();
	}
}
