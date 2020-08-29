package Basic21; // 1966��
//�����е� �˴ٽ��� �������� ������ ���� �������� �μ��ϰ��� �ϴ� ������ �μ� ����� ���� ��������Ρ�, �� ���� ��û�� ���� ���� �μ��Ѵ�. ���� ���� ������ ���δٸ� Queue �ڷᱸ���� �׿��� FIFO - First In First Out - �� ���� �μⰡ �ǰ� �ȴ�. ������ ����̴� ���ο� �����ͱ� ���� ����Ʈ��� �����Ͽ��µ�, �� �����ͱ�� ������ ���� ���ǿ� ���� �μ⸦ �ϰ� �ȴ�.
//���� Queue�� ���� �տ� �ִ� ������ ���߿䵵���� Ȯ���Ѵ�.
//������ ������ �� ���� �������� �߿䵵�� ���� ������ �ϳ��� �ִٸ�, �� ������ �μ����� �ʰ� Queue�� ���� �ڿ� ���ġ �Ѵ�. �׷��� �ʴٸ� �ٷ� �μ⸦ �Ѵ�.
//���� ��� Queue�� 4���� ����(A B C D)�� �ְ�, �߿䵵�� 2 1 4 3 ��� C�� �μ��ϰ�, �������� D�� �μ��ϰ� A, B�� �μ��ϰ� �ȴ�.
//�������� �� ����, ���� Queue�� �ִ� ������ ���� �߿䵵�� �־����� ��, � �� ������ �� ��°�� �μ�Ǵ��� �˾Ƴ��� ���̴�. ���� ��� ���� ������ C������ 1��°��, A������ 3��°�� �μ�ǰ� �ȴ�.
//�Է� 
//ù �ٿ� test case�� ���� �־�����. �� test case�� ���ؼ� ������ �� N(100����)�� �� ��°�� �μ�Ǿ����� �ñ��� ������ ���� Queue�� � ��ġ�� �ִ����� �˷��ִ� M(0�̻� N�̸�)�� �־�����. �����ٿ� N�� ������ �߿䵵�� �־����µ�, �߿䵵�� ������ ������ int������ �־�����. �߿䵵�� ���� ������ ���� �� ���� ���� �ִ�. ���� ���� N=4, M=0(A������ �ñ��ϴٸ�), �߿䵵�� 2 1 4 3�� �ȴ�.import java.util.Scanner;
//�� test case�� ���� ������ �� ��°�� �μ�Ǵ��� ����Ѵ�.

import java.util.Scanner;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Q1966 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			Queue<Integer> que = new LinkedList<>();
			int[] Bigger = new int[N]; // �߿䵵�� ������ �迭
					
			int temp = M; // M�� ���� ��ġ�� Que���� ��� ����ٴϴ� ��������
			int temp1 = N-1; // ������ ���� �������ִ� ���� ���� (��, 0 �� 1��������)
			int ans = 1;
			
			for(int j=0; j<N; j++) { // �߿䵵 �Է�
				int k = sc.nextInt();
				que.add(k);
				Bigger[j] = k;
			}
			
			Arrays.sort(Bigger); // �߿䵵 ����
			
			while(!que.isEmpty()) { 

				if(Bigger[temp1] == que.peek()) { //�߿䵵�� �����Ͱ� QUE�� peek�� ���ٸ� 
					if(temp == 0) break; // �׸��� M���� ������ ��ġ�� �´ٸ� break
					ans++; //�ƴ϶�� �μ���� ������ �ø���
					que.poll(); // que���� �߿䵵�� ���� �������� ����
					temp--; //M���� ��ĭ ������ �ø���
					temp1--; //�״������� �߿��� ���� ã�´�
				}else {
					int k = que.poll(); //�߿䵵�� �������� que�� �տ��ö����� ��ȯ
					que.add(k);
					if(temp == 0) temp = que.size()-1;
					else temp--;
					
				}
			}
			
			System.out.println(ans);	
		}
		sc.close();
	}
}
