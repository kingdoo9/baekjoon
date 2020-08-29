package Basic08_Fin; //1157번
//알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.

import java.util.Scanner;

public class Q1157 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String word = scan.nextLine();
		int alpa[] = new int[26];
		int big=0, same=0;
		
		for(int i=0; i<word.length(); i++) {
			if(word.charAt(i)<='z' && word.charAt(i)>='a') {
				alpa[word.charAt(i)-97]++ ;
			}else alpa[word.charAt(i)-65]++;
		}
		
		for(int i=0; i<26; i++) {
			if(alpa[i] > big) {
				big = alpa[i];
			}else if(alpa[i] == big) {
				same = big;
			}
		}
		
		for(int i=0; i<26; i++) {
			if(same == big) { System.out.println("?"); break;}
			else if(alpa[i] == big) {System.out.println((char)('A'+i)); break;}
		}
		scan.close();
	}
}
