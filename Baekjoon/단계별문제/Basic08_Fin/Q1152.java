package Basic08_Fin; // 1152번
//영어 대소문자와 띄어쓰기만으로 이루어진 문장이 주어진다. 이 문장에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오.
import java.util.Scanner;

public class Q1152 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String word = new String();
		word = scan.nextLine();
		
		int space = 0;
		
		if(word.charAt(0) == ' ') space--;
		if(word.charAt(word.length()-1) == ' ')space--;
			
		for(int i =0 ; i<word.length(); i++) {
			if( word.charAt(i) == ' ') {
				space = space + 1;
			}
		}
		
		

		System.out.println(space+1);
		
		scan.close();
	}
}
