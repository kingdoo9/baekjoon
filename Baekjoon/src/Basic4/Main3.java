package Basic4;
//정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이 때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int X = scan.nextInt();
		int temp;
		
		for(int i=0; i<N; i++) {
			temp = scan.nextInt();
			if(temp<X) {
				System.out.print(temp+" ");
			}
		}
		scan.close();
	}
}
