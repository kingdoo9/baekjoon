package Basic08_Fin; //1316번
//그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
//단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.


import java.util.Scanner;

public class Q1316 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int count = scan.nextInt();
		int group = 0, result = count;
		
		for(int i=0; i< count; i++) {
			String word = scan.next();
			int alpa[] = new int[26];
			
			for(int j=0; j<word.length(); j++) {
				if(alpa[word.charAt(j) - 'a'] == 0) {
					alpa[word.charAt(j) - 'a']++;
					group = word.charAt(j);
					continue;
				}else if(alpa[word.charAt(j) - 'a'] != 0 && group == word.charAt(j)) {
					alpa[word.charAt(j) - 'a']++;
					continue;
				}else {
					result--;
					break;
				}
			}
		}
		
		System.out.println(result);
		scan.close();
	}
}
