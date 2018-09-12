package Basic3;
//N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다
import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int X;
		X = scan.nextInt();
		
		for(int i=0; i<9; i++) {
			System.out.println(X+" * "+(i+1)+" = "+X*(i+1));
		}
		scan.close();
	}
}
