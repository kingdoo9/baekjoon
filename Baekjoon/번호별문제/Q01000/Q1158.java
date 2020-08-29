package Q01000; // 1158��
//�����۽� ������ ������ ����.
//1������ N������ N���� ����� ���� �̷�鼭 �ɾ��ְ�, ���� ���� M(�� N)�� �־�����. ���� ������� M��° ����� �����Ѵ�. �� ����� ���ŵǸ� ���� ������ �̷���� ���� ���� �� ������ ����� ������. �� ������ N���� ����� ��� ���ŵ� ������ ��ӵȴ�. ������ ������� ���ŵǴ� ������ (N, M)-�����۽� �����̶�� �Ѵ�. ���� ��� (7, 3)-�����۽� ������ <3, 6, 2, 7, 5, 1, 4>�̴�.
//N�� M�� �־����� (N,M)-�����۽� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//�Է� 
//ù° �ٿ� N�� M�� �� ĭ�� ���̿� �ΰ� ������� �־�����. (1 �� M �� N �� 5,000)
//��� 
//������ ���� �����۽� ������ ����Ѵ�.

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Q1158 {
	public static void main(String[] args) {
		                                                
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		Queue<Integer> que = new LinkedList<>();
		int die = 1;
		
		for(int i=1; i<=N; i++)que.add(i); //que�� �ο��� �Է�

		System.out.print("<");
		
		while(true) {
			if(die==M) { //�״¼��� M�� ���� ���ٸ� ���ܽ�Ŵ
				int j = que.poll();
				if(que.isEmpty()) { System.out.print(j); break;}
				else System.out.print(j+", ");
				die = 1; //�״¼��� 1�� �ʱ�ȭ
			}else { //�״¼��� M�� ���� �ʴٸ� que�� ���ٰ� �ٽ� ����.
				int temp = que.poll();
				que.add(temp);
				die++;
			}
		}
		
		System.out.print(">");
		sc.close();
	}
}
