package Q10000; // 10988��
//���ĺ� �ҹ��ڷθ� �̷���� �ܾ �־�����. �̶�, �� �ܾ �Ӹ�������� �ƴ��� Ȯ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//�Ӹ�����̶� ������ ���� ���� �Ųٷ� ���� �� �Ȱ��� �ܾ ���Ѵ�. 
//level, noon�� �Ӹ�����̰�, baekjoon, online, judge�� �Ӹ������ �ƴϴ�.
//�Է� 
//ù° �ٿ� �ܾ �־�����. �ܾ��� ���̴� 1���� ũ�ų� ����, 100���� �۰ų� ������, ���ĺ� �ҹ��ڷθ� �̷���� �ִ�.
//��� 
//ù° �ٿ� �Ӹ�����̸� 1, �ƴϸ� 0�� ����Ѵ�.

import java.util.Scanner;

public class Q10988 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String word = sc.nextLine();
		boolean Pal = true;
		
		//�տ��� �Ѱ��� �ڿ����Ѱ��� �ٸ��� ��������
		for(int i=0, j = word.length()-1; i<j; i++, j--) { 
			if(word.charAt(i) != word.charAt(j)) {Pal = false; break;}
		}
		
		
		if(Pal) System.out.println("1");
		else System.out.println("0");
		
		sc.close();
	}
}
