package Basic4; // 1546��
//�����̴� �⸻��縦 ���ƴ�. �����̴� ������ �����ؼ� ���� ��������� �ߴ�. �ϴ� �����̴� �ڱ� ���� �߿� �ִ밪�� �����. �� ���� M�̶�� �Ѵ�. �׸��� ���� ��� ������ ����/M*100���� ���ƴ�.
//���� ���, �������� �ְ����� 70�̰�, ���������� 50�̾����� ���������� 50/70*100�� �Ǿ� 71.43���� �ȴ�.
//�������� ������ ���� ������ ���� ������� ��, ���ο� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
import java.util.Arrays;
import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int M;
		double result = 0;
		double arr[] = new double[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = scan.nextInt();
		}
		
		Arrays.sort(arr);
		M = (int)arr[N-1];
		
		for(int i=0; i<N; i++) {
			arr[i] = arr[i]/M*100;
			result += arr[i];
		}
		
		result = result/N;
		
		System.out.println(result);
		
		scan.close();
	}
}
