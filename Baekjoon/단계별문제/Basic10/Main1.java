package Basic10; // 1978��
//�־��� �� N�� �߿��� �Ҽ��� �� ������ ã�Ƽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.


import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int Count=0;
		
		// �׽�Ʈ ���̽���ŭ �ݺ�
		for(int i=0; i<T; i++) {
			int N = sc.nextInt();
			boolean NotCount = false; // �Ҽ��� �ƴϸ� true ��ȯ
			
			for(int j=2; j<=N-1; j++) {
				if(N%j == 0) {NotCount = true; break;}
			}
			// �ƹ��͵� ������������� ������ Count +1
			if( N!=1 && NotCount == false) Count++;
		}
		
		System.out.println(Count);
		
		sc.close();
	}
}
