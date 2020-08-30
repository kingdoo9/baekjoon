package Basic06_Fin; // Q3052

/*�� �ڿ��� A�� B�� ���� ��, A%B�� A�� B�� ���� ������ �̴�. ���� ���, 7, 14, 27, 38�� 3���� ���� �������� 1, 2, 0, 2�̴�. 

�� 10���� �Է¹��� ��, �̸� 42�� ���� �������� ���Ѵ�. �� ���� ���� �ٸ� ���� �� �� �ִ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٺ��� ����° �� ���� ���ڰ� �� �ٿ� �ϳ��� �־�����. �� ���ڴ� 1,000���� �۰ų� ����, ���� �ƴ� �����̴�.

���
ù° �ٿ�, 42�� �������� ��, ���� �ٸ� �������� �� �� �ִ��� ����Ѵ�.
*/
import java.util.Scanner;

public class Q3052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[] A = new boolean[42];
		int tmp;
		int count = 0;
		
		for(int i=0; i<10; i++) {
			tmp = sc.nextInt();
			if(A[tmp%42] == false) {
				A[tmp%42] = true;
				count++;
			}
		}
		
		System.out.println(count);
		
		sc.close();
	}
}
