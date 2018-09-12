package Basic4;
//세 정수 A, B, C가 주어진다. 이 때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오. 
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
