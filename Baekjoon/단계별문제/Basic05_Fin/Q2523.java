package Basic05_Fin; //Q2523

/*문제
예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
예제 출력 1 
n=3
*
**
***
**
*
*/

import java.util.Scanner;

public class Q2523 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i=1; i<=n; i++) { //증가하면서 *을 찍음.
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=n-1; i>0; i--) { //감소하면서 *을 찍음.
			for(int j=i; j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		scan.close();
	}
}
