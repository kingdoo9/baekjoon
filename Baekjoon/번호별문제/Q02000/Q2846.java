package Q02000; // 2846번
//상근이는 자전거를 타고 등교한다. 자전거 길은 오르막길, 내리막길, 평지로 이루어져 있다. 상근이는 개강 첫 날 자전거를 타고 가면서 일정 거리마다 높이를 측정했다. 상근이는 가장 큰 오르막길의 크기를 구하려고 한다.
//측정한 높이는 길이가 N인 수열로 나타낼 수 있다. 여기서 오르막길은 적어도 2개의 수로 이루어진 높이가 증가하는 부분 수열이다. 오르막길의 크기는 부분 수열의 첫 번째 숫자와 마지막 숫자의 차이이다.
//예를 들어, 높이가 다음과 같은 길이 있다고 하자. 12 3 5 7 10 6 1 11. 이 길에는 2 개의 오르막길이 있다. 밑 줄로 표시된 부분 수열이 오르막길이다. 첫 번째 오르막길의 크기는 7이고, 두 번째 오르막길의 크기는 10이다. 높이가 12와 6인 곳은 오르막길에 속하지 않는다.
//가장 큰 오르막길을 구하는 프로그램을 작성하시오.
//입력 
//첫째 줄에 상근이가 측정한 높이의 수이자 수열의 크기인 N(1 ≤ N ≤ 1000)이 주어진다. 둘째 줄에는 N개의 양의 정수 Pi(1 ≤ Pi ≤ 1000)가 주어진다. 각 숫자는 상근이가 측정한 높이이다.
//출력 
//첫째 줄에 가장 큰 오르막길의 크기를 출력한다. 만약 오르막길이 없는 경우에는 0을 출력한다.

import java.util.Scanner;

public class Q2846 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] road = new int[N+1];
		int Big_hill = 0;

		
		//수 입력
		for(int i=1; i<=N; i++) road[i] = sc.nextInt();
		
		int start = road[1];
		
		//오르막길을 재는 반복문
		for(int i=2; i<=N; i++) {
			if(road[i-1]<road[i]) {
				Big_hill = Math.max(Big_hill, road[i]-start);
			}
			else {start = road[i];}
		}
		
		System.out.println(Big_hill);
		sc.close();
	}
}
