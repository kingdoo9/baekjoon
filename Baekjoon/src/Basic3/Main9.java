package Basic3;
//n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
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
