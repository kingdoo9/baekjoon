package Basic3;
//���ĺ� �ҹ��ڿ� �빮�ڷθ� �̷���� ���̰� N�� �ܾ �־�����.
//�� �ٿ� 10���ھ� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
import java.util.Scanner;

public class Main11 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		char B[] = scan.next().toCharArray();
		int Ten = 0;
		
		for(int i=0; i<B.length;i++) {
			System.out.print(B[i]);
			Ten++;
			if(Ten == 10) {
				System.out.println();
				Ten = 0;
			}
		}
		scan.close();
	}
}
