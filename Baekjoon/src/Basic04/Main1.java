package Basic04; // 9498��
//���� ������ �Է¹޾� 90 ~ 100���� A, 80 ~ 89���� B, 70 ~ 79���� C, 60 ~ 69���� D, ������ ������ F�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
import java.util.Scanner;

public class Main1 {
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
