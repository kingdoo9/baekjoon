package Basic11; // 10828��
// ������ �����ϴ� ������ ������ ����, �Է����� �־����� ����� ó���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//����� �� �ټ� �����̴�.
//push X: ���� X�� ���ÿ� �ִ� �����̴�.
//pop: ���ÿ��� ���� ���� �ִ� ������ ����, �� ���� ����Ѵ�. ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
//size: ���ÿ� ����ִ� ������ ������ ����Ѵ�.
//empty: ������ ��������� 1, �ƴϸ� 0�� ����Ѵ�.
//top: ������ ���� ���� �ִ� ������ ����Ѵ�. ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
//�Է� 
//ù° �ٿ� �־����� ����� �� N (1 �� N �� 10,000)�� �־�����. ��° �ٺ��� N���� �ٿ��� ����� �ϳ��� �־�����. �־����� ������ 1���� ũ�ų� ����, 100,000���� �۰ų� ����. ������ �������� ���� ����� �־����� ���� ����.

import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int top=0;
		int[] stack = new int[10001];
		
		for(int i=0; i<T; i++) {
			String order = sc.next();
			//push �������
			if(order.matches("push")) {
				int N = sc.nextInt();
				stack[top] = N;
				top++;
			//pop �������
			}else if(order.matches("pop")) {
				if(top ==0)System.out.println("-1");
				else {
					System.out.println(stack[top-1]);
					stack[top-1] = 0;
					top--;
				}
			//size �������
			}else if(order.matches("size")) {
				System.out.println(top);
			//empty �������
			}else if(order.matches("empty")) {
				System.out.println(top==0?"1":"0");
			//top �������
			}else if(order.matches("top")) {
				System.out.println(top==0?"-1":stack[top-1]);
			}
		}
		sc.close();
	}
}
