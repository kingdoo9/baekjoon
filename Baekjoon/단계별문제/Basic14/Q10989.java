package Basic14; //10989번
//N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10989 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int Count[] = new int[10001];
		
		for(int i=0; i<N; i++) {
			int j= Integer.parseInt(br.readLine());
			Count[j]++;
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i=1; i<=10000; i++) {
			for(int j=0; j<Count[i]; j++) {
				bw.write(Integer.toString(i) + "\n");
			}
		}
		br.close();
		bw.close();
	}
}
