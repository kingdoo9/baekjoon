package Basic03; // 11721번
//알파벳 소문자와 대문자로만 이루어진 길이가 N인 단어가 주어진다.
//한 줄에 10글자씩 끊어서 출력하는 프로그램을 작성하시오.
import java.util.Scanner;

public class Main11 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		char B[] = scan.next().toCharArray();
		int Ten = 0;
		
		for(int i=0; i<B.length;i++) {
			System.out.print(B[i]);
			Ten++;
			if(Ten == 10) {
				System.out.println();
				Ten = 0;
			}
		}
		scan.close();
	}
}
