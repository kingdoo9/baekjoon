package Basic08_Fin; //11654��
//���ĺ� �ҹ���, �빮��, ���� 0-9�� �ϳ��� �־����� ��, �־��� ������ �ƽ�Ű �ڵ尪�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
import java.util.Scanner;

public class Q11654 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String A = scan.next();	
		System.out.println(A.codePointAt(0));
		scan.close();
	}
}
