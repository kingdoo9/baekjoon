package Basic04; // 10817��
//�� ���� A, B, C�� �־�����. �� ��, �� ��°�� ū ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		
		if(A>=B) {
			if(A>=C) {
				if(B>=C) {
					System.out.println(B);
				}else {
					System.out.println(C);
				}
			}else System.out.println(A);
		}else if(A>=C) {
			System.out.println(A);
		}else if(B>=C) System.out.println(C);
		else System.out.println(B);
		
		scan.close();
	}
}
