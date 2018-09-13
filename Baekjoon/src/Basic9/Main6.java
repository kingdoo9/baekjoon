package Basic9; //1181번

//배열을 정렬하는 것은 쉽다. 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.
import java.util.Scanner;
import java.util.Arrays;

public class Main6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		String[] word = new String[N];
		
		for(int i=0; i<N; i++) {
			word[i] = scan.next();
		}
		
		Arrays.sort(word);
		
		//중복된 단어가 있으면 삭제하고 다시 정렬
		for(int i=0; i<N-1; i++) {
			if(word[i].matches(word[i+1])) {
				for(int j=i+1; j<N-1; j++) {
					word[j] = word[j+1];
				}
				N--;
				i--;
			}
		}
		
		for(int i=1; i<N; i++) { // 단어 길이 삽입정렬
			String temp = word[i];
			int key = word[i].length();
			int j;
			
			for(j=i-1; j>=0 && word[j].length()>key; j--) {
				word[j+1] = word[j];
			}
			word[j+1] = temp;
		}
		
		//출력
		for(int i=0; i<N; i++) {
			System.out.println(word[i]);
		}
		
		scan.close();
	}
}
