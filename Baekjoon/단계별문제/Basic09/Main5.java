package Basic09; //1427��

//�迭�� �����ϴ� ���� ����. ���� �־�����, �� ���� �� �ڸ����� ������������ �����غ���.
import java.util.Scanner;
import java.util.Arrays;

public class Main5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double N = scan.nextInt();
		double N1 = N;
		int i;
		
		// �迭������ �˱����� �ڸ��� ����
		for(i=1; (int)N1>0; i++) N1 /= 10;
		
		//�ڸ�����ŭ �迭 �Ҵ�
		int[] sort = new int[i];

		// �迭�� �� �ڸ��� ����
		for(i=0; (int)N>0; i++) {
			sort[i] = (int) (N%10);
			N /= 10;
		}
		
		Arrays.sort(sort);
		
		// ��������
		for(; i>0; i--) {
			System.out.print(sort[i]);
		}
		
		scan.close();
	}
}
