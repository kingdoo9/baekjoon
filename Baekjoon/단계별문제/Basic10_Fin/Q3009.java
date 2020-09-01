package Basic10_Fin; //Q3009

/*문제
세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램을 작성하시오.

입력
세 점의 좌표가 한 줄에 하나씩 주어진다. 좌표는 1보다 크거나 같고, 1000보다 작거나 같은 정수이다.

출력
직사각형의 네 번째 점의 좌표를 출력한다.

예제 입력 1 
30 20
10 10
10 20
예제 출력 1 
30 10*/

import java.util.Scanner;

public class Q3009 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x[][] = new int[2][2];
		int y[][] = new int[2][2];
		
		int tmp;
		
		for(int i=0; i<3; i++) {
			tmp = scan.nextInt();
			if(x[0][0] == 0 || x[0][0] == tmp) {
				x[0][0] = tmp;
				x[0][1]++;
			}else {
				x[1][0] = tmp;
				x[1][1]++;
			}
			
			tmp = scan.nextInt();
			if(y[0][0] == 0 || y[0][0] == tmp) {
				y[0][0] = tmp;
				y[0][1]++;
			}else {
				y[1][0] = tmp;
				y[1][1]++;
			}
		}
		
		if(x[0][1] == 1) System.out.print(x[0][0] +" ");
		else System.out.print(x[1][0] +" ");
		if(y[0][1] == 1) System.out.print(y[0][0]);
		else System.out.print(y[1][0]);
		
		scan.close();
	}
}
