package Basic03_Fin; // 11022��
//�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//�Է� 
//ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����.
//�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
//��� 
//�� �׽�Ʈ ���̽����� "Case #x: A + B = C" �������� ����Ѵ�. x�� �׽�Ʈ ���̽� ��ȣ�̰� 1���� �����ϸ�, C�� A+B�̴�.
import java.util.Scanner;

public class Q11022 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		
		for(int i=0; i<T; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			System.out.println("Case #"+(i+1)+": "+A+" + "+B+" = "+(A+B));
		
		}
		
		sc.close();
	}
}
