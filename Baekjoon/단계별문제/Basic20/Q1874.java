package Basic20; // 1874��
//���� (stack)�� �⺻���� �ڷᱸ�� �� �ϳ���, ��ǻ�� ���α׷��� �ۼ��� �� ���� �̿�Ǵ� �����̴�. ������ �ڷḦ �ִ� (push) �Ա��� �ڷḦ �̴� (pop) �Ա��� ���� ���� ���� �� �ڷᰡ ���� ���߿� ������ (FILO, first in last out) Ư���� ������ �ִ�.
//1���� n������ ���� ���ÿ� �־��ٰ� �̾� �þ�������ν�, �ϳ��� ������ ���� �� �ִ�. �̶�, ���ÿ� push�ϴ� ������ �ݵ�� ���������� ��Ű���� �Ѵٰ� ����. ������ ������ �־����� �� ������ �̿��� �� ������ ���� �� �ִ��� ������, �ִٸ� � ������ push�� pop ������ �����ؾ� �ϴ����� �˾Ƴ� �� �ִ�. �̸� ����ϴ� ���α׷��� �ۼ��϶�.
//�Է� 
//ù �ٿ� n (1 �� n �� 100,000)�� �־�����. ��° �ٺ��� n���� �ٿ��� ������ �̷�� 1�̻� n������ ������ �ϳ��� ������� �־�����. ���� ���� ������ �� �� ������ ���� ����.

import java.util.Scanner;
import java.util.Stack;

public class Q1874 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] Num = new int[T+1]; // �Է� ������ �޴� �迭
		Stack<Integer> st = new Stack<>(); // stack ����
		String[]Answer = new String[T*2]; // ������ + -����� �����ϴ� �迭
		
		for(int i=1; i<T+1; i++) { // �Է������� ���� ����
			Num[i] = sc.nextInt();
		}
		
		int j=1; //stack�� ���ʷ� push�ϴ� ����
		int k=0; //��� �迭�� ���� (1���� ���� + - �ΰ��� �ʿ��ϹǷ� T���� *2�� ���ȴ�)
		
		for(int i=1; i<T+1; i++) {
			for(; j<=Num[i]; j++) { // �Է� ������ ���������� ��� push����
				Answer[k] ="+"; // ��¹迭�� +����
				k++;
				st.push(j);
			}
			if(st.peek() == Num[i]) { // �Է� ������ ���ٸ� POP���� ����
				Answer[k] ="-"; // ��¹迭�� -����
				k++;
				st.pop();
			}
		}
		
		if(st.empty()==true) { // ������ ���� �����ٸ� => ������ ������ٸ� �迭���
			for(int i=0; i<k; i++) System.out.println(Answer[i]);
		}else {
			System.out.println("NO");
		}
		sc.close();
	}
}
