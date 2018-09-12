package Basic3;
//N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
import java.util.Scanner;

public class Main10 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int result = 0;
		int a = scan.nextInt();
		
		for(int i=1; i<=a; i++) {
			result += i;
		}
		
		System.out.println(result);
		scan.close();
		
	}
}
