package Basic10_Fin; // 4948��
//����Ʈ�� ������ ������ �ڿ��� n�� ���Ͽ�, n���� ũ��, 2n���� �۰ų� ���� �Ҽ��� ��� �ϳ� �����Ѵٴ� ������ ��� �ִ�.
//�� ������ ������ ����Ʈ���� 1845�⿡ �����߰�, ������Ƽ ü������� 1850�⿡ �����ߴ�.
//���� ���, 10���� ũ��, 20���� �۰ų� ���� �Ҽ��� 4���� �ִ�. (11, 13, 17, 19) ��, 14���� ũ��, 28���� �۰ų� ���� �Ҽ��� 3���� �ִ�. (17,19, 23)
//n�� �־����� ��, n���� ũ��, 2n���� �۰ų� ���� �Ҽ��� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�. 

//�Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ִ�. �� ���̽��� n�� �����ϸ�, �� �ٷ� �̷���� �ִ�. (n �� 123456)
//�Է��� ���������� 0�� �־�����.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q4948 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			int N = Integer.parseInt(br.readLine());
			int sum = 0;
			if(N == 0) break;
			
			// N �� 2N ���� �ݺ�
			for(int i=N+1; i<=N*2; i++) {
				boolean NotCount = false; // �Ҽ��� �ƴϸ� true ��ȯ
				
				//�鸸 �ȱ��� i-1���ϸ� �ʹ� �����ɷ��� ��Ʈ�� ���� for���� ������.
				for(int j=2; j<=Math.sqrt(i); j++) {
					if(i%j == 0) {NotCount = true; break;}
				}
			
				// �ƹ��͵� ������������� ������ sum +1
				if( i!=1 && NotCount == false) sum++;
			}
			bw.write(sum + "\n");
		}
		br.close();
		bw.close();
	}
}
