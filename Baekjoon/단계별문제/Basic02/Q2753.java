package Basic02; // 2753번
//연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
//윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때 이다.
//예를들어, 2012년은 4의 배수라서 윤년이지만, 1900년은 4의 배수이지만, 100의 배수이기 때문에 윤년이 아니다.
//하지만, 2000년은 400의 배수이기 때문에 윤년이다.
//입력 
//첫째 줄에 연도가 주어진다. 연도는 1보다 크거나 같고, 4000보다 작거나 같은 자연수이다.
//출력 
//첫째 줄에 윤년이면 1, 아니면 0을 출력한다.

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q2753 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("00"); // 4 를 04로 바꿔줌
		
		int N = sc.nextInt();
		int[] months = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		int y=2014, m=4, d=1;
		
		d += N; //일수에 입력받은 값을 더하고 월일수마다 빼주는 방식
		
		while(months[m] < d) { 
			if(y%4==0 && (y%100!=0 || y%400==0)) months[2] = 29; //윤달계산
			else months[2] = 28;
			
			d -= months[m];
			if(m==12) { y++; m=0;} //12월이 지나면 년도를 늘리고 월을 1로
			m++;
			
		}
		
		System.out.println(y +"-"+ df.format(m) +"-"+ df.format(d));
		
		
		sc.close();
	}
}
