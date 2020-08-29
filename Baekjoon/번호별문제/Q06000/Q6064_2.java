package Q06000; //6064��
//�ֱٿ� ICPC Ž���� ���Ƹ޸�ī�� ��ī ������ ���� ������ ���� ī�� ������ ���� �Ͽ� �������ٴ� ����� �߰��ߴ�. ī�� ������ �鼺���� Ư���� �޷��� ����� ������ �˷��� �ִ�. �׵��� M�� N���� �۰ų� ���� �� ���� �ڿ��� x, y�� ������ �� �⵵�� <x:y>�� ���� �������� ǥ���Ͽ���. �׵��� �� ������ ���ʿ� �ش��ϴ� ù ��° �ظ� <1:1>�� ǥ���ϰ�, �� ��° �ظ� <2:2>�� ǥ���Ͽ���. <x:y>�� ���� �ظ� ǥ���� ���� <x':y'>�̶�� ����. ���� x < M �̸� x' = x + 1�̰�, �׷��� ������ x' = 1�̴�. ���� ������� ���� y < N�̸� y' = y + 1�̰�, �׷��� ������ y' = 1�̴�. <M:N>�� �׵� �޷��� ������ �طμ�, �� �ؿ� ������ ������ �����Ѵٴ� ������ ���� �´�. 
//���� ���, M = 10 �̰� N = 12��� ����. ù ��° �ش� <1:1>�� ǥ���ǰ�, 11��° �ش� <1:11>�� ǥ���ȴ�. <3:1>�� 13��° �ظ� ��Ÿ����, <10:12>�� �������� 60��° �ظ� ��Ÿ����. 
//�� ���� ���� M, N, x�� y�� �־��� ��, <M:N>�� ī�� �޷��� ������ �ض�� �ϸ� <x:y>�� �� ��° �ظ� ��Ÿ������ ���ϴ� ���α׷��� �ۼ��϶�. 

import java.util.Scanner;

public class Q6064_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt(); //�׽�Ʈ���̽� �Է�
		
		for(int i=0; i<T; i++) {
			int M = scan.nextInt();
			int N = scan.nextInt();
			int x = scan.nextInt();
			int y = scan.nextInt();
			int year =x, repeat =0;
			int y1 = x%N;
			boolean NotSuccess = true;
			
			while(repeat != N) { // �������ر��� ����
				if(y1 == 0) y1 =N; // N���� ���������� ��������0�̸� N�� �Է�

				// ���� ���� �߰��� �Է��� x y�� �ִٸ� ��������
				if(y1 == y) {NotSuccess = false; break;}	
				else {
					y1 += M;
					y1 %= N;
					year += M;
				}			
				repeat++;
			}
			// ������ ���� ���п��� üũ
			if(NotSuccess == true /*&& Temporary == false*/) System.out.println("-1");
			else System.out.println(year);
			
		}
		scan.close();	
	}
}
