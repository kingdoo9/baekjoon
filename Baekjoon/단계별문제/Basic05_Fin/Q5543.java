package Basic05_Fin; //Q5543

/*����
��ٳ��忡�� ���� �� �ȸ��� �޴��� ��Ʈ �޴��̴�. �ֹ��� ��, �ڽ��� ���ϴ� �ܹ��ſ� ���Ḧ �ϳ��� ���, ��Ʈ�� �����ϸ�, ������ �հ迡�� 50���� �� ������ ��Ʈ �޴��� ������ �ȴ�.

�ܹ��Ŵ� �� 3���� �������, �ߴ�����, �ϴ����Ű� �ְ�, ����� �ݶ�� ���̴� �� ������ �ִ�.

�ܹ��ſ� ������ ������ �־����� ��, ���� �� ��Ʈ �޴��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
�Է��� �� �ټ� ���̴�. ù° �ٿ��� �������, ��° �ٿ��� �ߴ�����, ��° �ٿ��� �ϴ������� ������ �־�����. ��° �ٿ��� �ݶ��� ����, �ټ�° �ٿ��� ���̴��� ������ �־�����. ��� ������ 100�� �̻�, 2000�� �����̴�.

���
ù° �ٿ� ���� �� ��Ʈ �޴��� ������ ����Ѵ�.*/

import java.util.Scanner;

public class Q5543 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int burger=2001, drink=2001;
		int tmp;
		for(int i=0; i<3; i++) {
			tmp = scan.nextInt();
			if(burger > tmp) burger = tmp;
		}
		for(int i=0; i<2; i++) {
			tmp = scan.nextInt();
			if(drink > tmp) drink = tmp;
		}
		
		System.out.println(burger + drink - 50);
		
		scan.close();
	}
}
