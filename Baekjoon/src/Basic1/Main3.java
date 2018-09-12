package Basic1;
//두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		System.out.println(A-B);
		scan.close();
	}
	
}