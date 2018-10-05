package Basic15; // 1676번
//N!에서 뒤에서부터 처음 0이 아닌 숫자가 나올 때까지 0의 개수를 구하는 프로그램을 작성하시오.
//입력 
//첫째 줄에 N이 주어진다. (0 ≤ N ≤ 500)
//출력 
//첫째 줄에 구한 0의 개수를 출력한다.

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		//팩토리얼 0의 개수는 5를 몇번나누냐에따라 개수가 나뉜다. 25는 5의 거듭제곱으로 한번더 더해준다.
		N = (N/5) + (N/25)+ (N/125);
		
		System.out.println(N);
		
		sc.close();
	}
}

