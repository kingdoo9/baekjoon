package Basic03_Fin; // 2742번
//자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
import java.util.Scanner;

public class Q2742 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int X;
		X = scan.nextInt();
		
		for(int i=X; i>0; i--) {
			System.out.println(i);
		}
		scan.close();
	}
}
