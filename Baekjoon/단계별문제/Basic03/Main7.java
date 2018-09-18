package Basic03; // 2441번
//첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제
//하지만, 오른쪽을 기준으로 정렬한 별 (예제 참고)을 출력하시오.
import java.util.Scanner;

public class Main7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int X, temp;
		X = scan.nextInt();
		temp = X;
		
		while(temp>0) {
			for(int i=0; i<X-temp;i++) {
				System.out.print(" ");
			}
			for(int i=temp; i>0; i--) {
				System.out.print("*");
			}
			System.out.println();
			temp = temp-1;
		}
		scan.close();
	}
}
