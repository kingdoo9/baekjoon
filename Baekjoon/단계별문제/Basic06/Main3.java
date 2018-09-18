package Basic06; // 8958번
//"OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 예를 들어, 10번 문제의 점수는 3이 된다.
//"OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
//OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.
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
