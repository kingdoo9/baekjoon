package Basic4;
//���л� ��������� 90%�� �ڽ��� �ݿ��� ����� �Ѵ´ٰ� �����Ѵ�. ����� �׵鿡�� ���� ������ �˷���� �Ѵ�.
import java.util.Scanner;

public class Main5 {
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
