package Basic10_Fin; //Q1085

/*����
�Ѽ��� ���� (x, y)�� �ִ�. ���簢���� ���� �Ʒ� �������� (0, 0)�� �ְ�, ������ �� �������� (w, h)�� �ִ�. ���簢���� ��輱���� ���� �Ÿ��� �ּڰ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� x y w h�� �־�����. w�� h�� 1,000���� �۰ų� ���� �ڿ����̰�, x�� 1���� ũ�ų� ����, w-1���� �۰ų� ���� �ڿ����̰�, y�� 1���� ũ�ų� ����, h-1���� �۰ų� ���� �ڿ����̴�.

���
ù° �ٿ� ������ ������ ����Ѵ�.*/

import java.util.Scanner;

public class Q1085 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		int w = scan.nextInt();
		int h = scan.nextInt();
		int min = 1000;
		
		if(min > x) min = x;
		if(min > y) min = y;
		if(min > (w-x)) min = (w-x);
		if(min > (h-y)) min = (h-y);
		
		System.out.println(min);
		
		
		scan.close();
	}
}
