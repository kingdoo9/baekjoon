package Basic02; // 10430��
//(A+B)%C�� (A%C + B%C)%C �� ������?
//(A��B)%C�� (A%C �� B%C)%C �� ������?
//�� �� A, B, C�� �־����� ��, ���� �װ��� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
import java.util.Scanner;

public class Main6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		
		System.out.println((A+B)%C);
		System.out.println((A%C + B%C)%C);
		System.out.println((A*B)%C);
		System.out.println((A%C * B%C)%C);
		scan.close();
	}	
}