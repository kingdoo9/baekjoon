package Basic10; // 9020��
//1���� ū �ڿ��� �߿���  1�� �ڱ� �ڽ��� ������ ����� ���� �ڿ����� �Ҽ���� �Ѵ�. ���� ���, 5�� 1�� 5�� ������ ����� ���� ������ �Ҽ��̴�. ������, 6�� 6 = 2 �� 3 �̱� ������ �Ҽ��� �ƴϴ�.
//�������� ������ ������ �������� ���ذ� ������, 2���� ū ��� ¦���� �� �Ҽ��� ������ ��Ÿ�� �� �ִٴ� ���̴�. �̷��� ���ڸ� ������ ���ڶ�� �Ѵ�. ��, ¦���� �� �Ҽ��� ������ ��Ÿ���� ǥ���� �� ������ ������ ��Ƽ���̶�� �Ѵ�. ���� ���, 4 = 2 + 2, 6 = 3 + 3, 8 = 3 + 5, 10 = 5 + 5, 12 = 5 + 7, 14 = 3 + 11, 14 = 7 + 7�̴�. 10000���� �۰ų� ���� ��� ¦�� n�� ���� ������ ��Ƽ���� �����Ѵ�.
//2���� ū ¦�� n�� �־����� ��, n�� ������ ��Ƽ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ���� ������ n�� ������ ��Ƽ���� ���������� ��쿡�� �� �Ҽ��� ���̰� ���� ���� ���� ����Ѵ�.
//�Է� 
//ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����. �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ְ� ¦�� n�� �־�����. (4 �� n �� 10,000)

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
			
			// N�� ���ݱ����� ��� ������� N�� 10�̸�  5 + 5 �� �ִ��̱⶧��
			for(int j=2; j<=N/2; j++) {
				boolean NotCount = false;
				
				//�Ҽ���� False �ƴ϶�� true ��ȯ
				for(int k=2; k<=Math.sqrt(j); k++) {
					if(j%k ==0) { NotCount = true; break;}
				}
				
				// �Ҽ���� N-j�� ���� �ٽ� �Ҽ����� üũ
				if(NotCount == false) {
					for(int k=2; k<=Math.sqrt(N-j); k++) {
						if((N-j)%k == 0) NotCount = true;
					}
					// j�� N-j ��� �Ҽ���� A�� B�� ����
					if(NotCount == false) {	A = j; B = N-A;}
				}
			}
		System.out.println(A +" " + B);
		}
			br.close();
			bw.close();
	}

}

