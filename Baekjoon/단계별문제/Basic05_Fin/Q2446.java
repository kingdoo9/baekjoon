package Basic05_Fin; //Q2523

/*����
������ ���� ��Ģ�� ������ �ڿ� ���� ��� ������.
���� ��� 1 
n=5
*********
 *******
  *****
   ***
    *
   ***
  *****
 *******
*********
*/

import java.util.Scanner;

public class Q2446 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i = 0; i<n; i++) { //���� ������ �����ϸ鼭 ���� ����.
			for(int j = 0; j<i; j++) System.out.print(" ");
			for(int j = 2*(n-i)-1; j>0; j--) System.out.print("*");
			System.out.println();
		}
		
		for(int i = n-1; i>0; i--) { //���� ������ �����ϸ鼭 ���� ����.
			for(int j = 1; j<i; j++) System.out.print(" ");
			for(int j = 2*(n-i+1)-1; j>0; j--) System.out.print("*");
			System.out.println();
		}
		
		scan.close();
	}
}
