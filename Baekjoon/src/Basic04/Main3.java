package Basic04; // 10871��
//���� N���� �̷���� ���� A�� ���� X�� �־�����. �� ��, A���� X���� ���� ���� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int X = scan.nextInt();
		int temp;
		
		for(int i=0; i<N; i++) {
			temp = scan.nextInt();
			if(temp<X) {
				System.out.print(temp+" ");
			}
		}
		scan.close();
	}
}
