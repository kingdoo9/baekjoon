package Basic9; //2108��

//���� ó���ϴ� ���� ����п��� ����� �߿��� ���̴�. ����п��� N���� ���� ��ǥ�ϴ� �⺻ ��谪���� ������ ���� �͵��� �ִ�. ��, N�� Ȧ����� ��������.
//������ : N���� ������ ���� N���� ���� ��
//�߾Ӱ� : N���� ������ �����ϴ� ������ �������� ��� �� �߾ӿ� ��ġ�ϴ� ��
//�ֺ� : N���� ���� �� ���� ���� ��Ÿ���� ��
//���� : N���� ���� �� �ִ밪�� �ּҰ��� ����
//N���� ���� �־����� ��, �� ���� �⺻ ��谪�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main4 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int Count[] = new int[8001];
		
		int mid=0, mid_N=0, mode=0, mode_N=0, mode_Q=0, r_min=0, r_max=0;
		double avr =0;
		
		for(int i=0; i<N; i++) { // �ԷµȰ����� ����
				// -4000�ϰ�� 0���� ����
			int j= Integer.parseInt(br.readLine())+4000;
			Count[j]++;
		}
		
		for(int i=0; i<=8000; i++) {
			for(int j=0; j<Count[i]; j++) {
				//�߾Ӱ� ����
				mid_N++;
				if(mid_N == (N/2)+1) mid = i-4000;
				
				// �ֺ� ����
				if(Count[i] > mode_N) mode_Q=1;
				if(Count[i] >= mode_N && mode_Q<2) {
					// �ι�°�� �������� ã������
					
					if(Count[i] == mode_N && i != mode+4000) mode_Q++;
					
					mode = i-4000; 
					mode_N = Count[i];

				}
				
				// ��� ��� ����
				avr += i-4000;
				
				// ���� ����
				if(mid_N == 1) r_min = i-4000;
				if(mid_N == N) r_max = i-4000;
			}
		}
		
		bw.write(Math.round(avr/N) +"\n"); // ������ �ݿø� ���
		bw.write(mid + "\n"); // �߾Ӱ� ���
		bw.write(mode + "\n"); // �ֺ� ���
		bw.write((r_max - r_min) +"\n"); // ���� ���
		
		br.close();
		bw.close();
	}
}
