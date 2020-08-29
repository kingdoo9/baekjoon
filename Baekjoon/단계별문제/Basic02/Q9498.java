package Basic02; // 9498번
//시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
import java.util.Scanner;

public class Q9498 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int Score = scan.nextInt();
		
		if(Score>=90 && Score <=100)System.out.println("A");
		else if(Score>=80 && Score <=89)System.out.println("B");
		else if(Score>=70 && Score <=79)System.out.println("C");
		else if(Score>=60 && Score <=69)System.out.println("D");
		else System.out.println("F");
		
		scan.close();
	}
}
