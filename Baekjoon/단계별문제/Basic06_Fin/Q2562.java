package Basic06_Fin; // Q2562


/*����
9���� ���� �ٸ� �ڿ����� �־��� ��, �̵� �� �ִ��� ã�� �� �ִ��� �� ��° �������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

���� ���, ���� �ٸ� 9���� �ڿ���

3, 29, 38, 12, 57, 74, 40, 85, 61

�� �־�����, �̵� �� �ִ��� 85�̰�, �� ���� 8��° ���̴�.

�Է�
ù ° �ٺ��� ��ȩ ��° �ٱ��� �� �ٿ� �ϳ��� �ڿ����� �־�����. �־����� �ڿ����� 100 ���� �۴�.

���
ù° �ٿ� �ִ��� ����ϰ�, ��° �ٿ� �ִ��� �� ��° �������� ����Ѵ�.*/

import java.util.Scanner;

public class Q2562 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int max = 0;
		int pos = 0;
		int tmp;
		
		for(int i=1; i<=9; i++) {
			tmp = scan.nextInt();
			if(max<tmp) {
				max = tmp;
				pos = i;
			}
		}
		
		System.out.println(max);
		System.out.println(pos);
		
		scan.close();
	}
}
