package Basic7;
//예전에는 운영체제에서 크로아티아 알파벳을 입력할 수가 없었다. 따라서, 다음과 같이 크로아티아 알파벳을 다음과 같이 변경해서 입력했다.
//크로아티아 알파벳
//변경
//č
//c=
//ć
//c-
//dž
//dz=
//ñ
//d-
//lj
//lj
//nj
//nj
//š
//s=
//ž
//z=
//예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다. 단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
//dž는 무조건 하나의 알파벳으로 쓰이고, d와 ž가 분리된 것으로 보지 않는다. lj와 nj도 마찬가지이다. 위 목록에 없는 알파벳은 한 글자씩 센다.

import java.util.Scanner;

public class Main9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String word = scan.next();
		word = word + ' ';
		int count = word.length()-1;
		
		for(int i=0; i<word.length(); i++) {
			if(word.charAt(i) == 'c' && word.charAt(i+1) == '=') {count--; i++; continue;}
			if(word.charAt(i) == 'c' && word.charAt(i+1) == '-') {count--; i++; continue;}
			if(word.charAt(i) == 'd' && word.charAt(i+1) == 'z' && word.charAt(i+2) == '=') {count -= 2 ; i+=2; continue;}
			if(word.charAt(i) == 'd' && word.charAt(i+1) == '-') {count--; i++; continue;}
			if(word.charAt(i) == 'l' && word.charAt(i+1) == 'j') {count--; i++; continue;}
			if(word.charAt(i) == 'n' && word.charAt(i+1) == 'j') {count--; i++; continue;}
			if(word.charAt(i) == 's' && word.charAt(i+1) == '=') {count--; i++; continue;}
			if(word.charAt(i) == 'z' && word.charAt(i+1) == '=') {count--; i++; continue;}
		}
		
		System.out.println(count);
		
		scan.close();
	}
}