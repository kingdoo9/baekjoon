package Basic06_Fin; // 4344번
//대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 당신은 그들에게 슬픈 진실을 알려줘야 한다.
import java.util.Scanner;

public class Q4344 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int TC = scan.nextInt();
		int num, score[]; 
		double avr=0, result = 0;
		
		for(int i=0; i<TC; i++) {
			num = scan.nextInt();
			score = new int[num];
			
			for(int j=0; j<num; j++) {
				score[j] = scan.nextInt();
				avr += score[j];
			}
			avr /= num;
			
			for(int j=0; j<num; j++) {
				if(score[j] > avr) result++;
			}

			System.out.format("%.3f", (result/num)*100);
			System.out.println("%");
			avr = 0;
			result =0;
		}

		scan.close();
	}
}
