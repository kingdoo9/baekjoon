package Basic09; //10989��
//N���� ���� �־����� ��, �̸� ������������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main3 {
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
