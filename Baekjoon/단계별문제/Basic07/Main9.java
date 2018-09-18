package Basic07; //2941ë²?
//?˜ˆ? „?—?Š” ?š´?˜ì²´ì œ?—?„œ ?¬ë¡œì•„?‹°?•„ ?•Œ?ŒŒë²³ì„ ?ž…? ¥?•  ?ˆ˜ê°? ?—†?—ˆ?‹¤. ?”°?¼?„œ, ?‹¤?Œê³? ê°™ì´ ?¬ë¡œì•„?‹°?•„ ?•Œ?ŒŒë²³ì„ ?‹¤?Œê³? ê°™ì´ ë³?ê²½í•´?„œ ?ž…? ¥?–ˆ?‹¤.
//?¬ë¡œì•„?‹°?•„ ?•Œ?ŒŒë²?
//ë³?ê²?
//Ä
//c=
//Ä‡
//c-
//dÅ¾
//dz=
//Ã±
//d-
//lj
//lj
//nj
//nj
//Å¡
//s=
//Å¾
//z=
//?˜ˆë¥? ?“¤?–´, ljes=njak?? ?¬ë¡œì•„?‹°?•„ ?•Œ?ŒŒë²? 6ê°?(lj, e, Å¡, nj, a, k)ë¡? ?´ë£¨ì–´? ¸ ?žˆ?‹¤. ?‹¨?–´ê°? ì£¼ì–´ì¡Œì„ ?•Œ, ëª? ê°œì˜ ?¬ë¡œì•„?‹°?•„ ?•Œ?ŒŒë²³ìœ¼ë¡? ?´ë£¨ì–´? ¸ ?žˆ?Š”ì§? ì¶œë ¥?•œ?‹¤.
//dÅ¾?Š” ë¬´ì¡°ê±? ?•˜?‚˜?˜ ?•Œ?ŒŒë²³ìœ¼ë¡? ?“°?´ê³?, d?? Å¾ê°? ë¶„ë¦¬?œ ê²ƒìœ¼ë¡? ë³´ì? ?•Š?Š”?‹¤. lj?? nj?„ ë§ˆì°¬ê°?ì§??´?‹¤. ?œ„ ëª©ë¡?— ?—†?Š” ?•Œ?ŒŒë²³ì? ?•œ ê¸??ž?”© ?„¼?‹¤.

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