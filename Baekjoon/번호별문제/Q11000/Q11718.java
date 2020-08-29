package Q11000; // 11718번
//입력 받은 대로 출력하는 프로그램을 작성하시오.

import java.util.Scanner;

public class Q11718 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String Text;	
		
		while(scan.hasNextLine()) {
			Text = scan.nextLine();
			System.out.println(Text);
		}
		scan.close();
	}	
}