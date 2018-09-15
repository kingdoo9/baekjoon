package Basic11; // 9012��
//��ȣ ���ڿ�(Parenthesis String, PS)�� �� ���� ��ȣ ��ȣ�� ��(�� �� ��)�� ������ �����Ǿ� �ִ� ���ڿ��̴�. �� �߿��� ��ȣ�� ����� �ٸ��� ������ ���ڿ��� �ùٸ� ��ȣ ���ڿ�(Valid PS, VPS)�̶�� �θ���. �� ���� ��ȣ ��ȣ�� �� ��( )�� ���ڿ��� �⺻ VPS �̶�� �θ���. ���� x �� VPS ��� �̰��� �ϳ��� ��ȣ�� ���� ���ο� ���ڿ� ��(x)���� VPS �� �ȴ�. �׸��� �� VPS x �� y�� ����(concatenation)��Ų ���ο� ���ڿ� xy�� VPS �� �ȴ�. ���� ��� ��(())()���� ��((()))�� �� VPS ������ ��(()(��, ��(())()))�� , �׸��� ��(()�� �� ��� VPS �� �ƴ� ���ڿ��̴�. 
//�������� �Է����� �־��� ��ȣ ���ڿ��� VPS ���� �ƴ����� �Ǵ��ؼ� �� ����� YES �� NO �� ��Ÿ����� �Ѵ�. 
//�Է� 
//�Է� �����ʹ� ǥ�� �Է��� ����Ѵ�. �Է��� T���� �׽�Ʈ �����ͷ� �־�����. �Է��� ù ��° �ٿ��� �Է� �������� ���� ��Ÿ���� ���� T�� �־�����. �� �׽�Ʈ �������� ù° �ٿ��� ��ȣ ���ڿ��� �� �ٿ� �־�����. �ϳ��� ��ȣ ���ڿ��� ���̴� 2 �̻� 50 �����̴�. 

import java.util.Scanner;
import java.util.Stack;

public class Main3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<T; i++) {
			Stack<Character> st = new Stack<>(); // ������ ����
			String A = sc.nextLine();
			boolean No = false;
			
			//���ÿ� �Է��� '(' ��� push ')' ��� pop ����
			for(int j=0; j<A.length(); j++) { 
				if(A.charAt(j) == '(') st.push('(');
				else if(A.charAt(j) == ')' && !st.empty()) st.pop(); // ������� �ʴٸ� pop
				// ����ִ� ���¿��� ')'��  VPS ���ڿ��� �ƴϹǷ�  break;
				else if(A.charAt(j) == ')' && st.empty()) {No = true; break;}
			}
			//������ ������ stack�� �����ִٸ� NO
			if(!st.empty()) No = true;
			
			if(No == false) System.out.println("YES");
			else System.out.println("NO");
		}
		sc.close();
	}
}
