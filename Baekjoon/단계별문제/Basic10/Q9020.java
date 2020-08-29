package Basic10; // 9020번
//1보다 큰 자연수 중에서  1과 자기 자신을 제외한 약수가 없는 자연수를 소수라고 한다. 예를 들어, 5는 1과 5를 제외한 약수가 없기 때문에 소수이다. 하지만, 6은 6 = 2 × 3 이기 때문에 소수가 아니다.
//골드바흐의 추측은 유명한 정수론의 미해결 문제로, 2보다 큰 모든 짝수는 두 소수의 합으로 나타낼 수 있다는 것이다. 이러한 숫자를 골드바흐 숫자라고 한다. 또, 짝수를 두 소수의 합으로 나타내는 표현을 그 숫자의 골드바흐 파티션이라고 한다. 예를 들면, 4 = 2 + 2, 6 = 3 + 3, 8 = 3 + 5, 10 = 5 + 5, 12 = 5 + 7, 14 = 3 + 11, 14 = 7 + 7이다. 10000보다 작거나 같은 모든 짝수 n에 대한 골드바흐 파티션은 존재한다.
//2보다 큰 짝수 n이 주어졌을 때, n의 골드바흐 파티션을 출력하는 프로그램을 작성하시오. 만약 가능한 n의 골드바흐 파티션이 여러가지인 경우에는 두 소수의 차이가 가장 작은 것을 출력한다.
//입력 
//첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고 짝수 n이 주어진다. (4 ≤ n ≤ 10,000)

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q9020 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		int A=0, B=0;
		
		for(int i=0; i<T; i++) {
			int N = Integer.parseInt(br.readLine());
			
			// N의 절반까지만 계산 예를들어 N이 10이면  5 + 5 가 최대이기때문
			for(int j=2; j<=N/2; j++) {
				boolean NotCount = false;
				
				//소수라면 False 아니라면 true 반환
				for(int k=2; k<=Math.sqrt(j); k++) {
					if(j%k ==0) { NotCount = true; break;}
				}
				
				// 소수라면 N-j의 값이 다시 소수인지 체크
				if(NotCount == false) {
					for(int k=2; k<=Math.sqrt(N-j); k++) {
						if((N-j)%k == 0) NotCount = true;
					}
					// j와 N-j 모두 소수라면 A와 B에 삽입
					if(NotCount == false) {	A = j; B = N-A;}
				}
			}
		System.out.println(A +" " + B);
		}
			br.close();
			bw.close();
	}

}

