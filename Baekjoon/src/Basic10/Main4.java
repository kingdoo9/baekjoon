package Basic10; // 4948번
//베르트랑 공준은 임의의 자연수 n에 대하여, n보다 크고, 2n보다 작거나 같은 소수는 적어도 하나 존재한다는 내용을 담고 있다.
//이 명제는 조제프 베르트랑이 1845년에 추측했고, 파프누티 체비쇼프가 1850년에 증명했다.
//예를 들어, 10보다 크고, 20보다 작거나 같은 소수는 4개가 있다. (11, 13, 17, 19) 또, 14보다 크고, 28보다 작거나 같은 소수는 3개가 있다. (17,19, 23)
//n이 주어졌을 때, n보다 크고, 2n보다 작거나 같은 소수의 개수를 구하는 프로그램을 작성하시오. 

//입력은 여러 개의 테스트 케이스로 이루어져 있다. 각 케이스는 n을 포함하며, 한 줄로 이루어져 있다. (n ≤ 123456)
//입력의 마지막에는 0이 주어진다.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			int N = Integer.parseInt(br.readLine());
			int sum = 0;
			if(N == 0) break;
			
			// N 과 2N 사이 반복
			for(int i=N+1; i<=N*2; i++) {
				boolean NotCount = false; // 소수가 아니면 true 반환
				
				//백만 안까지 i-1을하면 너무 오래걸려서 루트를 씌워 for문을 줄이자.
				for(int j=2; j<=Math.sqrt(i); j++) {
					if(i%j == 0) {NotCount = true; break;}
				}
			
				// 아무것도 나누어떨어진것이 없으면 sum +1
				if( i!=1 && NotCount == false) sum++;
			}
			bw.write(sum + "\n");
		}
		br.close();
		bw.close();
	}
}
