package Basic3; // 8393��
//n�� �־����� ��, 1���� n���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
import java.util.Scanner;

public class Main9 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		char B[] = {};
		int result = 0;
		
		B=scan.next().toCharArray();
		
		for(int i=0; i<A; i++) {
		result += B[i]-48;
		}
		
		System.out.println(result);
		scan.close();
		
	}
}
