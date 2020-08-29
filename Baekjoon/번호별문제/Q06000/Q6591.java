package Q06000; // 6591번
//n개의 원소 중에서 k개를 순서 없이 선택하는 방법의 수는 몇 가지 일까?
//입력 
//입력은 하나 또는 그 이상의 테스트 케이스로 이루어져 있다.
//각 테스트 케이스는 한 줄로 이루어져 있으며, 2^31-1 을 넘지 않는 두 자연수 n(n ≥ 1)과 k(0 ≤ k ≤n)로 이루어져 있다.
//입력의 마지막 줄에는 0이 두 개 주어진다.
//출력 
//각 테스트 케이스에 대해서, 정답을 출력한다. 항상 정답이 2^31보다 작은 경우만 입력으로 주어진다.

import java.util.Scanner;

public class Q6591 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			long N = sc.nextInt();
			long M = sc.nextInt();
			long result = 1;
			
			if(N == 0 && M == 0) break;
			
			if( M > N -M) M = N - M;
			for(int i=1; i<=M; i++) {
				result *= N--;
				result /= i;
			}
			
			System.out.println(result);
			
		}
			
		sc.close();
	}

}
