package Basic07; //1157��
//���ĺ� ��ҹ��ڷ� �� �ܾ �־�����, �� �ܾ�� ���� ���� ���� ���ĺ��� �������� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�. ��, �빮�ڿ� �ҹ��ڸ� �������� �ʴ´�.

import java.util.Scanner;

public class Main4 {
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
