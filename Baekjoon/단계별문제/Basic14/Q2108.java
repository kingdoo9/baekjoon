package Basic14; //2108번

//수를 처리하는 것은 통계학에서 상당히 중요한 일이다. 통계학에서 N개의 수를 대표하는 기본 통계값에는 다음과 같은 것들이 있다. 단, N은 홀수라고 가정하자.
//산술평균 : N개의 수들의 합을 N으로 나눈 값
//중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
//최빈값 : N개의 수들 중 가장 많이 나타나는 값
//범위 : N개의 수들 중 최대값과 최소값의 차이
//N개의 수가 주어졌을 때, 네 가지 기본 통계값을 구하는 프로그램을 작성하시오.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2108 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int Count[] = new int[8001];
		
		int mid=0, mid_N=0, mode=0, mode_N=0, mode_Q=0, r_min=0, r_max=0;
		double avr =0;
		
		for(int i=0; i<N; i++) { // 입력된값들의 정렬
				// -4000일경우 0으로 저장
			int j= Integer.parseInt(br.readLine())+4000;
			Count[j]++;
		}
		
		for(int i=0; i<=8000; i++) {
			for(int j=0; j<Count[i]; j++) {
				//중앙값 지정
				mid_N++;
				if(mid_N == (N/2)+1) mid = i-4000;
				
				// 최빈값 지정
				if(Count[i] > mode_N) mode_Q=1;
				if(Count[i] >= mode_N && mode_Q<2) {
					// 두번째로 작은값을 찾기위함
					
					if(Count[i] == mode_N && i != mode+4000) mode_Q++;
					
					mode = i-4000; 
					mode_N = Count[i];

				}
				
				// 산술 평균 지정
				avr += i-4000;
				
				// 범위 지정
				if(mid_N == 1) r_min = i-4000;
				if(mid_N == N) r_max = i-4000;
			}
		}
		
		bw.write(Math.round(avr/N) +"\n"); // 산술평균 반올림 출력
		bw.write(mid + "\n"); // 중앙값 출력
		bw.write(mode + "\n"); // 최빈값 출력
		bw.write((r_max - r_min) +"\n"); // 범위 출력
		
		br.close();
		bw.close();
	}
}
