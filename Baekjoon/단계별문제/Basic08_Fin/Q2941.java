package Basic08_Fin; //2941�?
//?��?��?��?�� ?��?��체제?��?�� ?��로아?��?�� ?��?��벳을 ?��?��?�� ?���? ?��?��?��. ?��?��?��, ?��?���? 같이 ?��로아?��?�� ?��?��벳을 ?��?���? 같이 �?경해?�� ?��?��?��?��.
//?��로아?��?�� ?��?���?
//�?�?
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
//?���? ?��?��, ljes=njak?? ?��로아?��?�� ?��?���? 6�?(lj, e, š, nj, a, k)�? ?��루어?�� ?��?��. ?��?���? 주어졌을 ?��, �? 개의 ?��로아?��?�� ?��?��벳으�? ?��루어?�� ?��?���? 출력?��?��.
//dž?�� 무조�? ?��?��?�� ?��?��벳으�? ?��?���?, d?? ž�? 분리?�� 것으�? 보�? ?��?��?��. lj?? nj?�� 마찬�?�??��?��. ?�� 목록?�� ?��?�� ?��?��벳�? ?�� �??��?�� ?��?��.

import java.util.Scanner;

public class Q2941 {
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