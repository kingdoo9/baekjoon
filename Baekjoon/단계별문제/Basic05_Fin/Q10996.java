package Basic05_Fin; //Q10996

/*문제
예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
예제 입력 1 
1
예제 출력 1 
*
예제 입력 2 
2
예제 출력 2 
*
 *
*
 *
예제 입력 3 
3
예제 출력 3 
* *
 *
* *
 *
* *
 *
예제 입력 4 
4
예제 출력 4 
* *
 * *
* *
 * *
* *
 * *
* *
 * *
*/

import java.util.Scanner;

public class Q10996 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		if(n==1) System.out.println("* ");
		else {
			for(int i=1; i<=2*n; i++) {
				if(i%2 == 0) {
					System.out.print(" ");
					for(int j=1; j<n; j+=2) System.out.print("* ");
				}else {
					for(int j=0; j<n; j+=2) System.out.print("* ");
				}

				System.out.println();
			}
		}
		
		scan.close();
	}
}
