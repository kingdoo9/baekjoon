package Basic06_Fin; //Q10818

/*N���� ������ �־�����. �̶�, �ּڰ��� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� ������ ���� N (1 <= N <= 1,000,000)�� �־�����. ��° �ٿ��� N���� ������ �������� �����ؼ� �־�����. ��� ������ -1,000,000���� ũ�ų� ����, 1,000,000���� �۰ų� ���� �����̴�.

���
ù° �ٿ� �־��� ���� N���� �ּڰ��� �ִ��� �������� ������ ����Ѵ�.*/

import java.util.Scanner;

public class Q10818 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i = scan.nextInt();
		int max, min;
		
		int tmp = scan.nextInt();
		max = tmp;
		min = tmp;
		i--;
		
		for(; i>0; i--) {
			tmp = scan.nextInt();
			if(max<tmp) max = tmp;
			if(min>tmp) min = tmp;
		}
		
		System.out.println(min+" "+max);
		
		scan.close();
	}
}
