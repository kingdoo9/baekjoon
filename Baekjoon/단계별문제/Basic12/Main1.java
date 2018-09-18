package Basic12; // 10845��
//������ �����ϴ� ť�� ������ ����, �Է����� �־����� ����� ó���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//����� �� ���� �����̴�.
//push X: ���� X�� ť�� �ִ� �����̴�.
//pop: ť���� ���� �տ� �ִ� ������ ����, �� ���� ����Ѵ�. ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
//size: ť�� ����ִ� ������ ������ ����Ѵ�.
//empty: ť�� ��������� 1, �ƴϸ� 0�� ����Ѵ�.
//front: ť�� ���� �տ� �ִ� ������ ����Ѵ�. ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
//back: ť�� ���� �ڿ� �ִ� ������ ����Ѵ�. ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
//�Է� 
//ù° �ٿ� �־����� ����� �� N (1 �� N �� 10,000)�� �־�����. ��° �ٺ��� N���� �ٿ��� ����� �ϳ��� �־�����. �־����� ������ 1���� ũ�ų� ����, 100,000���� �۰ų� ����. ������ �������� ���� ����� �־����� ���� ����.
import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int front=0, back=0;
		int[] queue = new int[10001];
		
		for(int i=0; i<T; i++) {
			String order = sc.next();
			//push �������
			if(order.matches("push")) {
				int N = sc.nextInt();
				queue[back] = N;
				if(back == queue.length) back=-1; //back �� �迭�� ���̶�� 0���� �ǵ���
				back++;
			//pop �������
			}else if(order.matches("pop")) {
				if(back == front)System.out.println("-1");
				else {
					System.out.println(queue[front]);
					queue[front] = 0;
					if(front == queue.length) front = -1; // front �� �迭�� ���̶�� 0���� �ǵ���
					front++;
				}
			//size �������
			}else if(order.matches("size")) {
				System.out.println(back-front);
			//empty �������
			}else if(order.matches("empty")) {
				System.out.println(front==back?"1":"0");
			//front �������
			}else if(order.matches("front")) {
				System.out.println(front==back?"-1":queue[front]);
			//back �������
			}else if(order.matches("back")) {
				System.out.println(front==back?"-1":queue[back-1]);
			}
		}
		sc.close();
	}
}
