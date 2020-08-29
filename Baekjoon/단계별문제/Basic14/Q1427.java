package Basic14; //1427번

//배열을 정렬하는 것은 쉽다. 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.
import java.util.Scanner;
import java.util.Arrays;

public class Q1427 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double N = scan.nextInt();
		double N1 = N;
		int i;
		
		// 배열개수를 알기위한 자리수 지정
		for(i=1; (int)N1>0; i++) N1 /= 10;
		
		//자릿수만큼 배열 할당
		int[] sort = new int[i];

		// 배열에 각 자리수 지정
		for(i=0; (int)N>0; i++) {
			sort[i] = (int) (N%10);
			N /= 10;
		}
		
		Arrays.sort(sort);
		
		// 내림차순
		for(; i>0; i--) {
			System.out.print(sort[i]);
		}
		
		scan.close();
	}
}
