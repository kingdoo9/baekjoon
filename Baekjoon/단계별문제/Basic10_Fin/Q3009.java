package Basic10_Fin; //Q3009

/*����
�� ���� �־����� ��, �࿡ ������ ���簢���� ����� ���ؼ� �ʿ��� �� ��° ���� ã�� ���α׷��� �ۼ��Ͻÿ�.

�Է�
�� ���� ��ǥ�� �� �ٿ� �ϳ��� �־�����. ��ǥ�� 1���� ũ�ų� ����, 1000���� �۰ų� ���� �����̴�.

���
���簢���� �� ��° ���� ��ǥ�� ����Ѵ�.

���� �Է� 1 
30 20
10 10
10 20
���� ��� 1 
30 10*/

import java.util.Scanner;

public class Q3009 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x[][] = new int[2][2];
		int y[][] = new int[2][2];
		
		int tmp;
		
		for(int i=0; i<3; i++) {
			tmp = scan.nextInt();
			if(x[0][0] == 0 || x[0][0] == tmp) {
				x[0][0] = tmp;
				x[0][1]++;
			}else {
				x[1][0] = tmp;
				x[1][1]++;
			}
			
			tmp = scan.nextInt();
			if(y[0][0] == 0 || y[0][0] == tmp) {
				y[0][0] = tmp;
				y[0][1]++;
			}else {
				y[1][0] = tmp;
				y[1][1]++;
			}
		}
		
		if(x[0][1] == 1) System.out.print(x[0][0] +" ");
		else System.out.print(x[1][0] +" ");
		if(y[0][1] == 1) System.out.print(y[0][0]);
		else System.out.print(y[1][0]);
		
		scan.close();
	}
}
