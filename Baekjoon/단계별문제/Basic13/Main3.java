package Basic13; // 5430��
//�����̴� �ָ��� �� ���� ��� ���ο� ��� AC�� �������. AC�� ���� �迭�� ������ �ϱ� ���� ���� ����̴�. �� ���� �� ���� �Լ� R(������)�� D(������)�� �ִ�.
//�Լ� R�� �迭�� �ִ� ������ ������ ������ �Լ��̰�, D�� ù ��° ���ڸ� ������ �Լ��̴�. �迭�� ����ִµ� D�� ����� ��쿡�� ������ �߻��Ѵ�.
//�Լ��� �����ؼ� �� ���� ����� �� �ִ�. ���� ���, "AB"�� A�� ������ ������ �ٷ� �̾ B�� �����ϴ� �Լ��̴�. ���� ���, "RDD"�� �迭�� ������ ���� ó�� �� ���ڸ� ������ �Լ��̴�.
//�迭�� �ʱⰪ�� ������ �Լ��� �־����� ��, ���� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//�Է� 
//ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����. T�� �ִ� 100�̴�.
//�� �׽�Ʈ ���̽��� ù° �ٿ��� ������ �Լ� p�� �־�����. p�� ���̴� 1���� ũ�ų� ����, 100,000���� �۰ų� ����.
//���� �ٿ��� �迭�� ����ִ� ���� ���� n�� �־�����. (0 �� n �� 100,000)
//���� �ٿ��� [x1,...,xn]�� ���� ���·� �迭�� ����ִ� ���� �־�����. (1 �� xi �� 100)
//��ü �׽�Ʈ ���̽��� �־����� p�� ������ �հ� n�� ���� 70���� ���� �ʴ´�.
//��� 
//�� �׽�Ʈ ���̽��� ���ؼ�, �Է����� �־��� ���� �迭�� �Լ��� ������ ����� ����Ѵ�. ����, ������ �߻��� ��쿡�� error�� ����Ѵ�.

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Deque<Integer> arr = new LinkedList<>(); // �迭 ���� Deque
		Queue<Character> order = new LinkedList<>(); // ��ɾ����� Queue
		String st = new String(); //��ɾ �ްų� �迭�� �޴� ��Ʈ��
		int T = sc.nextInt(); // Testcase ����
		sc.nextLine();
		
		for(int i=0; i<T; i++) { // ����� ���۸� ����
			boolean fail = false; //���� üũ �Լ�
			boolean Reverse = false;
			
			st = sc.nextLine(); // ��ɾ� �Է�
			
			//Queue�� ����� ��ɾ ����
			for(int j=0; j<st.length(); j++)order.add(st.charAt(j));
			
			int N = sc.nextInt(); //�迭 �� �Է�
			sc.nextLine(); //���� ����
			
			st = sc.nextLine(); //�迭�Է�
			st = st.substring(1, st.length()-1);
			String[] st1 = st.split(",");
			
			//�迭�� Deque�� ������
			for(int j=0; j<N; j++) {
				arr.addLast(Integer.parseInt(st1[j]));
			}
			
			// ��ɾ� ������
			while(!order.isEmpty()) {
				if(order.peek() == 'R') { //���迭 ������ �ٽ� arr1�� �ű�
					if(Reverse) Reverse = false;
					else Reverse = true;
					order.poll();
				}else if(order.peek() == 'D') {
					if(!arr.isEmpty()) {
						if(Reverse) arr.pollLast();
						else arr.pollFirst();
					}
					else fail = true;
					order.poll();
				}
			}
			
			//���
			if(fail) System.out.println("error");
			else {
				System.out.print("[");
				while(!arr.isEmpty()) {
					if(Reverse) {
						if(arr.size()==1) System.out.print(arr.pollLast());
						else System.out.print(arr.pollLast()+",");
					}else {
						if(arr.size()==1) System.out.print(arr.pollFirst());
						else System.out.print(arr.pollFirst()+",");
					}
				}
				System.out.println("]");
			}
			
		}
		sc.close();
	}
}
