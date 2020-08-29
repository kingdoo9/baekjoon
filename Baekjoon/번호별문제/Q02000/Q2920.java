package Q02000; // 2920번
//다장조는 c d e f g a b C, 총 8개 음으로 이루어져있다. 이 문제에서 8개 음은 다음과 같이 숫자로 바꾸어 표현한다. c는 1로, d는 2로, ..., C를 8로 바꾼다.
//1부터 8까지 차례대로 연주한다면 ascending, 8부터 1까지 차례대로 연주한다면 descending, 둘 다 아니라면 mixed 이다.
//연주한 순서가 주어졌을 때, 이것이 ascending인지, descending인지, 아니면 mixed인지 판별하는 프로그램을 작성하시오.
import java.util.Scanner;

public class Q2920 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int Code[] = new int[8];
		int D =0;
			
		for(int i =0; i<8; i++) {
			Code[i] = scan.nextInt();
		}
		
		
		for(int i =0; i<7 ; i++) {
			if(Code[i] == Code[i+1]-1) {
				D = 1;
			}else if(Code[i] == Code[i+1]+1) {
				D = 2;
			}else { D = 0; break;}
		}
		
		if(D == 0) System.out.println("mixed");
		if(D == 1) System.out.println("ascending");
		if(D == 2) System.out.println("descending");
		
		scan.close();
	}
}
