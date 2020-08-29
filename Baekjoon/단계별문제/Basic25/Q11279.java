package Basic25; // 11279��
//�θ� �� �˷��� �ڷᱸ�� �� �ִ� ���̶�� ���� �ִ�. �ִ� ���� �̿��Ͽ� ������ ���� ������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//�迭�� �ڿ��� x�� �ִ´�.
//�迭���� ���� ū ���� ����ϰ�, �� ���� �迭���� �����Ѵ�. 
//���α׷��� ó���� ����ִ� �迭���� �����ϰ� �ȴ�.
//�Է� 
//ù° �ٿ� ������ ���� N(1��N��100,000)�� �־�����. ���� N���� �ٿ��� ���꿡 ���� ������ ��Ÿ���� ���� x�� �־�����. ���� x�� �ڿ������ �迭�� x��� ���� �ִ�(�߰��ϴ�) �����̰�, x�� 0�̶�� �迭���� ���� ū ���� ����ϰ� �� ���� �迭���� �����ϴ� ����̴�. �ԷµǴ� �ڿ����� 2^31���� �۴�.
//��� 
//�Է¿��� 0�� �־��� ȸ����ŭ ���� ����Ѵ�. ���� �迭�� ��� �ִ� ����ε� ���� ū ���� ����϶�� �� ��쿡�� 0�� ����ϸ� �ȴ�.import java.util.Scanner;

import java.util.Scanner;

public class Q11279 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] heap = new int[N+1];
		
		int now = 0;
		
		for(int i=0; i<N; i++) {
			int order = sc.nextInt();
			
			if(order == 0) { //�ִ��� ���� ����
				// ���� ������ ��带 1������ �ű�� �ڽĳ���� ū�Ͱ� �������� �ٲ㰡�� �������� ���
				System.out.println(heap[1]);
				heap[1] = heap[now];
				heap[now--] = 0;
				if(now < 0) now = 0;
				int temp, n = 2;
				while(n<=now && (heap[n/2] < heap[n] || heap[n/2] < heap[n+1])) {
					
					if(heap[n] < heap[n+1]) n++;
					
					temp = heap[n];
					heap[n] = heap[n/2];
					heap[n/2] = temp;
					n *= 2;
				}
			}else { //�ִ��� ���� ����
				//���� ������ ��忡 �����ѵ� �θ���� �������� �ٲ㰡�� �ö󰡴� ���
				int n = ++now;
				while(n !=1 && order > heap[n/2]) {
					heap[n] = heap[n/2];
					n /= 2;
				}
				heap[n] = order;
			}
		
		}	
		sc.close();
	}
}
