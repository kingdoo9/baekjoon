package Basic05_Fin; //Q10996

/*����
������ ���� ��Ģ�� ������ �ڿ� ���� ��� ������.
���� �Է� 1 
1
���� ��� 1 
*
���� �Է� 2 
2
���� ��� 2 
*
 *
*
 *
���� �Է� 3 
3
���� ��� 3 
* *
 *
* *
 *
* *
 *
���� �Է� 4 
4
���� ��� 4 
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
