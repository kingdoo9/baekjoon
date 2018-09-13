package Basic7; //10809번

//알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String A = scan.nextLine();	
		int Alpa[] = new int[26];
		
		for(int i=0; i<26; i++) {
			Alpa[i] = -1;
		}
		
		for(int i=0; i<A.length(); i++) {
			if(Alpa[A.charAt(i)-97] == -1) {
				Alpa[A.charAt(i)-97]= i;
			}
		}
		
		for(int i=0; i<26; i++) {
			System.out.print(Alpa[i] +" ");
		}
		
		scan.close();
	}
}
