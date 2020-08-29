package Q06000; // 6591��
//n���� ���� �߿��� k���� ���� ���� �����ϴ� ����� ���� �� ���� �ϱ�?
//�Է� 
//�Է��� �ϳ� �Ǵ� �� �̻��� �׽�Ʈ ���̽��� �̷���� �ִ�.
//�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, 2^31-1 �� ���� �ʴ� �� �ڿ��� n(n �� 1)�� k(0 �� k ��n)�� �̷���� �ִ�.
//�Է��� ������ �ٿ��� 0�� �� �� �־�����.
//��� 
//�� �׽�Ʈ ���̽��� ���ؼ�, ������ ����Ѵ�. �׻� ������ 2^31���� ���� ��츸 �Է����� �־�����.

import java.util.Scanner;

public class Q6591 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			long N = sc.nextInt();
			long M = sc.nextInt();
			long result = 1;
			
			if(N == 0 && M == 0) break;
			
			if( M > N -M) M = N - M;
			for(int i=1; i<=M; i++) {
				result *= N--;
				result /= i;
			}
			
			System.out.println(result);
			
		}
			
		sc.close();
	}

}
