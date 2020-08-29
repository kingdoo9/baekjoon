package Basic10; // 1929��
//M�̻� N������ �Ҽ��� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//ù° �ٿ� �ڿ��� M�� N�� �� ĭ�� ���̿� �ΰ� �־�����. (1��M��N��1,000,000)

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1929 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] Number = br.readLine().split(" ");
		int M = Integer.parseInt(Number[0]);
		int N = Integer.parseInt(Number[1]);
		
		// N-M��ŭ �ݺ�
		for(int i=M; i<=N; i++) {
			boolean NotCount = false; // �Ҽ��� �ƴϸ� true ��ȯ
			
			//�鸸 �ȱ��� i-1���ϸ� �ʹ� �����ɷ��� ��Ʈ�� ���� for���� ������.
			for(int j=2; j<=Math.sqrt(i); j++) {
				if(i%j == 0) {NotCount = true; break;}
			}
		
			// �ƹ��͵� ������������� ������ print
			if( i!=1 && NotCount == false) bw.write(i + "\n");
		}
		
		br.close();
		bw.close();
	}
}
