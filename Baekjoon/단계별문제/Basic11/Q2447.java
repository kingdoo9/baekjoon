package Basic11; //Q2447

/*문제
재귀적인 패턴으로 별을 찍어 보자. N이 3의 거듭제곱(3, 9, 27, ...)이라고 할 때, 크기 N의 패턴은 N×N 정사각형 모양이다.

크기 3의 패턴은 가운데에 공백이 있고, 가운데를 제외한 모든 칸에 별이 하나씩 있는 패턴이다.

***
* *
***
N이 3보다 클 경우, 크기 N의 패턴은 공백으로 채워진 가운데의 (N/3)×(N/3) 정사각형을 크기 N/3의 패턴으로 둘러싼 형태이다. 예를 들어 크기 27의 패턴은 예제 출력 1과 같다.

입력
첫째 줄에 N이 주어진다. N은 3의 거듭제곱이다. 즉 어떤 정수 k에 대해 N=3k이며, 이때 1 ≤ k < 8이다.

출력
첫째 줄부터 N번째 줄까지 별을 출력한다.

예제 입력 1 
27
예제 출력 1 
***************************
* ** ** ** ** ** ** ** ** *
***************************
***   ******   ******   ***
* *   * ** *   * ** *   * *
***   ******   ******   ***
***************************
* ** ** ** ** ** ** ** ** *
***************************
*********         *********
* ** ** *         * ** ** *
*********         *********
***   ***         ***   ***
* *   * *         * *   * *
***   ***         ***   ***
*********         *********
* ** ** *         * ** ** *
*********         *********
***************************
* ** ** ** ** ** ** ** ** *
***************************
***   ******   ******   ***
* *   * ** *   * ** *   * *
***   ******   ******   ***
***************************
* ** ** ** ** ** ** ** ** *
****************************/

import java.util.Arrays;
import java.util.Scanner;

public class Q2447 {
	static char arr[][]; //n크기만큼 2차원 배열을 생성한다.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n= sc.nextInt();
		arr = new char[n][n];
		for(int i=0;i<arr.length;i++) {
			Arrays.fill(arr[i],' ');
		}
		printstar(0,0,n);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		sc.close();
	}
	public static void printstar(int a,int b,int n) { // 재귀호출을 반복 할 메소드이다.
		int div = 0;
		if(n==1) { // 재귀 호출이 끝나는 부분
			arr[a][b] = '*';
			return;
		}
		
		div= n/3; // 입력받은 n 값을 계속 3씩 나눠준다.
		
		for(int i=0;i<3;i++) { //3x3크기의 별을 만든다.
			for(int j=0;j<3;j++) {
				if(i==1 && j ==1) continue;
				printstar(a+(div*i),b+(div*j),div);
			}
		}
	        
	}
}
