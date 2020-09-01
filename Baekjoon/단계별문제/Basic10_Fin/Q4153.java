package Basic10_Fin; //Q4153

/*���� ����Ʈ�ε��� �� ������ ���̰� 3, 4, 5�� �ﰢ���� ���� �ﰢ���ΰ��� �˾Ƴ´�. �־��� ������ ���̷� �ﰢ���� �������� �ƴ��� �����Ͻÿ�.

�Է�
�Է��� �������� �׽�Ʈ���̽��� �־����� �������ٿ��� 0 0 0�� �Էµȴ�. �� �׽�Ʈ���̽��� ��� 30,000���� ���� ���� ������ �־�����, �� �Է��� ���� ���̸� �ǹ��Ѵ�.

���
�� �Է¿� ���� ���� �ﰢ���� �´ٸ� "right", �ƴ϶�� "wrong"�� ����Ѵ�.

���� �Է� 1 
6 8 10
25 52 60
5 12 13
0 0 0
���� ��� 1 
right
wrong
right*/

import java.util.Scanner;

public class Q4153 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String ans = "wrong";
		int tmp;
		
		while(true) {
			int A = scan.nextInt();
			int B = scan.nextInt();
			int C = scan.nextInt();
			
			if(A == 0 && B == 0 && C == 0) break;
			
			if(A>C) {
				tmp = A;
				A = C;
				C = tmp;
			}
			if(B>C) {
				tmp = B;
				B = C;
				C = tmp;
			}
			
			
			if(((A*A) + (B*B)) == (C*C)) ans = "right";
			
			System.out.println(ans);
            ans = "wrong";
		}
		
		scan.close();
	}
}
