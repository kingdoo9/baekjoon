package Basic09_Fin; //Q2869

/*����
�� ���� �����̰� �ִ�. �� �����̴� ���̰� V������ ���� ���븦 �ö� ���̴�.

�����̴� ���� A���� �ö� �� �ִ�. ������, �㿡 ���� �ڴ� ���� B���� �̲�������. ��, ���� �ö� �Ŀ��� �̲������� �ʴ´�.

�����̰� ���� ���븦 ��� �ö󰡷���, ��ĥ�� �ɸ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� �� ���� A, B, V�� �������� ���еǾ �־�����. (1 <= B < A <= V <= 1,000,000,000)

���
ù° �ٿ� �����̰� ���� ���븦 ��� �ö󰡴µ� ��ĥ�� �ɸ����� ����Ѵ�.*/

import java.util.Scanner;

public class Q2869 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int V = scan.nextInt();
		int num=(V-B)/(A-B);
		if((V-B)%(A-B) != 0) num++;
		
		System.out.println(num);
		scan.close();
	}
}
