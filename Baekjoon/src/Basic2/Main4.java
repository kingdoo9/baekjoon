package Basic2; // 1008번
//두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.

import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double A = scan.nextInt();
		double B = scan.nextInt();
		
		System.out.println(A/B);
		
		scan.close();
	}
	
}