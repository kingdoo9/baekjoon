package Basic6; // 8958��
//"OOXXOXXOOO"�� ���� OX������ ����� �ִ�. O�� ������ ���� ���̰�, X�� ������ Ʋ�� ���̴�. ������ ���� ��� �� ������ ������ �� �������� ���ӵ� O�� ������ �ȴ�. ���� ���, 10�� ������ ������ 3�� �ȴ�.
//"OOXXOXXOOO"�� ������ 1+2+0+0+1+0+0+1+2+3 = 10���̴�.
//OX������ ����� �־����� ��, ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int TestCase = scan.nextInt();
		int result;
		
		String Quiz = new String();
		
		for(int i=0; i<TestCase; i++) {
			Quiz = scan.next();
			result = score(Quiz);
			System.out.println(result);
		}
		scan.close();
	}
	
	public static int score(String quiz) {
		int add = 1;
		int score=0;
		
		for(int i=0; i<quiz.length();i++) {
			if(quiz.charAt(i)=='O') {
				score += add;
				add++;
			}
			if(quiz.charAt(i)=='X') add = 1;
		}
		return score;
	}
}
