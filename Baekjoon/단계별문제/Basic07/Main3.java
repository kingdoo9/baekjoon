package Basic07; //2675��

//���ڿ� S�� �Է¹��� �Ŀ�, �� ���ڸ� R�� �ݺ��� �� ���ڿ� T�� ���� �� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//�ٽ� �������ڸ�, ù ��° ���ڸ� R�� �ݺ��ϰ�, �� ��° ���ڸ� R�� �ݺ��ϴ� ������ T�� ����� �ȴ�. S���� QR Code "alphanumeric" ���ڸ� ����ִ�.
//QR Code "alphanumeric" ���ڴ� 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ$%*+-./: �̴�.
import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		for(int i=0; i<T; i++) {	
			int R = scan.nextInt();
			String A = scan.next();
			
			for(int j=0; j<A.length(); j++) {
			
				for(int k=0; k<R; k++) {
					System.out.print(A.charAt(j));
				
				}
			}
			System.out.println();
		
		}
		scan.close();
	}
}
