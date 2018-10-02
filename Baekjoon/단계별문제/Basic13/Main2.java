package Basic13; // 1021��
//�����̴� N���� ���Ҹ� �����ϰ� �ִ� ����� ��ȯ ť�� ������ �ִ�. �����̴� �� ť���� �� ���� ���Ҹ� �̾Ƴ����� �Ѵ�.
//�����̴� �� ť���� ������ ���� 3���� ������ ������ �� �ִ�.
//ù ��° ���Ҹ� �̾Ƴ���. �� ������ �����ϸ�, ���� ť�� ���Ұ� a1, ..., ak�̾��� ���� a2, ..., ak�� ���� �ȴ�.
//�������� �� ĭ �̵���Ų��. �� ������ �����ϸ�, a1, ..., ak�� a2, ..., ak, a1�� �ȴ�.
//���������� �� ĭ �̵���Ų��. �� ������ �����ϸ�, a1, ..., ak�� ak, a1, ..., ak-1�� �ȴ�.
//ť�� ó���� ���ԵǾ� �ִ� �� N�� �־�����. �׸��� �����̰� �̾Ƴ����� �ϴ� ������ ��ġ�� �־�����. (�� ��ġ�� ���� ó�� ť������ ��ġ�̴�.) �̶�, �� ���Ҹ� �־��� ������� �̾Ƴ��µ� ��� 2��, 3�� ������ �ּڰ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//�Է� 
//ù° �ٿ� ť�� ũ�� N�� �̾Ƴ����� �ϴ� ���� ���� M�� �־�����. N�� 50���� �۰ų� ���� �ڿ����̰�, M�� N���� �۰ų� ���� �ڿ����̴�. ��° �ٿ��� �����̰� �̾Ƴ����� �ϴ� ���� ��ġ�� ������� �־�����. ��ġ�� 1���� ũ�ų� ����, N���� �۰ų� ���� �ڿ����̴�.
//��� 
//ù° �ٿ� ������ ������ ����Ѵ�.

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Deque<Integer> dq = new LinkedList<>();
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int l, r, result = 0; // �� Ž������ ���� Ž������ �����Ͽ� where�� ����
		int j=0 , k=0; //j = ���� ����ؾ��ϴ� ����, k= ��µ� ������ out�� ����
		int[] arr = new int[M];
		int[] out = new int[M];
		
		for(int i=0; i<M; i++) { arr[i] = sc.nextInt(); }
		
		for(int i=1; i<=N; i++) {dq.add(i);}
		
		while(true) {
			// �Ǿ����ڿ� arr�� ù���ڰ� ���ٸ� �̾Ƴ��� deque���� ����
			if(arr[j] == dq.peek()) {
				arr[j] = 0;
				out[k] = dq.pop();
				j++; k++;
			}
			if(arr[M-1] == 0) break; //Ž���̳����� ����
			
			// �������� ª���� ������ ª���� Ž��
			l = dq.peek() - arr[j];
			r = arr[j] - dq.peek();
			
			if(l < 0) { // �̹� pop���� ���� ���ڵ��� ���ܽ�Ŵ
				l += N;
				for(int i=0; out[i] !=0; i++) {
					if(dq.peek() < out[i] && arr[j] > out[i]) r--;
					else l--;
				}
			}
			else{ // �̹� pop���� ���� ���ڵ��� ���ܽ�Ŵ
				r += N;
				for(int i=0; out[i] !=0; i++) {
					if(dq.peek() > out[i] && arr[j] < out[i]) l--;
					else r--;
				}
			}
		
			// �� ���� ������ ���� �ʿ��� ������ �Ǿ����� ����
			if(l>r) {
				for(int i=0; i<r; i++) {
					int temp = dq.pop();
					dq.add(temp);
				}
				result += r;
			}
			else {
				for(int i=0; i<l; i++) {
					int temp = dq.pollLast();
					dq.push(temp);
				}
				result += l;
			}
		}
		
		System.out.println(result);
		
		sc.close();
	}
}
