package Basic08_Fin; // 11720��
//N���� ���ڰ� ���� ���� �����ִ�. �� ���ڸ� ��� ���ؼ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
import java.util.Scanner;

public class Q11720 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int result = 0;
		int a = scan.nextInt();
		
		for(int i=1; i<=a; i++) {
			result += i;
		}
		
		System.out.println(result);
		scan.close();
		
	}
}
