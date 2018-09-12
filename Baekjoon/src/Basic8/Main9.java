package Basic8;
//최근에 ICPC 탐사대는 남아메리카의 잉카 제국이 놀라운 문명을 지닌 카잉 제국을 토대로 하여 세워졌다는 사실을 발견했다. 카잉 제국의 백성들은 특이한 달력을 사용한 것으로 알려져 있다. 그들은 M과 N보다 작거나 같은 두 개의 자연수 x, y를 가지고 각 년도를 <x:y>와 같은 형식으로 표현하였다. 그들은 이 세상의 시초에 해당하는 첫 번째 해를 <1:1>로 표현하고, 두 번째 해를 <2:2>로 표현하였다. <x:y>의 다음 해를 표현한 것을 <x':y'>이라고 하자. 만일 x < M 이면 x' = x + 1이고, 그렇지 않으면 x' = 1이다. 같은 방식으로 만일 y < N이면 y' = y + 1이고, 그렇지 않으면 y' = 1이다. <M:N>은 그들 달력의 마지막 해로서, 이 해에 세상의 종말이 도래한다는 예언이 전해 온다. 
//예를 들어, M = 10 이고 N = 12라고 하자. 첫 번째 해는 <1:1>로 표현되고, 11번째 해는 <1:11>로 표현된다. <3:1>은 13번째 해를 나타내고, <10:12>는 마지막인 60번째 해를 나타낸다. 
//네 개의 정수 M, N, x와 y가 주어질 때, <M:N>이 카잉 달력의 마지막 해라고 하면 <x:y>는 몇 번째 해를 나타내는지 구하는 프로그램을 작성하라. 

import java.util.Scanner;

public class Main9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt(); //테스트케이스 입력
		
		for(int i=0; i<T; i++) {
			int M = scan.nextInt();
			int N = scan.nextInt();
			int x = scan.nextInt();
			int y = scan.nextInt();
			int year =1;
			int x1 = 1, y1 = 1;
			boolean NotSuccess = true;

			while(M != x1 || N != y1) { // 마지막해까지 루프
				if(x1 < M) x1++;
				else x1 = 1;
				
				if(y1 < N) y1++;
				else y1 = 1;
				
				year++;
				
				// 만약 루프 중간에 입력한 x y가 있다면 루프종료
				if(x1 == x && y1 == y) {NotSuccess = false; break;}
				
			}
			
			// 루프후 성공 실패여부 체크
			if(NotSuccess == true) System.out.println("-1");
			else System.out.println(year);
			
		}

		scan.close();	
	}
} // 시간초과 에러가 나서 시간복잡도를 줄이는 형식으로 9_2 작성
