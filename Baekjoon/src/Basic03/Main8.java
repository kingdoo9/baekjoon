package Basic03; // 1924번
//오늘은 2007년 1월 1일 월요일이다. 그렇다면 2007년 x월 y일은 무슨 요일일까? 이를 알아내는 프로그램을 작성하시오.
import java.util.Scanner;

public class Main8 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String A[] = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		int B[] = {31,28,31,30,31,30,31,31,30,31,30};
		int Month = 0, Day=0, result=0;
		
		if(scan.hasNext()) Month = scan.nextInt();
		if(scan.hasNext()) Day = scan.nextInt();
		
		for(int i=1; i<Month; i++) {
			result = result + B[i-1];
		}
		
		result = (result + Day)%7;
		System.out.println(A[result]);
		
		scan.close();
		
	}
}
