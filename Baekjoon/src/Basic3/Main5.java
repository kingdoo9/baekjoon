package Basic3;
//첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
//하지만, 오른쪽을 기준으로 정렬한 별 (예제 참고)을 출력하시오.
import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int X, temp;
		X = scan.nextInt();
		temp = X-1;
		
		while(temp>-1) {
			for(int i=temp; i>0; i--) {
				System.out.print(" ");
			}
			for(int i=0; i<X-temp;i++) {
				System.out.print("*");
			}
			System.out.println();
			temp = temp-1;
		}
		scan.close();
	}
}
