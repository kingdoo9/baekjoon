package Basic3; // 2739��
//N�� �Է¹��� ��, ������ N���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ��� ���Ŀ� ���缭 ����ϸ� �ȴ�
import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int X;
		X = scan.nextInt();
		
		for(int i=0; i<9; i++) {
			System.out.println(X+" * "+(i+1)+" = "+X*(i+1));
		}
		scan.close();
	}
}
