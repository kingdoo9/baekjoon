package Basic9; //2750번
//N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int Sort[] = new int[N];
		
		for(int i=0; i<N; i++) {
			Sort[i] = scan.nextInt();
		}
		
		for(int i=0; i<N-1; i++) { // 선택정렬
			int temp;
			int least = i;
			
			for(int j=i+1; j<N; j++) {
				if(Sort[j] < Sort[least]) least = j;
			}
			temp = Sort[i];
			Sort[i] = Sort[least];
			Sort[least] = temp;
			
			System.out.println(Sort[i]);
		}
		
		System.out.println(Sort[N-1]);
		
		scan.close();
	}
}
