package Basic13; // 10866��
//������ �����ϴ� ��(Deque)�� ������ ����, �Է����� �־����� ����� ó���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//����� �� ���� �����̴�.
//push_front X: ���� X�� ���� �տ� �ִ´�.
//push_back X: ���� X�� ���� �ڿ� �ִ´�.
//pop_front: ���� ���� �տ� �ִ� ���� ����, �� ���� ����Ѵ�. ����, ���� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
//pop_back: ���� ���� �ڿ� �ִ� ���� ����, �� ���� ����Ѵ�. ����, ���� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
//size: ���� ����ִ� ������ ������ ����Ѵ�.
//empty: ���� ��������� 1��, �ƴϸ� 0�� ����Ѵ�.
//front: ���� ���� �տ� �ִ� ������ ����Ѵ�. ���� ���� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
//back: ���� ���� �ڿ� �ִ� ������ ����Ѵ�. ���� ���� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
//�Է� 
//ù° �ٿ� �־����� ����� �� N (1 �� N �� 10,000)�� �־�����. �Ѥ� �ٺ��� N���� �ٿ��� ����� �ϳ��� �־�����. �־����� ������ 1���� ũ�ų� ����, 100,000���� �۰ų� ����. ������ �������� ���� ����� �־����� ���� ����.
//��� 
//����ؾ��ϴ� ����� �־��� ������, �� �ٿ� �ϳ��� ����Ѵ�.

import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] Deque = new int[10001];
		
		int T = sc.nextInt();
		int N, front =0, back=0;
		
		for(int i=0; i<T; i++) {
			String order = sc.next();
			
			//push_front ���� ����
			if(order.matches("push_front")) {
				N = sc.nextInt();
				if(front==0) front = Deque.length; //front�� 0�̸� �迭�� ������
				front--;
				Deque[front] = N;
			
			//push_back ���� ����
			}else if(order.matches("push_back")) {
				N = sc.nextInt();
				Deque[back] = N;
				if(back == Deque.length-1) back = -1; //Maxsize�� ������ �����ϸ� �ٽ� ó������
				back++;

			//pop_front ���� ����
			}else if(order.matches("pop_front")) {
				if(front==back) {System.out.println("-1"); continue;}
				else {
					System.out.println(Deque[front]);
					Deque[front] = 0;
					if(front == Deque.length-1) front = -1; //Maxsize�� ������ �����ϸ� �ٽ� ó������
					front++;
				}
			//pop_back ���� ����
			}else if(order.matches("pop_back")) {
				if(front==back) {System.out.println("-1"); continue;}
				else {
					int k=0;
					if(back == 0) k = Deque.length-1;
					else k = back-1;
					System.out.println(Deque[k]); 
					back= k;
				}
			//size ���� ����
			}else if(order.matches("size")) {
				int size = back-front;
				if(size<0) size+=10001;
				System.out.println(size);
			
			//empty ���� ����
			}else if(order.matches("empty")) {
				System.out.println(front == back? "1": "0");
				
			//front ���� ����
			}else if(order.matches("front")) {
				System.out.println(front == back? "-1": Deque[front]);
				
			//back ���� ����
			}else if(order.matches("back")) {
				int k=0;
				if(back == 0) k = Deque.length-1;
				else k = back-1;
				System.out.println(front==back?"-1":Deque[k]);
			}
		}
		sc.close();
	}
}
