package Basic10; // 1929번
//M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.
//첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. (1≤M≤N≤1,000,000)

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] Number = br.readLine().split(" ");
		int M = Integer.parseInt(Number[0]);
		int N = Integer.parseInt(Number[1]);
		
		// N-M만큼 반복
		for(int i=M; i<=N; i++) {
			boolean NotCount = false; // 소수가 아니면 true 반환
			
			//백만 안까지 i-1을하면 너무 오래걸려서 루트를 씌워 for문을 줄이자.
			for(int j=2; j<=Math.sqrt(i); j++) {
				if(i%j == 0) {NotCount = true; break;}
			}
		
			// 아무것도 나누어떨어진것이 없으면 print
			if( i!=1 && NotCount == false) bw.write(i + "\n");
		}
		
		br.close();
		bw.close();
	}
}
