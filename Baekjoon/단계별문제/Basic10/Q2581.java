package Basic10; // 2581��
//�ڿ��� M�� N�� �־��� �� M�̻� N������ �ڿ��� �� �Ҽ��� ���� ��� ��� �̵� �Ҽ��� �հ� �ּҰ��� ã�� ���α׷��� �ۼ��Ͻÿ�.
//���� ��� M=60, N=100�� ��� 60�̻� 100������ �ڿ��� �� �Ҽ��� 61, 67, 71, 73, 79, 83, 89, 97 �� 8���� �����Ƿ�, �̵� �Ҽ��� ���� 620�̰�, �ּҰ��� 61�� �ȴ�.

import java.util.Scanner;

public class Q2581 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		int sum=0, min=0;
		
		// N-M��ŭ �ݺ�
		for(int i=M; i<=N; i++) {
			boolean NotCount = false; // �Ҽ��� �ƴϸ� true ��ȯ
			
			for(int j=2; j<=i-1; j++) {
				if(i%j == 0) {NotCount = true; break;}
			}
			// �ּҰ����ϱ�
			if(min ==0 && NotCount == false && i!=1) min = i;
			
			// �ƹ��͵� ������������� ������ Sum �� ����
			if( i!=1 && NotCount == false) sum += i;
		}
		//M�̻� N������ �ڿ��� �� �Ҽ��� ���� ���� ù° �ٿ� -1�� ����Ѵ�.
		if(min == 0){System.out.println("-1");}
		else {
			System.out.println(sum);
			System.out.println(min);
		}
		
		sc.close();
	}
}
